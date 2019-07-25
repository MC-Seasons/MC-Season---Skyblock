package me.msc.skyblock.commands;

import me.msc.skyblock.misc.Message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("fly")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                if(player.hasPermission("cmd.fly")) {
                    if (args.length < 1) {
                        if (player.getAllowFlight() == false) {
                            player.setAllowFlight(true);
                            player.setFlying(true);
                            Message.sendMessage(player,ChatColor.GREEN + "You can now fly!");
                            return true;
                        } else {
                            player.setAllowFlight(false);
                            player.setFlying(false);
                            Message.sendMessage(player, ChatColor.RED + "You can no longer fly!");
                            return true;
                        }
                    } else if (args.length == 1) {
                        Player flyplayer = Bukkit.getPlayerExact(args[0]);

                        if (flyplayer == null) {
                            Message.sendMessage(player, ChatColor.RED + "Player cannot be found");
                            return true;
                        } else {
                            if (flyplayer.getAllowFlight() == false) {
                                flyplayer.setAllowFlight(true);
                                flyplayer.setFlying(true);
                                Message.sendMessage(player,ChatColor.GREEN + flyplayer.getName() + " is now flying!");
                                Message.sendMessage(flyplayer,ChatColor.GREEN + "You can now fly!");
                                return true;
                            } else {
                                flyplayer.setAllowFlight(false);
                                flyplayer.setFlying(false);
                                Message.sendMessage(player,ChatColor.RED + flyplayer.getName() + " can no longer fly!");
                                Message.sendMessage(flyplayer,ChatColor.RED + "You can no longer fly!");
                                return true;
                            }
                        }
                    } else if (args.length > 1) {
                        Message.sendMessage(player,ChatColor.RED + "Correct usage: /fly <player>");
                        return true;
                    }
                }else{
                    Message.sendMessage(player,ChatColor.WHITE + "Unknown command. Type \"/help\" for help.");
                    return true;
                }
        }else{
            sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
        }

    }
        return true;
    }
}
