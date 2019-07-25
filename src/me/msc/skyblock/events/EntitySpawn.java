package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class EntitySpawn implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onZombieSpawn(CreatureSpawnEvent e){
        if (e.getEntityType().equals(EntityType.ZOMBIE)){
            Zombie zombie = (Zombie) e.getEntity();

            //name about the head
            zombie.setCustomName("Zombie");
            zombie.setCustomNameVisible(true);

            //set equipments
            zombie.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            zombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.STONE_SWORD));
        }
    }

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onSkeletonSpawn(CreatureSpawnEvent e){
        if (e.getEntityType().equals(EntityType.SKELETON)){
            Skeleton skeleton = (Skeleton) e.getEntity();

            //name about the head
            skeleton.setCustomName("Skeleton");
            skeleton.setCustomNameVisible(true);

            //set equipments
            skeleton.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            skeleton.getEquipment().setItemInMainHand(new ItemStack(Material.BOW));
        }
    }
}
