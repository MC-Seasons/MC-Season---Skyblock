package me.msc.skyblock.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import static me.msc.skyblock.Main.*;

public class PlayerSpawn implements Listener {

    @EventHandler(priority= EventPriority.HIGHEST)
    public void playerSpawn(PlayerRespawnEvent e) {
        e.setRespawnLocation(spawn);
    }
}
