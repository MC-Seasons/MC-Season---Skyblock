package me.msc.skyblock.misc;

import me.msc.skyblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.Random;

public class EntityLevel {

    private static int level;


    private static void levelBuff(CreatureSpawnEvent e){
        if (level == 2){
            e.getEntity().setMaxHealth(e.getEntity().getHealth() + e.getEntity().getHealth() * 1.1);
            e.getEntity().setHealth(e.getEntity().getMaxHealth());
        }else if(level == 3){
            e.getEntity().setMaxHealth(e.getEntity().getHealth() + e.getEntity().getHealth() * 1.25);
            e.getEntity().setHealth(e.getEntity().getMaxHealth());
        }else if(level == 4){
            e.getEntity().setMaxHealth(e.getEntity().getHealth() + e.getEntity().getHealth() * 1.50);
            e.getEntity().setHealth(e.getEntity().getMaxHealth());
        }else if(level == 5){
            e.getEntity().setMaxHealth(e.getEntity().getHealth() + e.getEntity().getHealth() * 1.75);
            e.getEntity().setHealth(e.getEntity().getMaxHealth());
        }
    }


    public static String setEntityLevel(CreatureSpawnEvent e){

        //Set entity level randomly
        Random random = new Random();
        int chance = random.nextInt(101);

        if (chance <= 50){
            level = 1;
        }else if(chance <= 80){
            level = 2;
        }else if(chance <=90){
            level = 3;
        }else if(chance <=97){
            level = 4;
        }else if(chance <=100){
            level = 5;
        }
        levelBuff(e);
        e.getEntity().setMetadata("lvl"+level, new FixedMetadataValue(Main.getInstance(), level));
        return "[lvl " + level + "]";
    }


}
