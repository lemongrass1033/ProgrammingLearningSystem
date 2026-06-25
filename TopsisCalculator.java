package com.mycompany.programminglearningsystem.controller;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.programminglearningsystem.model.Topic;
import com.mycompany.programminglearningsystem.database.DatabaseConnection;

public class TopicController {

    private ArrayList<Topic> topics;

    public TopicController() {

        topics = new ArrayList<>();
    }

    public void createTopic(
            Topic topic) {

        topics.add(topic);
    }

    public ArrayList<Topic> getTopics() {

        return topics;
    }
    
    public void addTopicToDatabase(
        Topic topic) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "INSERT INTO topic "
                + "(topicID,topicName,course_id) "
                + "VALUES (?,?,?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                topic.getTopicID());

        ps.setString(
                2,
                topic.getTopicName());

        ps.setInt(
                3,
                topic.getCourseID());

        ps.executeUpdate();

        System.out.println(
                "Topic Saved");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    public String viewTopicsFromDatabase() {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM topic";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    "Topic ID : "
                    + rs.getInt("topicID")
                    + "\nTopic Name : "
                    + rs.getString("topicName")
                    + "\nCourse ID : "
                    + rs.getString("course_id")
                    + "\n-------------------\n";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    public void updateTopicInDatabase(
        Topic topic) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "UPDATE topic "
                + "SET topicName=?, "
                + "course_id=? "
                + "WHERE topicID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(
                1,
                topic.getTopicName());

        ps.setInt(
                2,
                topic.getCourseID());

        ps.setInt(
                3,
                topic.getTopicID());

        ps.executeUpdate();

        System.out.println(
                "Topic Updated");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    
    public void deleteTopicFromDatabase(
        int topicID) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "DELETE FROM topic "
                + "WHERE topicID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                topicID);

        ps.executeUpdate();

        System.out.println(
                "Topic Deleted");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    
    public String viewTopicsByCourse(
        int courseID) {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM topic "
                + "WHERE course_id=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                courseID);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    rs.getString("topicName")
                    + "\n";
        }

        if(result.isEmpty()) {

            result =
                    "No Topics Found";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    
    public String searchTopicByCourseID(
        int courseID) {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM topic "
                + "WHERE course_id=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                courseID);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    rs.getInt("topicID")
                    + " - "
                    + rs.getString("topicName")
                    + "\n";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    if(result.isEmpty()) {

        return "No Topics Found";
    }

    return result;
}
    
    public boolean topicExists(
        int topicID) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM topic "
                + "WHERE topicID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                topicID);

        ResultSet rs =
                ps.executeQuery();

        return rs.next();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return false;
}
}