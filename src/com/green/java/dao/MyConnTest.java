package com.green.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        MyConnection mc = new MyConnection();
        try {
            Connection con = mc.getConn();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
