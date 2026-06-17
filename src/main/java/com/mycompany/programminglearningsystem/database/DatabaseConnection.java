package com.mycompany.programminglearningsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

  private static final String URL =
    "jdbc:mysql://127.0.0.1:3306/programming_learning_system";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD);

        } catch (Exception e) {

    e.printStackTrace();

    return null;
}}
        
    }
