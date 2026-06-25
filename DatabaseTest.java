package com.mycompany.programminglearningsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mycompany.programminglearningsystem.database.DatabaseConnection;
import com.mycompany.programminglearningsystem.model.User;

public class UserDAO {

public boolean registerUser(User user) {

    try {

        System.out.println("REGISTER START");

        Connection conn =
                DatabaseConnection.getConnection();

   

        String sql =
                "INSERT INTO users(username,email,password,skill) "
                + "VALUES(?,?,?,?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, user.getUsername());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getSkill());

        int result = ps.executeUpdate();

        System.out.println("RESULT = " + result);

        return true;

    } catch(Exception e) {

        e.printStackTrace();

        return false;
    }
}
    public boolean loginUser(
        String email,
        String password) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

       String sql =
        "SELECT * FROM users "
        + "WHERE email=? "
        + "AND password=? "
        + "AND status='Active'";
        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs =
                ps.executeQuery();

        return rs.next();

    } catch(Exception e) {

        System.out.println(
                e.getMessage());

        return false;
    }
}
    public boolean updateUser(
        String username,
        String email,
        String skill,
        String github) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "UPDATE users "
                + "SET username=?, skill=?, github_link=? "
                + "WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, skill);
        ps.setString(3, github);
        ps.setString(4, email);

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

        System.out.println(e.getMessage());

        return false;
    }
}
    public User getUserByEmail(String email) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM users WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            return new User(
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getString("skill")
            );
        }

    } catch(Exception e) {

        System.out.println(e.getMessage());
    }

    return null;
}
   public String getTeamBySkill(
        String skill,
        String currentEmail) {

    StringBuilder result =
            new StringBuilder();

    try {

        Connection conn =
                DatabaseConnection.getConnection();
String sql =
        "SELECT username,skill,github_link "
        + "FROM users "
        + "WHERE skill=? "
        + "AND email<>? "
        + "AND status='Active'";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, skill);
        ps.setString(2, currentEmail);

        ResultSet rs =
                ps.executeQuery();

        result.append("Recommended Team\n\n");

      boolean found = false;
int count = 0;
while(rs.next()) {

    found = true;
count++;
    result.append("Username : ")
          .append(rs.getString("username"))
          .append("\n");

    result.append("Skill : ")
          .append(rs.getString("skill"))
          .append("\n");

    result.append("Github : ")
          .append(rs.getString("github_link"))
          .append("\n\n");
}

if(found){

    result.insert(
            "Recommended Team\n\n".length(),
            "Total Members Found : "
            + count
            + "\n\n");
}

if(!found){

    result.append(
            "No matching team members found.");

}

    } catch(Exception e) {

        result.append(
                e.getMessage());
    }

    return result.toString();
}
    public boolean emailExists(String email) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM users WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs =
                ps.executeQuery();

        return rs.next();

    } catch(Exception e) {

        return false;
    }
}
    public String getUserRole(String email) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT role FROM users WHERE email=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            return rs.getString("role");
        }

    } catch(Exception e) {

        System.out.println(e.getMessage());
    }

    return "";
}
    public User getUserByUsername(String username) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

      String sql =
        "SELECT * FROM users "
        + "WHERE LOWER(username)=LOWER(?)"
        + "AND role='User'";
        

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, username);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

        User user = new User(
        rs.getString("username"),
        rs.getString("email"),
        rs.getString("password"),
        rs.getString("skill")
);

user.setRole(
        rs.getString("role"));

user.setStatus(
        rs.getString("status"));

return user;
        }

    } catch(Exception e) {

        System.out.println(
                e.getMessage());
    }

    return null;
}
    public boolean deactivateUser(
        String username) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "UPDATE users "
                + "SET status='Inactive' "
                + "WHERE username=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, username);

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

        System.out.println(
                e.getMessage());

        return false;
    }
}
    public boolean updateRole(
        String username,
        String role) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "UPDATE users "
                + "SET role=? "
                + "WHERE username=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, role);
        ps.setString(2, username);

        return ps.executeUpdate() > 0;

    } catch(Exception e) {

        System.out.println(
                e.getMessage());

        return false;
    }
}
   public User getAnyUserByUsername(
        String username) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM users "
                + "WHERE LOWER(username)=LOWER(?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1, username);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            User user = new User(
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getString("skill"));

            user.setRole(
                    rs.getString("role"));

            user.setStatus(
                    rs.getString("status"));

            return user;
        }

    } catch(Exception e) {

        System.out.println(
                e.getMessage());
    }

    return null;
}
}
    
    
