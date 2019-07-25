package me.msc.skyblock.MySQL;

import me.msc.skyblock.Main;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import static me.msc.skyblock.Main.*;

public class MysqlSetterGetter {
    static Main plugin = Main.getPlugin(Main.class);

    public static boolean playerExsists(UUID uuid){
        try {
            PreparedStatement statement = plugin.getConnection().prepareStatement("SELECT * FROM userdata WHERE uuid =?");
            statement.setString(1, uuid.toString());

            ResultSet results = statement.executeQuery();
            if(results.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void createPlayer(final UUID uuid, Player player){
        try{
            PreparedStatement statement = plugin.getConnection().prepareStatement("SELECT * FROM userdata WHERE uuid =?");
            statement.setString(1, uuid.toString());
            ResultSet results = statement.executeQuery();
            results.next();
            if(playerExsists(uuid) != true){
                PreparedStatement insert = plugin.getConnection().prepareStatement("INSERT INTO userdata (UUID, username) VALUE (?,?)");
                insert.setString(1, uuid.toString());
                insert.setString(2, player.getName());
                insert.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void getPlayerData(UUID uuid, Player player) {
        try {
            PreparedStatement statement = plugin.getConnection().prepareStatement("SELECT * FROM userdata WHERE uuid =?");
            statement.setString(1, uuid.toString());
            ResultSet results = statement.executeQuery();
            results.next();

            playerprefix.put(player.getName(), results.getString("prefix"));
            playerseasonpoints.put(player.getName(), results.getInt("seasonpoints"));
            playercoins.put(player.getName(), results.getInt("skyblockcoins"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePrefix(UUID uuid, Player player, String newPrefix) {
        try {

            playerprefix.remove(player.getName());

            String prefix = "&8[&fPlayer&8]&r";

            if(newPrefix.equalsIgnoreCase("helper")) {
                prefix = "&8[&9Helper&8]&r";
            } else if(newPrefix.equalsIgnoreCase("moderator")) {
                prefix = "&8[&9Moderator&8]&r";
            } else if(newPrefix.equalsIgnoreCase("admin")) {
                prefix = "&8[&cAdmin&8]&r";
            } else if(newPrefix.equalsIgnoreCase("owner")) {
                prefix = "&8[&4Admin&8]&r";
            }

            playerprefix.put(player.getName(), prefix);

            PreparedStatement statement = plugin.getConnection().prepareStatement("UPDATE userdata SET `prefix`=? WHERE uuid=?");
            statement.setString(1, prefix);
            statement.setString(2, uuid.toString());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
