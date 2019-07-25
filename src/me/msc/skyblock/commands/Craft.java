package me.msc.skyblock.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Craft  implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("craft")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.openWorkbench(null, true);
                return true;
            }else{
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
                return true;
            }

        }
        return true;
    }
}
