package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class EntitySpawn implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onCreatureSpawn(CreatureSpawnEvent e){

        if (e.getEntityType().equals(EntityType.ZOMBIE)){
            //Zombie
            Zombie zombie = (Zombie) e.getEntity();

            //name above the head
            zombie.setCustomName("Zombie");
            zombie.setCustomNameVisible(true);

            //set equipments
            zombie.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            zombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.STONE_SWORD));
        } else if (e.getEntityType().equals(EntityType.SKELETON)){
            //Skeleton
            Skeleton skeleton = (Skeleton) e.getEntity();

            //name above the head
            skeleton.setCustomName("Skeleton");
            skeleton.setCustomNameVisible(true);

            //set equipments
            skeleton.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            skeleton.getEquipment().setItemInMainHand(new ItemStack(Material.BOW));
        } else  if (e.getEntityType().equals(EntityType.CREEPER)){
            //Creeper
            Creeper creeper = (Creeper) e.getEntity();

            //name above the head
            creeper.setCustomName("Creeper");
            creeper.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.SPIDER)){
            //Spider
            Spider spider = (Spider) e.getEntity();

            //name above the head
            spider.setCustomName("Spider");
            spider.setCustomNameVisible(true);

        }
    }

}
