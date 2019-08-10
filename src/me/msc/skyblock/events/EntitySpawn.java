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

        }else if (e.getEntityType().equals(EntityType.CAVE_SPIDER)){
            //Cave Spider
            CaveSpider caveSpider = (CaveSpider) e.getEntity();

            //name above the head
            caveSpider.setCustomName("Cave Spider");
            caveSpider.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.ENDERMAN)){
            //EnderMan
            Enderman enderman = (Enderman) e.getEntity();

            //name above the head
            enderman.setCustomName("Enderman");
            enderman.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.BLAZE)){
            //Blaze
            Blaze blaze = (Blaze) e.getEntity();

            //name above the head
            blaze.setCustomName("Blaze");
            blaze.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.ELDER_GUARDIAN)){
            //Elder guardian
            ElderGuardian elderGuardian = (ElderGuardian) e.getEntity();

            //name above the head
            elderGuardian.setCustomName("Elder Guardian");
            elderGuardian.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ENDERMITE)){
            //EnderMite
            Endermite endermite = (Endermite) e.getEntity();

            //name above the head
            endermite.setCustomName("Endermite");
            endermite.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.EVOKER)){
            //Evoker
            Evoker evoker = (Evoker) e.getEntity();

            //name above the head
            evoker.setCustomName("Evoker");
            evoker.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.GHAST)){
            //Ghast
            Ghast ghast = (Ghast) e.getEntity();

            //name above the head
            ghast.setCustomName("Ghast");
            ghast.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.GUARDIAN)){
            //Guardian
            Guardian guardian = (Guardian) e.getEntity();

            //name above the head
            guardian.setCustomName("Guardian");
            guardian.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.HUSK)){
            //Husk
            Husk husk = (Husk) e.getEntity();

            //name above the head
            husk.setCustomName("Husk");
            husk.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.PIG_ZOMBIE)){
            //Zombie Pigman
            PigZombie pigZombie = (PigZombie) e.getEntity();

            //name above the head
            pigZombie.setCustomName("Zombie Pigman");
            pigZombie.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.SHULKER)){
            //Shulker
            Shulker shulker = (Shulker) e.getEntity();

            //name above the head
            shulker.setCustomName("Shulker");
            shulker.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.SLIME)){
            //Slime
            Slime slime = (Slime) e.getEntity();

            //name above the head
            slime.setCustomName("Slime");
            slime.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.POLAR_BEAR)){
            //Polar Bear
            PolarBear polarBear = (PolarBear) e.getEntity();

            //name above the head
            polarBear.setCustomName("Polar Bear");
            polarBear.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.VEX)){
            //Vex
            Vex vex = (Vex) e.getEntity();

            //name above the head
            vex.setCustomName("Vex");
            vex.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.VINDICATOR)){
            //Vex
            Vindicator vindicator = (Vindicator) e.getEntity();

            //name above the head
            vindicator.setCustomName("Vindicator");
            vindicator.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WITCH)){
            //Witch
            Witch witch = (Witch) e.getEntity();

            //name above the head
            witch.setCustomName("Witch");
            witch.setCustomNameVisible(true);
        }else if (e.getEntity().equals(EntityType.WITHER)){
            //Wither
            Wither wither = (Wither) e.getEntity();

            //name above the head
            wither.setCustomName("Wither");
            wither.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WITHER_SKELETON)){
            //Wither Skeleton
            WitherSkeleton witherSkeleton = (WitherSkeleton) e.getEntity();

            //name about the head
            witherSkeleton.setCustomName("Wither Skeleton");
            witherSkeleton.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ZOMBIE_HORSE)){
            //Zombie Horse
            ZombieHorse zombieHorse = (ZombieHorse) e.getEntity();

            //name about the head
            zombieHorse.setCustomName("Zombie Horse");
            zombieHorse.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ZOMBIE_VILLAGER)){
            //Zombie Villager
            ZombieVillager zombieVillager = (ZombieVillager) e.getEntity();

            //name about the head
            zombieVillager.setCustomName("Zombie Villager");
            zombieVillager.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.MAGMA_CUBE)){
            //Magma Cube
            MagmaCube magmaCube = (MagmaCube) e.getEntity();

            //name about the head
            magmaCube.setCustomName("Magma Cube");
            magmaCube.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.SILVERFISH)){
            //Silver Fish
            Silverfish silverfish = (Silverfish) e.getEntity();

            //name about the head
            silverfish.setCustomName("Silver Fish");
            silverfish.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WOLF)){
            //Wolf
            Wolf wolf = (Wolf) e.getEntity();

            //name about the head
            wolf.setCustomName("Wolf");
            wolf.setCustomNameVisible(true);
        }
    }

}