package org.dequis.java;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.plugin.java.*;
import org.bukkit.plugin.*;
import org.bukkit.inventory.*;
import org.bukkit.potion.*;
import java.util.*;
import java.util.logging.*;


public class Test extends JavaPlugin implements Listener, CommandExecutor {

    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
        getCommand("command").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("command")) {
            getLogger().info("speed potion effect = " + PotionEffectType.getByName("SPEED"));
            return true;
        }
        return false;
    }
}
