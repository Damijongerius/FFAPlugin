package com.dami.ffaplugin.Pvp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Match {

    private Map<MatchPlayer,MatchRole> players = new HashMap<>();

    private final Date startTime;
    private Date endTime;

    public Match(MatchPlayer player1, MatchPlayer player2){
        this.players.put(player1, MatchRole.INCOMBAT);
        this.players.put(player2, MatchRole.INCOMBAT);
        this.startTime = new Date();
    }

    public void finishMatch(UUID winner, UUID loser, String WinCause){
        this.endTime = new Date();
        for (MatchPlayer player : this.players.keySet()){
            if (player.getPlayer().equals(winner)){
                this.players.put(player, MatchRole.WINNER);
            } else if (player.getPlayer().equals(loser)){
                this.players.put(player, MatchRole.LOSER);
            } else {
                this.players.put(player, MatchRole.ASSISTANT);
            }
        }
    }

}
