package me.msc.skyblock.commands;

import me.msc.skyblock.crate.KeyType;
import me.msc.skyblock.crate.Keys;
import me.msc.skyblock.misc.Message;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KeyCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] strings) {
        if (commandSender.hasPermission("group.owner") || commandSender.hasPermission("group.admin")){

            //initialize
            String keyString = "";
            Player player = (Player) commandSender;
            int amount = 1;

            //Check command arguments
            if (strings.length == 1) {
                keyString = strings[0];
                player = (Player) commandSender;
            }else if(strings.length == 2) {
                try{
                    amount = Integer.parseInt(strings[1]);
                    keyString = strings[0];
                    player = (Player) commandSender;
                }catch (NumberFormatException e){
                    player = Bukkit.getPlayer(strings[0]);
                    keyString = strings[1];
                    if (player == null) {
                        Message.sendMessage((Player) commandSender, "Player Not Found");
                        return false;
                    }
                }
            }else if(strings.length == 3){
                try{
                    amount = Integer.parseInt(strings[2]);
                    player = Bukkit.getPlayer(strings[0]);
                    keyString = strings[1];
                }catch (NumberFormatException e){
                    return false;
                }
            }

            else{
                return false;
            }

            //give key to player
            if (keyString.equalsIgnoreCase("vote")){
                player.getInventory().addItem(Keys.getKey(KeyType.VoteKey,amount));
            }else if (keyString.equalsIgnoreCase("legendary")){
                player.getInventory().addItem(Keys.getKey(KeyType.LegendaryKey,amount));
            }else if (keyString.equalsIgnoreCase("rare")){
                player.getInventory().addItem(Keys.getKey(KeyType.RareKey,amount));
            }else{
                return false;
            }

            return true;


        }else{
            Message.sendMessage((Player) commandSender, "You don't have permission to use this command.");
            return true;
        }

    }
}
