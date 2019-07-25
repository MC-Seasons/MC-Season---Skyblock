package me.msc.skyblock.commands;

import me.msc.skyblock.misc.Message;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.msc.skyblock.Main.spawn;

public class SpawnCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("spawn")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                Message.sendMessage(player, "Sending you to the spawn...");
                player.teleport(spawn);
                return true;
            }else{
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
                return true;
            }

        }
        return true;
    }
}
