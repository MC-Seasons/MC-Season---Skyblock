package me.msc.skyblock.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static me.msc.skyblock.Main.playerprefix;

public class PlayerChat implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onPlayerChat(AsyncPlayerChatEvent e){
        String replaceString=e.getMessage().replace("%","%%");
        Player player = e.getPlayer();
        if(player.isOp() == false) {
            if(player.hasPermission("group.helper")){
                e.setFormat(ChatColor.translateAlternateColorCodes('&',playerprefix.get(player.getName())) + " " + ChatColor.WHITE + e.getPlayer().getName() + " 》" + replaceString);
            } else if(player.hasPermission("group.moderator")){
                e.setFormat(ChatColor.translateAlternateColorCodes('&',playerprefix.get(player.getName())) + " " + ChatColor.WHITE + e.getPlayer().getName() + " 》" + ChatColor.translateAlternateColorCodes('&', replaceString));
            } else if(player.hasPermission("group.admin")) {
                e.setFormat(ChatColor.translateAlternateColorCodes('&',playerprefix.get(player.getName())) + " " + ChatColor.WHITE + e.getPlayer().getName() + ChatColor.RED + " 》" + ChatColor.translateAlternateColorCodes('&', replaceString));
            } else if(player.hasPermission("group.owner")) {
                if(!playerprefix.get(player.getPlayer().getName()).equalsIgnoreCase("&8[&fPlayer&8]&r")) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', playerprefix.get(player.getName())) + " " + ChatColor.WHITE + e.getPlayer().getName() + ChatColor.RED + " 》" + replaceString);
                } else {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&',playerprefix.get(player.getName())) + " " +  ChatColor.GRAY + e.getPlayer().getName() + " 》" + replaceString);
                }
            } else {
                e.setFormat(ChatColor.translateAlternateColorCodes('&',playerprefix.get(player.getName())) + " " +  ChatColor.GRAY + e.getPlayer().getName() + " 》" + replaceString);
            }
        } else if (player.isOp() == true){
            e.setFormat(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Super Admin" + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE + e.getPlayer().getName() + " 》" + ChatColor.RED + ChatColor.translateAlternateColorCodes('&', replaceString));
        }
    }
}
