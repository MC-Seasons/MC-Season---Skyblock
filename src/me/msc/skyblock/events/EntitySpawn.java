package me.msc.skyblock.events;

import me.msc.skyblock.misc.EntityLevel;
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

        String level;

        if (e.getEntityType().equals(EntityType.ZOMBIE)){
            //Zombie
            Zombie zombie = (Zombie) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            zombie.setCustomName(level + " Zombie");
            zombie.setCustomNameVisible(true);

            //set equipments
            zombie.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            zombie.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.STONE_SWORD));
        } else if (e.getEntity() instanceof Skeleton) {
            //Skeleton
            Skeleton skeleton = (Skeleton) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            skeleton.setCustomName(level + " Skeleton");
            skeleton.setCustomNameVisible(true);

            //set equipments
            skeleton.getEquipment().setHelmet(new ItemStack(Material.RED_MUSHROOM));
            skeleton.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            skeleton.getEquipment().setItemInMainHand(new ItemStack(Material.BOW));
        } else  if (e.getEntityType().equals(EntityType.CREEPER)){
            //Creeper
            Creeper creeper = (Creeper) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            creeper.setCustomName(level + " Creeper");
            creeper.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.SPIDER)){
            //Spider
            Spider spider = (Spider) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            spider.setCustomName(level + " Spider");
            spider.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.CAVE_SPIDER)){
            //Cave Spider
            CaveSpider caveSpider = (CaveSpider) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            caveSpider.setCustomName(level + " Cave Spider");
            caveSpider.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.ENDERMAN)){
            //EnderMan
            Enderman enderman = (Enderman) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            enderman.setCustomName(level + " Enderman");
            enderman.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.BLAZE)){
            //Blaze
            Blaze blaze = (Blaze) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            blaze.setCustomName(level + " Blaze");
            blaze.setCustomNameVisible(true);

        }else if (e.getEntityType().equals(EntityType.ELDER_GUARDIAN)){
            //Elder guardian
            ElderGuardian elderGuardian = (ElderGuardian) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            elderGuardian.setCustomName(level + " Elder Guardian");
            elderGuardian.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ENDERMITE)){
            //EnderMite
            Endermite endermite = (Endermite) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            endermite.setCustomName(level + " Endermite");
            endermite.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.EVOKER)){
            //Evoker
            Evoker evoker = (Evoker) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            evoker.setCustomName(level + " Evoker");
            evoker.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.GHAST)){
            //Ghast
            Ghast ghast = (Ghast) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            ghast.setCustomName(level + " Ghast");
            ghast.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.GUARDIAN)){
            //Guardian
            Guardian guardian = (Guardian) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            guardian.setCustomName(level + " Guardian");
            guardian.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.HUSK)){
            //Husk
            Husk husk = (Husk) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            husk.setCustomName(level + " Husk");
            husk.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.PIG_ZOMBIE)){
            //Zombie Pigman
            PigZombie pigZombie = (PigZombie) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            pigZombie.setCustomName(level + " Zombie Pigman");
            pigZombie.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.SHULKER)){
            //Shulker
            Shulker shulker = (Shulker) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            shulker.setCustomName(level + " Shulker");
            shulker.setCustomNameVisible(true);
        } else if (e.getEntity() instanceof Slime) {
            //Slime
            Slime slime = (Slime) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            slime.setCustomName(level + " Slime");
            slime.setCustomNameVisible(true);
        } else if (e.getEntity() instanceof MagmaCube) {
            //Slime
            MagmaCube magmaCube = (MagmaCube) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            magmaCube.setCustomName(level + " Magma Cube");
            magmaCube.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.POLAR_BEAR)){
            //Polar Bear
            PolarBear polarBear = (PolarBear) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            polarBear.setCustomName(level + " Polar Bear");
            polarBear.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.VEX)){
            //Vex
            Vex vex = (Vex) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            vex.setCustomName(level + " Vex");
            vex.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.VINDICATOR)){
            //Vex
            Vindicator vindicator = (Vindicator) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            vindicator.setCustomName(level + " Vindicator");
            vindicator.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WITCH)){
            //Witch
            Witch witch = (Witch) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            witch.setCustomName(level + " Witch");
            witch.setCustomNameVisible(true);
        }else if (e.getEntity().equals(EntityType.WITHER)){
            //Wither
            Wither wither = (Wither) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name above the head
            wither.setCustomName(level + " Wither");
            wither.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WITHER_SKELETON)){
            //Wither Skeleton
            WitherSkeleton witherSkeleton = (WitherSkeleton) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            witherSkeleton.setCustomName(level + " Wither Skeleton");
            witherSkeleton.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ZOMBIE_HORSE)){
            //Zombie Horse
            ZombieHorse zombieHorse = (ZombieHorse) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            zombieHorse.setCustomName(level + " Zombie Horse");
            zombieHorse.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.ZOMBIE_VILLAGER)){
            //Zombie Villager
            ZombieVillager zombieVillager = (ZombieVillager) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            zombieVillager.setCustomName(level + " Zombie Villager");
            zombieVillager.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.MAGMA_CUBE)){
            //Magma Cube
            MagmaCube magmaCube = (MagmaCube) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            magmaCube.setCustomName(level + " Magma Cube");
            magmaCube.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.SILVERFISH)){
            //Silver Fish
            Silverfish silverfish = (Silverfish) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            silverfish.setCustomName(level + " Silver Fish");
            silverfish.setCustomNameVisible(true);
        }else if (e.getEntityType().equals(EntityType.WOLF)){
            //Wolf
            Wolf wolf = (Wolf) e.getEntity();

            //assign Level
            level = EntityLevel.setEntityLevel(e);

            //name about the head
            wolf.setCustomName(level + " Wolf");
            wolf.setCustomNameVisible(true);
        }
    }

}