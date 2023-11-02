package com.dami.ffaplugin.LeaderBoard.Database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    private static HikariConfig config = new HikariConfig();
    protected static HikariDataSource ds;

    public static void  setConnection(String url, String username, String password) {

        config.setJdbcUrl( url );
        config.setUsername( username );
        config.setPassword( password );

        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );

        ds = new HikariDataSource( config );
    }
}
