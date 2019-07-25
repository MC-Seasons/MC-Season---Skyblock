package me.msc.skyblock.events;

import me.msc.skyblock.Main;
import me.msc.skyblock.misc.Message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.*;

import java.util.ArrayList;
import java.util.List;

import static me.msc.skyblock.Main.*;
import static me.msc.skyblock.MySQL.MysqlSetterGetter.createPlayer;
import static me.msc.skyblock.MySQL.MysqlSetterGetter.getPlayerData;

public class PlayerJoin implements Listener {

    private static Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent e) {


        //Skyblock Menu
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Skyblock Menu " + ChatColor.GRAY + "(Right click)");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.GRAY + "This is the skyblock menu");
        lore.add(ChatColor.GRAY + "View all your progress, collections");
        lore.add(ChatColor.GRAY + "skills, recipies and more!");
        lore.add(ChatColor.GRAY + "");
        lore.add(ChatColor.YELLOW + "Click to open!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        //Casting to a player
        final Player player = (Player) e.getPlayer();

        //Set skyblock menu in inventory
        player.getInventory().setItem(8, item);

        //Empty join message
        e.setJoinMessage("");

        //Checking if player exsists
        createPlayer(player.getUniqueId(), player);

        //Add player data to hashmap
        getPlayerData(player.getUniqueId(), player);

        //Teleport player to spawn
        player.teleport(spawn);
        player.setFlying(false);
        player.setAllowFlight(false);

        //Send the player a welcome message
        player.sendMessage("§m-----------------------------------------------------");
        player.sendMessage("");
        Message.sendCenteredMessage(player, ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "MC-Seasons" + ChatColor.DARK_GRAY + "]");
        player.sendMessage("");
        Message.sendCenteredMessage(player, ChatColor.GOLD + "Welcome to the MC-Seasons network, " + player.getName() + "!");
        Message.sendCenteredMessage(player, ChatColor.GOLD + "You are currently connected to:");
        Message.sendCenteredMessage(player, ChatColor.GOLD + "Skyblock Season 1");
        player.sendMessage("");
        Message.sendCenteredMessage(player, ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "MC-Seasons" + ChatColor.DARK_GRAY + "]");
        player.sendMessage("");
        player.sendMessage("§m-----------------------------------------------------");

        //Scoreboard

        BukkitScheduler gameStarter = Bukkit.getServer().getScheduler();
        gameStarter.scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                if(player.getName() == null){
                    return;
                }
                ScoreboardManager m = Bukkit.getScoreboardManager();
                Scoreboard b = m.getNewScoreboard();


                //double coins = econ.getBalance(player.getName());

                Objective o = b.registerNewObjective("SeasonPoints", "");
                o.setDisplaySlot(DisplaySlot.SIDEBAR);
                o.setDisplayName(ChatColor.DARK_AQUA + "MC-Seasons Skyblock");

                Score emptyline6 = o.getScore("     ");
                Score rankText = o.getScore(ChatColor.WHITE + "Rank:");
                Score rankTitle = o.getScore(ChatColor.translateAlternateColorCodes('&', playerprefix.get(player.getName())));
                Score emptyline5 = o.getScore("    ");
                Score seasonPointsText = o.getScore(ChatColor.WHITE + "Season:");
                Score seasonPointsAmmount = o.getScore(ChatColor.RED + "No database connection!");
                Score emptyline4 = o.getScore("   ");
                Score islandLevelText = o.getScore(ChatColor.WHITE + "Island level:");
                Score islandLevelAmmount = o.getScore(ChatColor.GOLD + "" + com.wasteofplastic.askyblock.ASkyBlockAPI.getInstance().getIslandLevel(player.getUniqueId()));
                Score emptyline3 = o.getScore("  ");
                Score skyblockCoinsText = o.getScore(ChatColor.WHITE + "Skyblock Coins:");
                Score skyblockCoinsAmmount = o.getScore(ChatColor.GOLD + "" + playercoins.get(player.getName()));
                Score emptyline2 = o.getScore(" ");
                Score website = o.getScore(ChatColor.YELLOW + "www.mc-seasons.com");

                emptyline6.setScore(14);
                rankText.setScore(13);
                rankTitle.setScore(12);
                emptyline5.setScore(11);
                seasonPointsText.setScore(10);
                seasonPointsAmmount.setScore(9);
                emptyline4.setScore(8);
                islandLevelText.setScore(7);
                islandLevelAmmount.setScore(6);
                emptyline3.setScore(5);
                skyblockCoinsText.setScore(4);
                skyblockCoinsAmmount.setScore(3);
                emptyline2.setScore(2);
                website.setScore(1);


                player.setScoreboard(b);
            }
        }, 0L, 20L);

    }

}
