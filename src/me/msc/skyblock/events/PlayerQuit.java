package me.msc.skyblock.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static me.msc.skyblock.Main.playerprefix;
import static me.msc.skyblock.Main.playerseasonpoints;

public class PlayerQuit implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onPlayerQuit(PlayerQuitEvent e){
        e.setQuitMessage("");

        playerprefix.remove(e.getPlayer());
        playerseasonpoints.remove(e.getPlayer());
    }
}
