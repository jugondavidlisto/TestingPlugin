package com.jugondavidlisto.TestingPlugin.database.dao;

import com.jugondavidlisto.TestingPlugin.database.MySQL;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PruebaDAO {
    public void createTablaPlayer() {
        if (MySQL.isConnected()) {
            /*try {
                PreparedStatement ps = MySQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS Players (Name VARCHAR(100),UUID VARCHAR(100),Coins INT(100),PRIMARY KEY (Name))");
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }*/
            System.out.println("KK YES");
        } else {
            System.out.println("NOT KK");
        }
    }
}
