package me.msc.skyblock.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class EntityDamageEvent implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent e){
        if (e.getDamager().hasMetadata("lvl2")){
            e.setDamage(4);
        } else if (e.getDamager().hasMetadata("lvl2")){
            e.setDamage(8);
        }else if (e.getDamager().hasMetadata("lvl3")){
            e.setDamage(16);
        }else if (e.getDamager().hasMetadata("lvl4")){
            e.setDamage(32);
        }else if (e.getDamager().hasMetadata("lvl5")){
            e.setDamage(64);

        }
    }
}

