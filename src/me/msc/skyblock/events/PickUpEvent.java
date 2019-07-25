package me.msc.skyblock.events;

import me.msc.skyblock.misc.ItemToolInfo;
import me.msc.skyblock.misc.Message;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PickUpEvent implements Listener {


    @EventHandler(priority = EventPriority.NORMAL)
    public void PickUp(PlayerPickupItemEvent e) {

        Item item = e.getItem();
        Player player = (Player) e.getPlayer();
        if (!item.getItemStack().hasItemMeta()) {
            ItemToolInfo.ItemTool(item, player);
            Message.sendMessage(player, item.getItemStack().getType().toString());
        }

    }
}

