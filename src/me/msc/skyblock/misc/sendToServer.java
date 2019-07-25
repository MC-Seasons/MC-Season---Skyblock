package me.msc.skyblock.misc;

import me.msc.skyblock.Main;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;


public class sendToServer {

    private static Plugin plugin = Main.getPlugin(Main.class);

    public static void sendPlayerToServer(Player p, String server){

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        DataOutputStream out = new DataOutputStream(b);

        try{

            out.writeUTF("Connect");
            out.writeUTF(server);

        } catch (Exception e) {
            e.printStackTrace();

        }

        p.sendPluginMessage(plugin,"BungeeCord", b.toByteArray());

    }

}
