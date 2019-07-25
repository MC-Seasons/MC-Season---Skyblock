package me.msc.skyblock.events;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class SkeletonEvent implements Listener {

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
