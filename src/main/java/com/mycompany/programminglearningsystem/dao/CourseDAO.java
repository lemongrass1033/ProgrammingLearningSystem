package com.mycompany.programminglearningsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mycompany.programminglearningsystem.database.DatabaseConnection;

public class CourseDAO {

    public boolean addCourse(
            String courseName) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "INSERT INTO courses(course_name) "
                    + "VALUES(?)";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, courseName);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }

    public boolean courseExists(
            String courseName) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "SELECT * FROM courses "
                    + "WHERE course_name=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, courseName);

            ResultSet rs =
                    ps.executeQuery();

            return rs.next();

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }

    public ArrayList<String> getCourses() {

        ArrayList<String> courses =
                new ArrayList<>();

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "SELECT * FROM courses "
                    + "ORDER BY course_name";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                courses.add(
                        rs.getString("course_name"));
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }

        return courses;
    }

    public boolean deleteCourse(
            String courseName) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "DELETE FROM courses "
                    + "WHERE course_name=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, courseName);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }

    public boolean updateCourse(
            String oldCourse,
            String newCourse) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "UPDATE courses "
                    + "SET course_name=? "
                    + "WHERE course_name=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, newCourse);
            ps.setString(2, oldCourse);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }
}