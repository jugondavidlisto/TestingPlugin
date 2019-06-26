package com.jugondavidlisto.TestingPlugin;

import com.jugondavidlisto.TestingPlugin.database.MySQL;
import com.jugondavidlisto.TestingPlugin.database.dao.PruebaDAO;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class TestingPlugin extends JavaPlugin {

    private PruebaDAO pruebaDAO;

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        MySQL.connect();
        // Register our command "kit" (set an instance of your command class as executor)
        this.getCommand("kit").setExecutor((CommandExecutor) new CommandKit());
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
