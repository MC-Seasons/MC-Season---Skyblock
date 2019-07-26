package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class EntityDeath implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDeath(EntityDeathEvent e){

        if (e.getEntity() instanceof Skeleton){
            //Skeleton
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.BONE));

        } else if (e.getEntity() instanceof Zombie){
            //Zombie
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.ROTTEN_FLESH));
        } else if (e.getEntity() instanceof Creeper){
            //Creeper
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.SULPHUR));
        }else if (e.getEntity() instanceof Spider){
            //Spider
            Random rand = new Random();
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2)== 1 ? Material.SPIDER_EYE : Material.STRING));
        }
    }
}
