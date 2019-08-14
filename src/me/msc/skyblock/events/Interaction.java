package me.msc.skyblock.events;

import me.msc.skyblock.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;

public class Interaction implements Listener {


    private static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler(priority= EventPriority.HIGHEST)
    public void inventoryClick(InventoryClickEvent e) {

        if (e.getClickedInventory() != null) {
            if (e.getClickedInventory().getName().equalsIgnoreCase("Crafting Table")) {
                e.setCancelled(true);
            }

            //Skyblock Menu prevent movement.
            if (e.getClick().isKeyboardClick()) {
                if (e.getHotbarButton() == 8) {
                    e.setCancelled(true);
                }
            }

            ItemStack item = e.getCurrentItem();
            if (item != null) {
                if (item.hasItemMeta()) {
                    if (item.getItemMeta().getDisplayName() != null) {
                        if (item.getItemMeta().getDisplayName().contains(ChatColor.AQUA + "Skyblock Menu")) {
                            e.setCancelled(true);
                        }
                    }
                }
            }

        }
    }

}
