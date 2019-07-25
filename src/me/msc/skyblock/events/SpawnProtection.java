package me.msc.skyblock.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class SpawnProtection implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onBreak(BlockBreakEvent e){
        if(e.getPlayer().getLocation().getWorld().getName().equals("world")){
            e.setCancelled(true);
        }
    }

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onPlace(BlockPlaceEvent e){
        if(e.getPlayer().getLocation().getWorld().getName().equals("world")){
            e.setCancelled(true);
        }
    }
}
