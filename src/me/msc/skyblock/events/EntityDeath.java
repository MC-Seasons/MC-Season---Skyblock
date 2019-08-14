package me.msc.skyblock.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class EntityDeath implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDeath(EntityDeathEvent e){

        Random rand = new Random();

        if (e.getEntity() instanceof Skeleton){
            //Skeleton
            e.getDrops().clear();
            if (((Skeleton) e.getEntity()).getSkeletonType().equals(Skeleton.SkeletonType.WITHER)) {
                e.getDrops().add(new ItemStack(rand.nextInt(2) == 1 ? Material.COAL : Material.BONE));
            } else {
                e.getDrops().add(new ItemStack(Material.BONE));
            }

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
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2)== 1 ? Material.SPIDER_EYE : Material.STRING));
        }else if (e.getEntity() instanceof CaveSpider){
            //Cave Spider
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2)== 1 ? Material.SPIDER_EYE : Material.STRING));
        }else if (e.getEntity() instanceof Enderman){
            //Enderman
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.ENDER_PEARL));
        }else if (e.getEntity() instanceof Blaze){
            //Blaze
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.BLAZE_ROD));
        }else if (e.getEntity() instanceof ElderGuardian){
            //Elder Guardian
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.PRISMARINE_SHARD));
        }else if (e.getEntity() instanceof Endermite){
            //Endermite
            e.getDrops().clear();
        }else if (e.getEntity() instanceof Evoker){
            //Evoker
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.TOTEM));
            //Maybe Emerald??
        }else if (e.getEntity() instanceof Ghast){
            //Ghast
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2) == 1 ? Material.GHAST_TEAR : Material.SULPHUR));
        }else if (e.getEntity() instanceof Guardian){
            //Guardian
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.PRISMARINE_SHARD));
        }else if (e.getEntity() instanceof Husk){
            //Husk
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.ROTTEN_FLESH));
        }else if (e.getEntity() instanceof PigZombie){
            //Zombie Pigman
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2)==1 ? Material.ROTTEN_FLESH: Material.GOLD_NUGGET));
        }else if (e.getEntity() instanceof Shulker){
            //Shulker
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(rand.nextInt(2)==1 ? Material.SHULKER_SHELL: Material.AIR));
        }else if (e.getEntity() instanceof Slime){
            //Slime
            e.getDrops().clear();
            if (e.getEntity().getType().equals(e.getEntityType().MAGMA_CUBE)) {
                e.getDrops().add(new ItemStack(Material.MAGMA_CREAM));
            } else {
                e.getDrops().add(new ItemStack(Material.SLIME_BALL));
            }
        }else if (e.getEntity() instanceof PolarBear){
            //Polar Bear
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.RAW_FISH));
        }else if (e.getEntity() instanceof Vex){
            //Vex
            e.getDrops().clear();
        }else if (e.getEntity() instanceof Vindicator){
            //Vindicator
            e.getDrops().clear();
            e.getDrops().add(new ItemStack(Material.EMERALD));
        }else if (e.getEntity() instanceof Witch){
            //Witch
            e.getDrops().clear();
            ItemStack itemStack = new ItemStack(Material.POTION,1,(short) 16);
            e.getDrops().add(itemStack);
        }else if (e.getEntity() instanceof Wither){
            //Wither
            e.getDrops().clear();
            ItemStack itemStack = new ItemStack(Material.NETHER_STAR);
            e.getDrops().add(itemStack);
        }else if (e.getEntity() instanceof ZombieHorse){
            //Zombie Horse
            e.getDrops().clear();
            ItemStack itemStack = new ItemStack(Material.ROTTEN_FLESH);
            e.getDrops().add(itemStack);
        }else if (e.getEntity() instanceof ZombieVillager){
            //Zombie Villager
            e.getDrops().clear();
            ItemStack itemStack = new ItemStack(Material.ROTTEN_FLESH);
            e.getDrops().add(itemStack);
        }else if (e.getEntity() instanceof Silverfish){
            //SilverFish
            e.getDrops().clear();
        }else if (e.getEntity() instanceof Wolf){
            //Wolf
            e.getDrops().clear();
        }


        //give money on killing
        if(e.getEntity().getKiller() != null){
            if(e.getEntity().hasMetadata("lvl1")){
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"money give " + e.getEntity().getKiller().getDisplayName() + " 2.50");
            }else if(e.getEntity().hasMetadata("lvl2")){
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"money give " + e.getEntity().getKiller().getDisplayName() + " 5.00");
            }else if(e.getEntity().hasMetadata("lvl3")){
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"money give " + e.getEntity().getKiller().getDisplayName() + " 7.50");
            }else if(e.getEntity().hasMetadata("lvl4")){
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"money give " + e.getEntity().getKiller().getDisplayName() + " 10.00");
            }else if(e.getEntity().hasMetadata("lvl5")){
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"money give " + e.getEntity().getKiller().getDisplayName() + " 12.50");
            }
        }

    }
}