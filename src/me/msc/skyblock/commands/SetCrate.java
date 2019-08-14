package me.msc.skyblock.commands;

import me.msc.skyblock.crate.Key;
import me.msc.skyblock.crate.KeyType;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class SetCrate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            //get vote key
            if (strings.length >0){
                if (strings[0].equals("votekey")){
                    ((Player) commandSender).getInventory().addItem(Key.getKey(KeyType.VoteKey,1));

                }else if (strings[0].equals("legendkey")){
                    ((Player) commandSender).getInventory().addItem(Key.getKey(KeyType.LegendaryKey,1));

                }else if (strings[0].equals("rarekey")){
                    ((Player) commandSender).getInventory().addItem(Key.getKey(KeyType.RareKey,1));

                }
                return true;
            }

            ItemStack item = new ItemStack(Material.BLAZE_ROD);
            List<String> lore = new ArrayList<String>();
            lore.add("Vote Crate Creator");
            ItemMeta meta = (ItemMeta) item.getItemMeta();
            meta.setLore(lore);
            meta.setDisplayName("Vote Crate Creator");
            item.setItemMeta(meta);
            ((Player) commandSender).getInventory().addItem(item);
            return true;
        }
        return false;
    }
}
