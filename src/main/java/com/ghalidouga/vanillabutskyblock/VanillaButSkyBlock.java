package com.ghalidouga.vanillabutskyblock;

import Events.AntiBuildSpawn;
import Events.AntiGriefSpawn;
import Events.OnJoin;
import Events.StartJourney;
import org.bukkit.plugin.java.JavaPlugin;

public final class VanillaButSkyBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnJoin(),this);
        getServer().getPluginManager().registerEvents(new StartJourney(),this);
        getServer().getPluginManager().registerEvents(new AntiGriefSpawn(),this);
        getServer().getPluginManager().registerEvents(new AntiBuildSpawn(),this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
