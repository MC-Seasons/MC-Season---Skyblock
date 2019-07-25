package me.msc.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Craft  implements CommandExecutor {

    public static Inventory craftingTable = Bukkit.createInventory(null, 54, "Crafting Table");

    @EventHandler(priority= EventPriority.HIGHEST)
    public void craftTable(Player player){

    ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
    ItemMeta glassmeta = glass.getItemMeta();
    glassmeta.setDisplayName(ChatColor.AQUA + " ");
    glass.setItemMeta(glassmeta);

    ItemStack arrow = new ItemStack(Material.ARROW, 1);
    ItemMeta arrowmeta = arrow.getItemMeta();
    arrowmeta.setDisplayName(ChatColor.RED + "Back");
    arrow.setItemMeta(arrowmeta);


    craftingTable.setItem(0, glass);
    craftingTable.setItem(1, glass);
    craftingTable.setItem(2, glass);
    craftingTable.setItem(3, glass);
    craftingTable.setItem(4, glass);
    craftingTable.setItem(5, glass);
    craftingTable.setItem(6, glass);
    craftingTable.setItem(7, glass);
    craftingTable.setItem(8, glass);

    craftingTable.setItem(9, glass);
    craftingTable.setItem(13, glass);
    craftingTable.setItem(14, glass);
    craftingTable.setItem(15, glass);
    craftingTable.setItem(16, glass);
    craftingTable.setItem(17, glass);

    craftingTable.setItem(18, glass);
    craftingTable.setItem(22, glass);
    craftingTable.setItem(23, glass);
    craftingTable.setItem(25, glass);
    craftingTable.setItem(26, glass);

    craftingTable.setItem(27, glass);
    craftingTable.setItem(31, glass);
    craftingTable.setItem(32, glass);
    craftingTable.setItem(33, glass);
    craftingTable.setItem(34, glass);
    craftingTable.setItem(35, glass);

    craftingTable.setItem(36, glass);
    craftingTable.setItem(37, glass);
    craftingTable.setItem(38, glass);
    craftingTable.setItem(39, glass);
    craftingTable.setItem(40, glass);
    craftingTable.setItem(41, glass);
    craftingTable.setItem(42, glass);
    craftingTable.setItem(43, glass);
    craftingTable.setItem(44, glass);

    craftingTable.setItem(45, glass);
    craftingTable.setItem(46, glass);
    craftingTable.setItem(47, glass);
    craftingTable.setItem(48, glass);
    craftingTable.setItem(49, arrow);
    craftingTable.setItem(50, glass);
    craftingTable.setItem(51, glass);
    craftingTable.setItem(52, glass);
    craftingTable.setItem(53, glass);

        player.openInventory(craftingTable);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("craft")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                craftTable(player);
                return true;
            }else{
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
                return true;
            }

        }
        return true;
    }
}
