package me.msc.skyblock;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import me.msc.skyblock.commands.*;
import me.msc.skyblock.events.*;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Logger;

public class Main extends JavaPlugin implements PluginMessageListener {

    private static Main instance;
    private static Main pl;
    public static Main getInstance() {
        return instance;
    }
    public static Location spawn = new Location(Bukkit.getWorld("world"), -74, 143, -105);
    public static HashMap<String, String> playerprefix = new HashMap<String, String>();
    public static HashMap<String, Integer> playerseasonpoints = new HashMap<String, Integer>();
    public static HashMap<String, Integer> playercoins = new HashMap<String, Integer>();
    Economy econ = null;

    private Connection connection;
    public String host, database, username, password, table;
    public int port;

    @Override
    public void onEnable(){

        //Setting the starting variables
        final Logger log = Logger.getLogger("Minecraft");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "Skyblock is starting up!");
        instance = this;
        this.pl = pl;
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();

        //MySQL Setup
        mysqlSetup();

        //Commands
        this.getCommand("fly").setExecutor(new CommandFly());
        this.getCommand("playerstate").setExecutor(new FakePlayer());
        this.getCommand("spawn").setExecutor(new SpawnCMD());
        this.getCommand("setspawn").setExecutor(new NewSpawn(this.pl));
        this.getCommand("updateprefix").setExecutor(new updatePrefix());
        this.getCommand("craft").setExecutor(new Craft());
        //Events
        this.getServer().getPluginManager().registerEvents(new Weather(), this);
        this.getServer().getPluginManager().registerEvents(new Interaction(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerChat(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerSpawn(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerDrop(), this);
        this.getServer().getPluginManager().registerEvents(new WorldInteraction(), this);
        this.getServer().getPluginManager().registerEvents(new CraftInventory(), this);
        this.getServer().getPluginManager().registerEvents(new PickUpEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SpawnProtection(), this);
        this.getServer().getPluginManager().registerEvents(new InventoryCloseEvent(), this);
        this.getServer().getPluginManager().registerEvents(new ZombieEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SkeletonEvent(), this);
        this.getServer().getPluginManager().registerEvents(new EntityDeath(), this);

        //Register Bungee events
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);


        //Load spawn location
        String world = this.getConfig().getString("spawn.world");
        double x = this.getConfig().getDouble("spawn.x");
        double y = this.getConfig().getDouble("spawn.y");
        double z = this.getConfig().getDouble("spawn.z");

        //Set spawn location
        spawn = new Location(Bukkit.getWorld(world), x, y, z);

        //Lobby loaded succesfully, let the console know :D
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Skyblock is working!");
    }

    @Override
    public void onDisable(){

        //Disabling the plugin
        instance = null;

        //Plugin disabled let the console know :(
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Lobby is disabled!");
    }

    public void mysqlSetup(){
        host = this.getConfig().getString("mysql.host");
        port = this.getConfig().getInt("mysql.port");
        database = this.getConfig().getString("mysql.database");
        username = this.getConfig().getString("mysql.username");
        password = this.getConfig().getString("mysql.password");

        try {
            synchronized (this) {
                if (getConnection() != null && !getConnection().isClosed()) {
                    return;
                }
                Class.forName("com.mysql.jdbc.Driver");
                setConnection(DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.username, this.password));

                Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "MySQL setup correctly!");
            }
        } catch(SQLException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!channel.equals("BungeeCord")) {
            return;
        }
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subchannel = in.readUTF();
        if (subchannel.equals("SomeSubChannel")) {
            // Use the code sample in the 'Response' sections below to read
            // the data.
        }
    }
}
