package com.mycompany.programminglearningsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.mycompany.programminglearningsystem.model.Skill;
import com.mycompany.programminglearningsystem.database.DatabaseConnection;

public class SkillDAO {

    public boolean addSkill(
            String email,
            String skillName) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO user_skills(email,skill_name) "
                    + "VALUES(?,?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, skillName);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }

    
public ArrayList<Skill> getSkillsByEmail(
        String email) {

    ArrayList<Skill> skills =
            new ArrayList<>();

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT skill_name "
                + "FROM user_skills "
                + "WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            skills.add(
                    new Skill(
                            rs.getString(
                                    "skill_name")));
        }

    } catch(Exception e) {

        System.out.println(
                e.getMessage());
    }

    return skills;
}
    public boolean deleteSkillsByEmail(
        String email){

    try{

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "DELETE FROM user_skills "
                + "WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        return ps.executeUpdate() >= 0;

    }catch(Exception e){

        return false;
    }
}
    public ArrayList<String> getAllEmails() {

    ArrayList<String> emails =
            new ArrayList<>();

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT DISTINCT email "
                + "FROM user_skills";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            emails.add(
                    rs.getString("email"));
        }

    } catch(Exception e) {

        System.out.println(
                e.getMessage());
    }

    return emails;
}
    
}