package org.vx12.pets;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Pet extends JavaPlugin{

    private Pet plugin;
    public Pet getPlugin(){
        return plugin;
    }

    @Override
    public void onEnable() {
        getLogger().info("Summoning pets...");
        initCommands();
        initEvents();
    }

    @Override
    public void onDisable() {

    }

    public void initCommands(){

    }

    public void initEvents(){
        PluginManager pm = Bukkit.getPluginManager();

    }

}
