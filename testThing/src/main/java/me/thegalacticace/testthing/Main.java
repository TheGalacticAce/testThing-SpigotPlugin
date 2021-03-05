package me.thegalacticace.testthing;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin starting up!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin shutting down.");
        // Plugin shutdown logic

    }

            public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
                Player player = (Player) sender;
                if (sender instanceof Player) {
                    if (label.equalsIgnoreCase("hello") || label.equalsIgnoreCase("hi")) {
                        player.sendMessage("Hey there! Welcome");
                        return true;
                    }
                    else {
                        sender.sendMessage("Hey console!");
                        return true;
                    }
                }
                return false;

            }

        }
