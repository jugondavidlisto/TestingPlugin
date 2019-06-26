package com.jugondavidlisto.TestingPlugin.database;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Pagina web de documentacion de esta pagina y del DAO
 * https://stackoverflow.com/questions/34856113/implementing-sql-in-a-bukkit-spigot-plugin
 */
public class MySQL {
    public static String host = "localhost";
    public static String port = "3306";
    public static String database = "pruebas_server";
    public static String username = "root";
    public static String password = "";
    public static Connection con;

    static ConsoleCommandSender console = Bukkit.getConsoleSender();

    // connect
    public static void connect() {
        if (!isConnected()) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                console.sendMessage("\247c[\2476Minepedia-System\247c] \247bMySQL-Verbindung wurde aufgebaut!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // disconnect
    public static void disconnect() {
        if (isConnected()) {
            try {
                con.close();
                console.sendMessage("\247c[\2476Minepedia-System\247c]\247bMySQL-Verbindung wurde geschlossen!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // isConnected
    public static boolean isConnected() {
        return (con == null ? false : true);
    }

    // getConnection
    public static Connection getConnection() {
        return con;
    }
}
