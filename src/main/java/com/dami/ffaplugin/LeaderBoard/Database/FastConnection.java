package com.dami.ffaplugin.LeaderBoard.Database;

import java.sql.Connection;
import java.sql.SQLException;

public class FastConnection extends Database{

    protected static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
