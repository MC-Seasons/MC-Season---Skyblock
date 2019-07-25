package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

public class CraftInventory implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void inventoryCrafting(CraftingInventory e){
        ItemStack item = new ItemStack(Material.AIR, 1);
        e.setResult(item);
        return;
    }
}
