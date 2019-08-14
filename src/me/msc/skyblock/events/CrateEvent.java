package me.msc.skyblock.events;

import me.msc.skyblock.Main;
import me.msc.skyblock.crate.CrateData;
import me.msc.skyblock.misc.Message;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;

import java.util.ArrayList;
import java.util.Random;

public class CrateEvent implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void CrateEvent(PlayerInteractEvent e){


        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_BLOCK){
            if(e.getClickedBlock().getType().equals(Material.CHEST)){

                //Get Items from main hand and off hand
                ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
                ItemStack itemOff = e.getPlayer().getInventory().getItemInOffHand();
                Boolean usingOff = false;

                //Check if using Chest Creation tool
                if (itemOff != null && !itemOff.getType().equals(Material.AIR) && itemOff.hasItemMeta() && itemOff.getItemMeta().getDisplayName() != null && itemOff.getItemMeta().hasLore()){
                    item = itemOff;
                    usingOff = true;
                }

                if (item != null && !item.getType().equals(Material.AIR) && item.hasItemMeta() && item.getItemMeta().getDisplayName() != null && item.getItemMeta().getDisplayName().equals("Vote Crate Creator") && item.getItemMeta().hasLore()){
                    if (e.getAction() == Action.LEFT_CLICK_BLOCK){
                        MetadataValue metadataValue = new FixedMetadataValue(Main.getInstance(),"VoteCrate");
                        e.getClickedBlock().setMetadata("VoteCrate", metadataValue);
                        if (Main.crateData == null){
                            CrateData.setValue("Vote Crate", e.getClickedBlock().getLocation());
                            Message.sendMessage(e.getPlayer(), "This crate has been assigned as a Vote Crate.");
                        }else{
                            if (!Main.crateData.contains(e.getClickedBlock().getLocation())){
                                CrateData.setValue("Vote Crate", e.getClickedBlock().getLocation());
                                Message.sendMessage(e.getPlayer(), "This crate has been assigned as a Vote Crate.");
                            }else{
                                Message.sendMessage(e.getPlayer(), "This crate is already assigned.");
                            }
                        }



                        e.setCancelled(true);
                    }else{

                        e.setCancelled(false);
                    }

                    return;
                }

                //Using Crate
                if (e.getPlayer().hasPermission("group.admin") || e.getPlayer().hasPermission("group.owner")){
                    if (e.getClickedBlock().hasMetadata("VoteCrate")){
                        if (item.getType().equals(Material.BLAZE_ROD) && item.getItemMeta().getDisplayName() != null && item.getItemMeta().getDisplayName().equals("Vote Key")){
                            //Remove key on use
                            if (item.getAmount() > 1){
                                item.setAmount(item.getAmount()- 1);
                            }else{
                                if (usingOff){
                                    e.getPlayer().getInventory().getItemInOffHand().setAmount(0);
                                }else{
                                    e.getPlayer().getInventory().getItemInMainHand().setAmount(0);
                                }
                            }

                            Random random = new Random();

                            ItemStack[] items = ((Chest) e.getClickedBlock().getState()).getBlockInventory().getContents();
                            ArrayList<ItemStack> newItems = new ArrayList<ItemStack>();
                            for (ItemStack invItem : items){
                                if (invItem != null){
                                    newItems.add(invItem);
                                }
                            }
                            ItemStack win = newItems.get(random.nextInt(newItems.size()));

                            Message.sendMessage(e.getPlayer(), "Congratulations! You won " + win.getAmount() + " " + win.getType().name() + " from the vote crate.");

                            e.getPlayer().getInventory().addItem(win);
                            e.setCancelled(true);

                        }
                        else{
                            //if player is not holding key
                            Message.sendMessage(e.getPlayer(),"Use a vote key to get prizes.");
                            e.setCancelled(true);
                        }
                    }
                }


            }
        }

    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChestBreak(BlockBreakEvent e){
        if (e.getBlock().hasMetadata("VoteCrate")){
            e.setCancelled(true);
        }
    }
}
