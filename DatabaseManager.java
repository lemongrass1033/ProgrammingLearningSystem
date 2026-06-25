package com.mycompany.programminglearningsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mycompany.programminglearningsystem.database.DatabaseConnection;

public class TeamDAO {

    public boolean saveTeam(
            String email,
            String teammate) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO team_selection "
                    + "(user_email, teammate_name) "
                    + "VALUES (?, ?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, teammate);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            System.out.println(
                    e.getMessage());

            return false;
        }
    }
}