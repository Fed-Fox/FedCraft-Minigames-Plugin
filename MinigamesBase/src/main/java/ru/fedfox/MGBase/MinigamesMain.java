package ru.fedfox.MGBase;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class MinigamesMain extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }
}
