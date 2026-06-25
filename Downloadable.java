package com.mycompany.programminglearningsystem.database;

import java.sql.Connection;

public class DatabaseTest {

    public static void main(String[] args) {

        Connection conn =
                DatabaseConnection.getConnection();

        if(conn != null){

            System.out.println(
                    "Database Connected Successfully");
        }
        else{

            System.out.println(
                    "Connection Failed");
        }
    }
}