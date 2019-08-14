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
        Main.crateData = (ArrayList<Location>) crateConfig.get("Vote Crate");

        for(Location location : Main.crateData){
            if (location.getBlock() != null){
                if (location.getBlock().equals(Material.CHEST)){
                    location.getBlock().setMetadata("VoteCrate", new FixedMetadataValue(Main.getInstance(), "VoteCrate"));
                }
            }
        }

        //For Legendary Crate
    }

    public static void savefile(){
        try{
            crateConfig.save(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void setValue(String crateType, Location location){
        Main.crateData.add(location);
        crateConfig.set(crateType, Main.crateData);
        savefile();
    }

    public static void removeValue(String crateType, Location location){
        Main.crateData.remove(location);
        crateConfig.set(crateType, Main.crateData);
        savefile();
    }
}
