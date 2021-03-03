package me.thegalacticace.testthing;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin starting up!")
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin shutting down.");
        // Plugin shutdown logic



    }
}
