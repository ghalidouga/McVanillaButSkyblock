package com.ghalidouga.vanillabutskyblock;

import Events.OnJoin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WorldBorder;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class VanillaButSkyBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnJoin(),this);
//        Random randomGenerator = new Random();
//        int randomNumber = randomGenerator.nextInt(901 - 900) + 900;
//        Location randomLocation = new Location(Bukkit.getWorld("Blast"),randomNumber,0,randomNumber);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
