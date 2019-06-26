package com.jugondavidlisto.TestingPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestingPlugin extends JavaPlugin {
        @Override
        public void onEnable() {
            getLogger().info("onEnable is called!");
        }
        @Override
        public void onDisable() {
            getLogger().info("onDisable is called!");
        }

}
