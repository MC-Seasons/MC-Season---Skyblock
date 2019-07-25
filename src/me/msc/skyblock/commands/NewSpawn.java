package me.msc.skyblock.commands;

import me.msc.skyblock.Main;
import me.msc.skyblock.misc.Message;
import net.alpenblock.bungeeperms.config.InvalidConfigurationException;
import net.alpenblock.bungeeperms.config.YamlConfiguration;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewSpawn implements CommandExecutor {

    private final Main plugin;
    private static File configFile;
    private static YamlConfiguration myConfig;

    public NewSpawn(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("setspawn")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("group.admin") || player.hasPermission("group.owner")) {
                    Message.sendMessage(player, ChatColor.GREEN + "Spawn set to your location.");
                    plugin.spawn = new Location(player.getLocation().getWorld(), player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
                    //plugin.getConfig().set("spawn.world", player.getLocation().getWorld().getName().toString());


                    configFile = new File(Bukkit.getServer().getPluginManager().getPlugin("MC-Seasons-Lobby").getDataFolder(), "config.yml");
                    if (configFile.exists()) {
                        myConfig = new YamlConfiguration();
                        try {
                            myConfig.load(configFile);
                        } catch (FileNotFoundException ex) {
                            // TODO: Log exception
                        } catch (IOException ex) {
                            // TODO: Log exception
                        } catch (InvalidConfigurationException ex) {
                            // TODO: Log exception
                        }

                        myConfig.set("spawn.x", player.getLocation().getX());
                        myConfig.set("spawn.y", player.getLocation().getY());
                        myConfig.set("spawn.z", player.getLocation().getZ());

                        try {
                            myConfig.save(new File(Bukkit.getServer().getPluginManager().getPlugin("MC-Seasons-Lobby").getDataFolder(), "config.yml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                } else {
                    Message.sendMessage(player, ChatColor.RED + "Only admins can use this command.");
                    return true;
                }
            } else {
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
                return true;
            }

        }
        return true;
    }
}

