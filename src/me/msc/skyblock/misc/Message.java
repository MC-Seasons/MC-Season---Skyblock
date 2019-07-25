package me.msc.skyblock.misc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Message {


    private final static int CENTER_PX = 154;

    public static void sendMessage(Player p, String message) {
        Player player = Bukkit.getPlayerExact(p.getName());
        String replaceString = message.replace("%","%%");
        String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "MC-Seasons" + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE;
        if (player != null) {
            player.sendMessage(prefix + replaceString);
        }
    }

    public static void sendCenteredMessage(Player player, String message){
        if(message == null || message.equals("")) player.sendMessage("");
        message = ChatColor.translateAlternateColorCodes('&', message);

        int messagePxSize = 0;
        boolean previousCode = false;
        boolean isBold = false;

        for(char c : message.toCharArray()){
            if(c == '§'){
                previousCode = true;
                continue;
            }else if(previousCode == true){
                previousCode = false;
                if(c == 'l' || c == 'L'){
                    isBold = true;
                    continue;
                }else isBold = false;
            }else{
                defaultFontInfo.DefaultFontInfo dFI = defaultFontInfo.DefaultFontInfo.getDefaultFontInfo(c);
                messagePxSize += isBold ? dFI.getBoldLength() : dFI.getLength();
                messagePxSize++;
            }
        }

        int halvedMessageSize = messagePxSize / 2;
        int toCompensate = CENTER_PX - halvedMessageSize;
        int spaceLength = defaultFontInfo.DefaultFontInfo.SPACE.getLength() + 1;
        int compensated = 0;
        StringBuilder sb = new StringBuilder();
        while(compensated < toCompensate){
            sb.append(" ");
            compensated += spaceLength;
        }
        player.sendMessage(sb.toString() + message);
    }
}
