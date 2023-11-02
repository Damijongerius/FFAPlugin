package com.dami.ffaplugin.LeaderBoard;

import com.dami.ffaplugin.FFAPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class LeaderboardCommand implements TabExecutor {

    public LeaderboardCommand(FFAPlugin ffaPlugin) {
        ffaPlugin.getCommand("leaderboard").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
