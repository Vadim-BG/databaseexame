package com.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class Main {
    public static void main(String[] args) {
        Connection connection;
        try {
            Driver driver = new FabricMySQLDriver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
