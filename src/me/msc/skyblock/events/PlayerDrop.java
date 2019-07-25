package me.msc.skyblock.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDrop implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onPlayerDropItem(PlayerDropItemEvent e) {

        Item item = e.getItemDrop();
        if(item.getItemStack().hasItemMeta()) {
            if(item.getItemStack().getType() == Material.NETHER_STAR) {
                if (item.getItemStack().getItemMeta().getDisplayName().contains(ChatColor.AQUA + "Skyblock Menu " + ChatColor.GRAY + "(Right click)")) {
                    e.setCancelled(true);
                }
            }
        }
    }
}
