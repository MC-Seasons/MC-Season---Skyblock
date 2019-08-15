package me.msc.skyblock.crate;

import me.msc.skyblock.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.metadata.FixedMetadataValue;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CrateData {

    private static File file;
    private static YamlConfiguration crateConfig;


    //Load data from yml to arrays.
    public static void  loadMetaData(){
        file = new File(Main.getInstance().getDataFolder(), "cratedata.yml");
        try{
            if (!file.exists()){
                file.createNewFile();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        crateConfig = YamlConfiguration.loadConfiguration(file);

        //For Vote Crate
        if (crateConfig.get("Vote Crate") != null){
            Main.voteCrateData = (ArrayList<Location>) crateConfig.get("Vote Crate");
        }


        for(Location location : Main.voteCrateData){
            if (location.getBlock() != null){
                if (location.getBlock().getType().equals(Material.CHEST) || location.getBlock().getType().equals(Material.ENDER_CHEST)){
                    location.getBlock().setMetadata("VoteCrate", new FixedMetadataValue(Main.getInstance(), "VoteCrate"));
                }
            }
        }

        //For Legendary Crate
        if (crateConfig.get("Legendary Crate") != null){
            Main.legendCrateData = (ArrayList<Location>) crateConfig.get("Legendary Crate");
        }

        for(Location location : Main.legendCrateData){
            if (location.getBlock() != null){
                if (location.getBlock().getType().equals(Material.CHEST) || location.getBlock().getType().equals(Material.ENDER_CHEST)){
                    location.getBlock().setMetadata("LegendCrate", new FixedMetadataValue(Main.getInstance(), "LegendCrate"));
                }
            }
        }


        //For Rare Crate
        if (crateConfig.get("Rare Crate") != null){
            Main.rareCrateData = (ArrayList<Location>) crateConfig.get("Rare Crate");
        }

        for(Location location : Main.rareCrateData){
            if (location.getBlock() != null){
                if (location.getBlock().getType().equals(Material.CHEST) || location.getBlock().getType().equals(Material.ENDER_CHEST)){
                    location.getBlock().setMetadata("RareCrate", new FixedMetadataValue(Main.getInstance(), "RareCrate"));
                }
            }
        }
    }

    //save cratedata.yml
    public static void savefile(){
        try{
            crateConfig.save(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //add crate data in cratedata.yml
    public static void setValue(String crateType, Location location){
        if (crateType.equals("Vote Crate")){
            Main.voteCrateData.add(location);
            crateConfig.set(crateType, Main.voteCrateData);
        }else if (crateType.equals("Legendary Crate")){
            Main.legendCrateData.add(location);
            crateConfig.set(crateType, Main.legendCrateData);
        }else if (crateType.equals("Rare Crate")){
            Main.rareCrateData.add(location);
            crateConfig.set(crateType, Main.rareCrateData);
        }

        savefile();
    }

    //remove crate data from cratedata.yml
    public static void removeValue(String crateType, Location location){
        if (crateType.equals("Vote Crate")){
            Main.voteCrateData.remove(location);
            crateConfig.set(crateType, Main.voteCrateData);
        }else if (crateType.equals("Legendary Crate")){
            Main.legendCrateData.remove(location);
            crateConfig.set(crateType, Main.legendCrateData);
        }else if (crateType.equals("Rare Crate")){
            Main.rareCrateData.remove(location);
            crateConfig.set(crateType, Main.rareCrateData);
        }
        savefile();
    }
}
