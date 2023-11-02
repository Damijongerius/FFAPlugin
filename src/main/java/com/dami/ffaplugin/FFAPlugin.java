package com.dami.ffaplugin;

import com.dami.ffaplugin.LeaderBoard.Database.Database;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

public final class FFAPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Database database = new Database();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void connectDb(){
        ConfigurationSection dbConfig = getConfig().getConfigurationSection("database");

        String url = dbConfig.getString("url");
        String user = dbConfig.getString("port");
        String password = dbConfig.getString("password");

        Database.setConnection(url, user, password);
    }
}
