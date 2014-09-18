package org.dequis.java;

import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.*;
import org.bukkit.plugin.*;
import org.bukkit.inventory.*;
import java.util.*;
import java.util.logging.*;


public class Test extends JavaPlugin implements Listener, CommandExecutor {

    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        getLogger().info("onPlayerLogin: player.isOnline() == " + event.getPlayer().isOnline());

    }
}
