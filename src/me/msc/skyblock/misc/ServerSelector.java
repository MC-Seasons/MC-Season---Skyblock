package me.msc.skyblock.misc;

import me.msc.skyblock.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class ServerSelector {

    private static Plugin plugin = Main.getPlugin(Main.class);

    public static void ServerSelector(Player player){
        Inventory i = plugin.getServer().createInventory(null, 36, ChatColor.YELLOW + "Server Selector");

        ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
        ItemMeta gMeta = glass.getItemMeta();
        gMeta.setDisplayName("");
        glass.setItemMeta(gMeta);

        ItemStack skyblock = new ItemStack(Material.GRASS, 1);
        ItemMeta sMeta = skyblock.getItemMeta();
        sMeta.setDisplayName(ChatColor.GREEN + "Skyblock Season 1");
        List<String> slList = new ArrayList<String>();
        slList.add("Use a limited amount of resources to survive on an island!");
        slList.add("");
        slList.add("Release date: TBA");
        slList.add("Ending date: TBA");
        slList.add("");
        slList.add("Remaining time: ");
        sMeta.setLore(slList);
        skyblock.setItemMeta(sMeta);

        ItemStack prison = new ItemStack(Material.IRON_FENCE, 1);
        ItemMeta pMeta = skyblock.getItemMeta();
        pMeta.setDisplayName(ChatColor.GREEN + "Prison Season 1");
        List<String> pList = new ArrayList<String>();
        pList.add("Use your pickaxe to mine towards your freedom!");
        pList.add("");
        pList.add("Release date: TBA");
        pList.add("Ending date: TBA");
        pList.add("");
        pList.add("Remaining time: ");
        pMeta.setLore(pList);
        prison.setItemMeta(pMeta);


        i.setItem(0, glass);
        i.setItem(1, glass);
        i.setItem(2, glass);
        i.setItem(3, glass);
        i.setItem(4, glass);
        i.setItem(5, glass);
        i.setItem(6, glass);
        i.setItem(7, glass);
        i.setItem(8, glass);

        i.setItem(9, glass);
        i.setItem(10, skyblock);
        i.setItem(11, glass);
        i.setItem(12, prison);
        i.setItem(13, glass);
        i.setItem(14, glass);
        i.setItem(15, glass);
        i.setItem(16, glass);
        i.setItem(17, glass);

        i.setItem(18, glass);
        i.setItem(19, glass);
        i.setItem(20, glass);
        i.setItem(21, glass);
        i.setItem(22, glass);
        i.setItem(23, glass);
        i.setItem(24, glass);
        i.setItem(25, glass);
        i.setItem(26, glass);

        i.setItem(27, glass);
        i.setItem(28, glass);
        i.setItem(29, glass);
        i.setItem(30, glass);
        i.setItem(31, glass);
        i.setItem(32, glass);
        i.setItem(33, glass);
        i.setItem(34, glass);
        i.setItem(35, glass);

        player.openInventory(i);

    }

}
