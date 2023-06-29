package com.green.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "192.168.0.144";
    private final String PORT = "3306";
    private final String DB_NAME = "team_z";
    private final String URL;
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public MyConnection() {
        this.URL = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
    }

    public Connection getConn() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료!");
        return con;
    }
}
