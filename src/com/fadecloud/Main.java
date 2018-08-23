package com.fadecloud;

import com.fadecloud.commands.GiveJuul;
import com.fadecloud.events.ClickEvent;
import com.fadecloud.events.DragEvent;
import com.fadecloud.events.PlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("juul").setExecutor(new GiveJuul());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
        getServer().getPluginManager().registerEvents(new PlaceEvent(), this);
        getServer().getPluginManager().registerEvents(new DragEvent(), this);

    }

    @Override
    public void onDisable() {

    }

}
