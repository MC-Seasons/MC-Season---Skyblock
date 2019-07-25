package me.msc.skyblock.commands;

import me.msc.skyblock.misc.Message;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.msc.skyblock.Main.playerprefix;
import static me.msc.skyblock.MySQL.MysqlSetterGetter.updatePrefix;

public class FakePlayer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("playerstate")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                if(player.hasPermission("group.owner")) {
                    if(!playerprefix.get(player.getPlayer().getName()).equalsIgnoreCase("&8[&fPlayer&8]&r")) {
                        updatePrefix(player.getUniqueId(), player, "player");
                        Message.sendMessage(player, "You are now visible as regular player.");
                        return true;
                    } else {
                        updatePrefix(player.getUniqueId(), player, "owner");
                        Message.sendMessage(player, "You are now visible as Owner.");
                        return true;
                    }

                }else{
                    Message.sendMessage(player, "Unknown command. Type \"/help\" for help.");
                    return true;
                }
            }else{
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
                return true;
            }

        }
        return true;
    }
}
