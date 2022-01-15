package com.gmail.pointchanneru.hothotlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Hothotlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hot").setExecutor(new CommandHot());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
