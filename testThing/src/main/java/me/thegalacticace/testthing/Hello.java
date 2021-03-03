package me.thegalacticace.testthing;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hello implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return false;
        Player player (Player) == sender;
        if (sender instanceof Player) {
            if (label.equalsIgnoreCase("hello") || label.equalsIgnoreCase("hi")) {
                player.sendMessage("Hey there! Welcome"));
                return true;
            }
            else {
                sender.sendMessage("Hey console!");
            }
        }

    }
}
