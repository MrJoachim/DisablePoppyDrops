package nl.mrjoachim.disablepoppydrops;

import nl.mrjoachim.disablepoppydrops.event.EntityDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class DisablePoppyDrops extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Disable Poppy Drops plugin enabled.");
        getServer().getPluginManager().registerEvents(new EntityDeathListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable Poppy Drops plugin disabled.");

    }
}
