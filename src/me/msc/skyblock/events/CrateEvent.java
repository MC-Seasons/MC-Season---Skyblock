package me.msc.skyblock.events;

import com.mysql.fabric.xmlrpc.base.Array;
import me.msc.skyblock.Main;
import me.msc.skyblock.crate.CrateData;
import me.msc.skyblock.misc.ItemToolInfo;
import me.msc.skyblock.misc.Message;
import org.bukkit.Location;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CrateEvent implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void CrateEvent(PlayerInteractEvent e){


        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_BLOCK){
            if(e.getClickedBlock().getType().equals(Material.CHEST) || e.getClickedBlock().getType().equals(Material.ENDER_CHEST)){

                //Get Items from main hand and off hand
                ItemStack item = e.getPlayer().getInventory().getItemInMainHand();
                ItemStack itemOff = e.getPlayer().getInventory().getItemInOffHand();
                Boolean usingOff = false;

                //Check if using Chest Creation tool
                if (itemOff != null && !itemOff.getType().equals(Material.AIR) && itemOff.hasItemMeta() && itemOff.getItemMeta().getDisplayName() != null && itemOff.getItemMeta().hasLore()){
                    item = itemOff;
                    usingOff = true;
                }

                ArrayList<String> names = new ArrayList<String>(Arrays.asList("Vote Crate Manager", "Rare Crate Manager", "Legendary Crate Manager", "Crate Modifier"));
                if (e.getPlayer().hasPermission("group.admin") || e.getPlayer().hasPermission("group.owner")) {
                    if (item != null && !item.getType().equals(Material.AIR) && item.hasItemMeta() && item.getItemMeta().getDisplayName() != null && item.getItemMeta().hasLore() && names.contains(item.getItemMeta().getDisplayName())) {
                        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {


                            if(item.getItemMeta().getDisplayName().equals("Vote Crate Manager")){

                                //vote crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (!Main.voteCrateData.contains(cratelocation) && !Main.legendCrateData.contains(cratelocation) && !Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().setMetadata("VoteCrate", new FixedMetadataValue(Main.getInstance(), "VoteCrate"));
                                    CrateData.setValue("Vote Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "This crate has been assigned as a Vote Crate.");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is already assigned.");
                                }

                            }else if(item.getItemMeta().getDisplayName().equals("Rare Crate Manager")){

                                //rare crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (!Main.voteCrateData.contains(cratelocation) && !Main.legendCrateData.contains(cratelocation) && !Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().setMetadata("RareCrate", new FixedMetadataValue(Main.getInstance(), "RareCrate"));
                                    CrateData.setValue("Rare Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "This crate has been assigned as a Rare Crate.");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is already assigned.");
                                }

                            }else if(item.getItemMeta().getDisplayName().equals("Legendary Crate Manager")){

                                //legendary crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (!Main.voteCrateData.contains(cratelocation) && !Main.legendCrateData.contains(cratelocation) && !Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().setMetadata("LegendCrate", new FixedMetadataValue(Main.getInstance(), "LegendCrate"));
                                    CrateData.setValue("Legendary Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "This crate has been assigned as a Legendary Crate.");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is already assigned.");
                                }

                            }else if(item.getItemMeta().getDisplayName().equals("Crate Modifier")){
                                e.setCancelled(false);
                                return;
                            }
                            e.setCancelled(true);
                        } else if (e.getAction() == Action.LEFT_CLICK_BLOCK) {
                            if(item.getItemMeta().getDisplayName().equals("Vote Crate Manager")){

                                //vote crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (Main.voteCrateData.contains(cratelocation) && !Main.legendCrateData.contains(cratelocation) && !Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().removeMetadata("VoteCrate", Main.getInstance());
                                    CrateData.removeValue("Vote Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "Removed as Vote Crate");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is not assigned as Vote Crate.");
                                }

                            }else if(item.getItemMeta().getDisplayName().equals("Rare Crate Manager")){

                                //rare crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (!Main.voteCrateData.contains(cratelocation) && !Main.legendCrateData.contains(cratelocation) && Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().removeMetadata("RareCrate", Main.getInstance());
                                    CrateData.removeValue("Rare Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "Removed as Rare Crate");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is not assigned as Rare Crate.");
                                }

                            }else if(item.getItemMeta().getDisplayName().equals("Legendary Crate Manager")){

                                //legendary crate
                                Location cratelocation = e.getClickedBlock().getLocation();
                                if (!Main.voteCrateData.contains(cratelocation) && Main.legendCrateData.contains(cratelocation) && !Main.rareCrateData.contains(cratelocation)) {
                                    e.getClickedBlock().removeMetadata("LegendCrate", Main.getInstance());
                                    CrateData.removeValue("Legendary Crate", e.getClickedBlock().getLocation());
                                    Message.sendMessage(e.getPlayer(), "Removed as Legendary Crate");
                                } else {
                                    Message.sendMessage(e.getPlayer(), "This crate is not assigned as Legendary Crate.");
                                }

                            }

                            e.setCancelled(true);
                        }

                        return;
                    }
                }

                //Using Crate
                if (e.getClickedBlock().hasMetadata("VoteCrate")){
                    if (item.getType().equals(Material.BLAZE_ROD) && item.getItemMeta().getDisplayName() != null && item.getItemMeta().getDisplayName().equals("Vote Key")){
                        //Remove key on use
                        item.setAmount(item.getAmount() - 1);

                        Random random = new Random();

                        //Get items from the chest
                        ItemStack[] items = ((Chest) e.getClickedBlock().getState()).getBlockInventory().getContents();
                        ArrayList<ItemStack> newItems = new ArrayList<ItemStack>();
                        for (ItemStack invItem : items){
                            if (invItem != null){
                                newItems.add(invItem);
                            }
                        }

                        //randomly pick an item
                        ItemStack win = newItems.get(random.nextInt(newItems.size()));

                        Message.sendMessage(e.getPlayer(), "Congratulations! You won " + win.getAmount() + " " + win.getType().name() + " from the vote crate.");

                        //give item to player
                        ItemToolInfo.ItemTool(win, e.getPlayer());
                        e.getPlayer().getInventory().addItem(win);
                        e.setCancelled(true);

                    }
                    else{
                        //if player is not holding key
                        Message.sendMessage(e.getPlayer(),"Use a vote key to get prizes.");
                        e.setCancelled(true);
                    }
                    return;
                }else if (e.getClickedBlock().hasMetadata("LegendCrate")){
                    if (item.getType().equals(Material.BLAZE_ROD) && item.getItemMeta().getDisplayName() != null && item.getItemMeta().getDisplayName().equals("Legendary Key")){
                        //Remove key on use
                        item.setAmount(item.getAmount() - 1);

                        Random random = new Random();

                        //Get items from the chest
                        ItemStack[] items = ((Chest) e.getClickedBlock().getState()).getBlockInventory().getContents();
                        ArrayList<ItemStack> newItems = new ArrayList<ItemStack>();
                        for (ItemStack invItem : items){
                            if (invItem != null){
                                newItems.add(invItem);
                            }
                        }

                        //randomly pick an item
                        ItemStack win = newItems.get(random.nextInt(newItems.size()));

                        Message.sendMessage(e.getPlayer(), "Congratulations! You won " + win.getAmount() + " " + win.getType().name() + " from the Legendary crate.");

                        //give item to player
                        ItemToolInfo.ItemTool(win, e.getPlayer());
                        e.getPlayer().getInventory().addItem(win);
                        e.setCancelled(true);

                    }
                    else{
                        //if player is not holding key
                        Message.sendMessage(e.getPlayer(),"Use a Legendary key to get prizes.");
                        e.setCancelled(true);
                    }
                }else if (e.getClickedBlock().hasMetadata("RareCrate")){
                    if (item.getType().equals(Material.BLAZE_ROD) && item.getItemMeta().getDisplayName() != null && item.getItemMeta().getDisplayName().equals("Rare Key")){
                        //Remove key on use
                        item.setAmount(item.getAmount() - 1);

                        Random random = new Random();

                        //Get items from the chest
                        ItemStack[] items = ((Chest) e.getClickedBlock().getState()).getBlockInventory().getContents();
                        ArrayList<ItemStack> newItems = new ArrayList<ItemStack>();
                        for (ItemStack invItem : items){
                            if (invItem != null){
                                newItems.add(invItem);
                            }
                        }

                        //randomly pick an item
                        ItemStack win = newItems.get(random.nextInt(newItems.size()));

                        Message.sendMessage(e.getPlayer(), "Congratulations! You won " + win.getAmount() + " " + win.getType().name() + " from the Rare crate.");

                        //give item to player
                        ItemToolInfo.ItemTool(win, e.getPlayer());
                        e.getPlayer().getInventory().addItem(win);
                        e.setCancelled(true);

                    }
                    else{
                        //if player is not holding key
                        Message.sendMessage(e.getPlayer(),"Use a Rare key to get prizes.");
                        e.setCancelled(true);
                    }
                }



            }
        }

    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChestBreak(BlockBreakEvent e){
        if (e.getBlock().hasMetadata("VoteCrate") || e.getBlock().hasMetadata("LegendCrate") || e.getBlock().hasMetadata("RareCrate")){
            e.setCancelled(true);
        }
    }
}

