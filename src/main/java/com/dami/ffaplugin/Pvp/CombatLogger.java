package com.dami.ffaplugin.Pvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class CombatLogger implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {

    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {

    }

    @EventHandler
    public void onPlayerHit(EntityDamageEvent e){

    }
}
