package me.msc.skyblock.events;

import me.msc.skyblock.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Interaction implements Listener {


    private static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler(priority= EventPriority.HIGHEST)
    public void inventoryClick(InventoryClickEvent e) {

        if (e.getClickedInventory() != null) {
            if (e.getClickedInventory().getName().equalsIgnoreCase("Crafting Table")) {
                if (e.getSlot() == 10 || e.getSlot() == 11 || e.getSlot() == 12 || e.getSlot() == 19 || e.getSlot() == 20 || e.getSlot() == 21 || e.getSlot() == 24 || e.getSlot() == 28 || e.getSlot() == 29 || e.getSlot() == 30) {
                    Player player = (Player) e.getWhoClicked();

                } else {
                    e.setCancelled(true);
                }
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
