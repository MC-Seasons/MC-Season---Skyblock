package me.msc.skyblock.commands;

import me.msc.skyblock.misc.Message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.msc.skyblock.MySQL.MysqlSetterGetter.updatePrefix;

public class updatePrefix implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("updateprefix")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                if(player.hasPermission("group.admin") || player.hasPermission("group.owner")) {
                    if (args.length == 2) {
                        Player updateplayer = Bukkit.getPlayerExact(args[0]);

                        if (updateplayer == null) {
                            Message.sendMessage(player, ChatColor.RED + "Player cannot be found");
                            return true;
                        } else {
                            updatePrefix(updateplayer.getUniqueId(), updateplayer, args[1]);
                            Message.sendMessage(player, ChatColor.GREEN + "Prefix updated!");
                            Message.sendMessage(updateplayer, ChatColor.GREEN + "Your prefix has been updated!");
                        }
                    }  else {
                        Message.sendMessage(player,ChatColor.RED + "Correct usage: /updateprefix <player> <prefix>");
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
