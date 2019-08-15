package me.msc.skyblock.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class Crate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] strings) {

        if (label.equalsIgnoreCase("crate")) {
            if (commandSender instanceof Player) {
                if (strings.length == 2) {
                    if (strings[0].equalsIgnoreCase("create")) {

                        //Item to create Vote Crate
                        if (strings[1].equalsIgnoreCase("vote")) {
                            ItemStack item = new ItemStack(Material.BLAZE_ROD);

                            //lore
                            List<String> lore = new ArrayList<String>();
                            lore.add("Right Click on a crate to assign Vote Crate");
                            lore.add("Left Click on a crate to remove Vote Crate");

                            //metadata
                            ItemMeta meta = (ItemMeta) item.getItemMeta();
                            meta.setLore(lore);
                            meta.setDisplayName("Vote Crate Manager");
                            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                            item.setItemMeta(meta);
                            item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

                            ((Player) commandSender).getInventory().addItem(item);
                            return true;
                        }


                        //Item to create Legendary Crate
                        if (strings[1].equalsIgnoreCase("legendary")) {
                            ItemStack item = new ItemStack(Material.BLAZE_ROD);

                            //lore
                            List<String> lore = new ArrayList<String>();
                            lore.add("Right Click on a crate to assign Legendary Crate");
                            lore.add("Left Click on a crate to remove Legendary Crate");

                            //metadata
                            ItemMeta meta = (ItemMeta) item.getItemMeta();
                            meta.setLore(lore);
                            meta.setDisplayName("Legendary Crate Manager");
                            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                            item.setItemMeta(meta);
                            item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
                            ((Player) commandSender).getInventory().addItem(item);
                            return true;
                        }

                        //Item to create Rare Crate
                        if (strings[1].equalsIgnoreCase("rare")) {
                            ItemStack item = new ItemStack(Material.BLAZE_ROD);

                            //lore
                            List<String> lore = new ArrayList<String>();
                            lore.add("Right Click on a crate to assign Rare Crate");
                            lore.add("Left Click on a crate to remove Rare Crate");

                            //metadata
                            ItemMeta meta = (ItemMeta) item.getItemMeta();
                            meta.setLore(lore);
                            meta.setDisplayName("Rare Crate Manager");
                            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                            item.setItemMeta(meta);
                            item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
                            ((Player) commandSender).getInventory().addItem(item);
                            return true;
                        }
                        return false;
                    }
                } else if (strings.length == 1) {

                    //Crate items modifier
                    if (strings[0].equalsIgnoreCase("modify")) {
                        ItemStack item = new ItemStack(Material.BLAZE_ROD);

                        //lore
                        List<String> lore = new ArrayList<String>();
                        lore.add("Right Click on a crate to modify Crate items");

                        //metadata
                        ItemMeta meta = (ItemMeta) item.getItemMeta();
                        meta.setLore(lore);
                        meta.setDisplayName("Crate Modifier");
                        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                        item.setItemMeta(meta);
                        item.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
                        ((Player) commandSender).getInventory().addItem(item);
                        return true;

                    }
                    return false;
                }
            }
        }
        return false;

    }
}
