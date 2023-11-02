package com.dami.ffaplugin.LeaderBoard.LeaderboardDB;

import com.dami.ffaplugin.LeaderBoard.Database.FastConnection;
import com.dami.ffaplugin.LeaderBoard.Database.sqlStrings;

import java.sql.Statement;

public class LeaderboardConnection extends FastConnection {

    public LeaderboardConnection(String schema) {
        init(schema);
    }

    public void init(String schema) {
        String sql = sqlStrings.init(schema);
        try {
            Statement statement = getConnection().createStatement();

            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
