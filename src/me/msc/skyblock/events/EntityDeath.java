package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDeath implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDeath(EntityDeathEvent e){

        if (e.getEntity() instanceof Skeleton){
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.BONE));
        }

        if (e.getEntity() instanceof Zombie){
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.ROTTEN_FLESH));
        }
    }
}
