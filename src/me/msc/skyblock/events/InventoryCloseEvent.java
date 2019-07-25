package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class InventoryCloseEvent implements Listener {

    @EventHandler
    public void InventoryClose(org.bukkit.event.inventory.InventoryCloseEvent e){
        if(e.getInventory().getName().equalsIgnoreCase("Crafting Table")) {
            if (e.getInventory().getItem(10) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(10));

            if (e.getInventory().getItem(11) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(11));

            if (e.getInventory().getItem(12) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(12));

            if (e.getInventory().getItem(19) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(19));

            if (e.getInventory().getItem(20) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(20));

            if (e.getInventory().getItem(21) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(21));

            if (e.getInventory().getItem(28) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(28));

            if (e.getInventory().getItem(29) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(29));

            if (e.getInventory().getItem(30) != null)
                e.getPlayer().getInventory().addItem(e.getInventory().getItem(30));

            e.getInventory().setItem(10, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(11, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(12, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(19, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(20, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(21, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(28, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(29, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(30, new ItemStack(Material.AIR, 1));
            e.getInventory().setItem(24, new ItemStack(Material.AIR, 1));
        }
    }
}
