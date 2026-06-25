
package com.mycompany.programminglearningsystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseManager {
    
private static final String URL =
        "jdbc:mysql://localhost:3306/programming_learning_system";
    private static final String USER = "root";
    private static final String PASS = "";

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
   public ResultSet viewCourse() {

    ResultSet rs = null;

    try {

        Connection conn = getConnection();

        String sql =
                "SELECT * FROM courses";

        System.out.println("SQL Executed");

        PreparedStatement ps =
                conn.prepareStatement(sql);

        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return rs;
}
    
    
    
public void addEnrollment(
        String email,
        int courseId,
        String status) {

    String sql =
            "INSERT INTO enrollment "
            + "(user_email,course_id,enrollment_status) "
            + "VALUES(?,?,?)";

    try {

        Connection conn =
                getConnection();

PreparedStatement ps =
        conn.prepareStatement(
        sql,
        PreparedStatement.RETURN_GENERATED_KEYS);

        ps.setString(1, email);
        ps.setInt(2, courseId);
        ps.setString(3, status);

        int rows =
                ps.executeUpdate();
        
        ResultSet rs =
        ps.getGeneratedKeys();

int enrollmentId = 0;

if(rs.next()) {

    enrollmentId =
            rs.getInt(1);
}
        PreparedStatement ps2 =
        conn.prepareStatement(
        "INSERT INTO learning_progress " +
        "(enrollment_id, progress_percentage) " +
        "VALUES (?, ?)");

ps2.setInt(1, enrollmentId);
ps2.setDouble(2, 0);

ps2.executeUpdate();

PreparedStatement ps3 =
        conn.prepareStatement(
        "INSERT INTO completion_status " +
        "(enrollment_id, completion_percentage) " +
        "VALUES (?, ?)");

ps3.setInt(1, enrollmentId);
ps3.setDouble(2, 0);

ps3.executeUpdate();

        System.out.println(
                "Rows Added = " + rows);

        conn.close();

    } catch(Exception e) {

        e.printStackTrace();
    }
}

    public ResultSet viewEnrollment() {
    ResultSet rs = null;
    try {
        Connection conn =getConnection();
        String sql ="SELECT * FROM enrollment";
        PreparedStatement ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

    } catch(Exception e) {
        e.printStackTrace();
    }
    return rs;
}
    
    
    public void deleteEnrollment(int enrollmentId) {
   String sql =
        "DELETE FROM enrollment "
        + "WHERE enrollment_id=?";

    try {
        Connection conn = getConnection();
       PreparedStatement ps1 =
        conn.prepareStatement(
        "DELETE FROM learning_progress " +
        "WHERE enrollment_id=?");

ps1.setInt(1,enrollmentId);
ps1.executeUpdate();
PreparedStatement ps2 = conn.prepareStatement("DELETE FROM completion_status " + "WHERE enrollment_id=?");
ps2.setInt(1,enrollmentId);
ps2.executeUpdate();

PreparedStatement ps3 =
conn.prepareStatement(
"DELETE FROM enrollment "
+ "WHERE enrollment_id=?");

ps3.setInt(1,enrollmentId);
ps3.executeUpdate();
        conn.close();
        System.out.println("Enrollment Deleted");

    } catch(Exception e) {

        e.printStackTrace();
    }
}

    
public void updateProgress(int progressId, double progressPercentage){
    String sql ="UPDATE learning_progress " + "SET progress_percentage=? " +"WHERE enrollment_id=?";

    try {
        Connection conn =getConnection();
        PreparedStatement ps =conn.prepareStatement(sql);
        ps.setDouble(1,progressPercentage);
        ps.setInt(2,progressId);
        ps.executeUpdate();
        conn.close();

        System.out.println("Progress Updated");

    } catch(Exception e) {
        System.out.println( e.getMessage());
    }
}

public void updateCompletion( int statusId, double completionPercentage){
    String sql ="UPDATE completion_status "  +  "SET completion_percentage=? " + "WHERE  enrollment_id=?";

    try {

        Connection conn =getConnection();
        PreparedStatement ps =conn.prepareStatement(sql);

        ps.setDouble(1,completionPercentage);
        ps.setInt(2, statusId);
        ps.executeUpdate();
        conn.close();

        System.out.println("Completion Updated");
        
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
}

public ResultSet viewProgress() {
    ResultSet rs = null;
    try {
        Connection conn =getConnection();

        String sql ="SELECT * FROM learning_progress";

        PreparedStatement ps = conn.prepareStatement(sql);

        rs = ps.executeQuery();

    } catch(Exception e) {
        e.printStackTrace();
    }
    return rs;
}
public ResultSet viewCompletion() {
    ResultSet rs = null;
    try {
        Connection conn = getConnection();

        String sql = "SELECT * FROM completion_status";

        PreparedStatement ps = conn.prepareStatement(sql);

        rs = ps.executeQuery();

    } catch(Exception e) {
        e.printStackTrace();
    }
    return rs;
}

public ResultSet getLearningProgress() {

    ResultSet rs = null;

    try {
        
        Connection conn =getConnection();
        String sql ="SELECT * FROM learning_progress";
        PreparedStatement ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }
    return rs;
}
public ResultSet getCompletionStatus() {
    ResultSet rs = null;

    try {
        
        Connection conn = getConnection();
        String sql = "SELECT * FROM completion_status";
        PreparedStatement ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

    } catch(Exception e) {
        e.printStackTrace();
    }
    return rs;
}

public String getUserEmailByEnrollment(
        int enrollmentId) {

    String email = "";

    try {

        Connection conn =
                getConnection();

        String sql =
                "SELECT user_email "
                + "FROM enrollment "
                + "WHERE enrollment_id=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1, enrollmentId);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            email =
                    rs.getString(
                    "user_email");
        }

        conn.close();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return email;
}

public void registerCourse(
        String email,
        int courseId) {

    try {

        Connection conn =
                getConnection();

        String checkSql =
                "SELECT * FROM enrollment "
                + "WHERE user_email=? "
                + "AND course_id=?";

        PreparedStatement check =
                conn.prepareStatement(checkSql);

        check.setString(1, email);
        check.setInt(2, courseId);

        ResultSet rs =
                check.executeQuery();

        if(rs.next()) {

            System.out.println(
                    "Already Registered");

            conn.close();
            return;
        }

        String sql =
                "INSERT INTO enrollment "
                + "(user_email,course_id,enrollment_status) "
                + "VALUES(?,?,?)";

        PreparedStatement ps =
                conn.prepareStatement(
                        sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);

        ps.setString(1, email);
        ps.setInt(2, courseId);
        ps.setString(3, "Active");

        ps.executeUpdate();

        ResultSet keys =
                ps.getGeneratedKeys();

        int enrollmentId = 0;

        if(keys.next()) {

            enrollmentId =
                    keys.getInt(1);
        }

        String progressSql =
                "INSERT INTO learning_progress "
                + "(enrollment_id,progress_percentage) "
                + "VALUES(?,?)";

        PreparedStatement progressPs =
                conn.prepareStatement(progressSql);

        progressPs.setInt(1, enrollmentId);
        progressPs.setDouble(2, 0);

        progressPs.executeUpdate();

        String completionSql =
                "INSERT INTO completion_status "
                + "(enrollment_id,completion_percentage) "
                + "VALUES(?,?)";

        PreparedStatement completionPs =
                conn.prepareStatement(completionSql);

        completionPs.setInt(1, enrollmentId);
        completionPs.setDouble(2, 0);

        completionPs.executeUpdate();

        conn.close();

    } catch(Exception e) {

        e.printStackTrace();
    }
}
public ResultSet viewStudentProgress(
        String email) {

    ResultSet rs = null;

    try {

        Connection conn =
                getConnection();

        String sql =
                "SELECT c.course_name, "
                + "lp.progress_percentage "
                + "FROM learning_progress lp "
                + "JOIN enrollment e "
                + "ON lp.enrollment_id = e.enrollment_id "
                + "JOIN courses c "
                + "ON e.course_id = c.course_id "
                + "WHERE e.user_email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return rs;
}
public ResultSet viewStudentCompletion(
        String email) {

    ResultSet rs = null;

    try {

        Connection conn =
                getConnection();

        String sql =
                "SELECT c.course_name, "
                + "cs.completion_percentage "
                + "FROM completion_status cs "
                + "JOIN enrollment e "
                + "ON cs.enrollment_id = e.enrollment_id "
                + "JOIN courses c "
                + "ON e.course_id = c.course_id "
                + "WHERE e.user_email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return rs;
}
public ResultSet viewAllStudentsProgress() {

    ResultSet rs = null;

    try {

        Connection conn = getConnection();

        String sql =
                "SELECT e.user_email, "
                + "c.course_name, "
                + "lp.progress_percentage "
                + "FROM learning_progress lp "
                + "JOIN enrollment e "
                + "ON lp.enrollment_id = e.enrollment_id "
                + "JOIN courses c "
                + "ON e.course_id = c.course_id";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return rs;
}public ResultSet viewAllStudentsCompletion() {

    ResultSet rs = null;

    try {

        Connection conn = getConnection();

        String sql =
                "SELECT e.user_email, "
                + "c.course_name, "
                + "cs.completion_percentage "
                + "FROM completion_status cs "
                + "JOIN enrollment e "
                + "ON cs.enrollment_id = e.enrollment_id "
                + "JOIN courses c "
                + "ON e.course_id = c.course_id";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        rs = ps.executeQuery();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return rs;
}

public int getRegisteredCourseId(
        String email) {

    int courseId = -1;

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT course_id "
                + "FROM enrollment "
                + "WHERE user_email=? "
                + "AND enrollment_status='Active'";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            courseId =
                    rs.getInt("course_id");
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return courseId;
}}

