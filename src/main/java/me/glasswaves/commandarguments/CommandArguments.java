package me.glasswaves.commandarguments;

import me.glasswaves.commandarguments.Commands.Kill;
import me.glasswaves.commandarguments.Commands.SendWord;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandArguments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("sendWord").setExecutor(new SendWord());
        getCommand("bringDeath").setExecutor(new Kill());

    }


}
