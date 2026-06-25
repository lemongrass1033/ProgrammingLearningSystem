package com.mycompany.programminglearningsystem.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.programminglearningsystem.database.DatabaseConnection;
import java.util.ArrayList;
import com.mycompany.programminglearningsystem.model.Material;

public class MaterialController {

    private ArrayList<Material> materials;

    public MaterialController() {
    materials = new ArrayList<>();
}

    public void uploadMaterial(Material material) {

    materials.add(material);

    

}
public Material getMaterial(int materialID) {

    for(Material m : materials) {

        if(m.getMaterialID() == materialID) {

            return m;
        }
    }

    return null;
}
    
    public void addMaterialToDatabase(Material material) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql ="INSERT INTO material "
                + "(materialID,fileName,fileType,topicID) "
                + "VALUES (?,?,?,?)";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1,material.getMaterialID());

        ps.setString(2,material.getFileName());

        ps.setString(3,material.getFileType());
        
        ps.setInt(4,material.getTopicID());

        ps.executeUpdate();

        System.out.println("Material Saved");

    } catch (Exception e) {

        e.printStackTrace();

    }
}
    
    public String searchMaterialByName(
        String keyword) {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM material "
                + "WHERE fileName LIKE ?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(
                1,
                "%" + keyword + "%");

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    "Material ID : "
                    + rs.getInt("materialID")
                    + "\nFile Name : "
                    + rs.getString("fileName")
                    + "\nFile Type : "
                    + rs.getString("fileType")
                    + "\n-------------------\n";
        }

        if(result.isEmpty()) {

            result =
                    "No Material Found";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    
    public String viewMaterialsFromDatabase() {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM material";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    "Material ID : "
                    + rs.getInt("materialID")
                    + "\nFile Name : "
                    + rs.getString("fileName")
                    + "\nFile Type : "
                    + rs.getString("fileType")
                    + "\n-------------------\n";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    
    public void updateMaterialInDatabase(
        Material material) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "UPDATE material "
                + "SET fileName=?, "
                + "fileType=? "
                + "WHERE materialID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setString(1,
                material.getFileName());

        ps.setString(2,
                material.getFileType());

        ps.setInt(3,
                material.getMaterialID());

        ps.executeUpdate();

        System.out.println(
                "Material Updated");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    
    public void deleteMaterialFromDatabase(
        int materialID) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "DELETE FROM material "
                + "WHERE materialID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1, materialID);

        ps.executeUpdate();

        System.out.println(
                "Material Deleted");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    
    public String viewMaterialByID(
        int materialID) {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM material "
                + "WHERE materialID = ?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1, materialID);

        ResultSet rs =
                ps.executeQuery();

        if(rs.next()) {

            result =
                    "Material ID : "
                    + rs.getInt("materialID")
                    + "\nFile Name : "
                    + rs.getString("fileName")
                    + "\nFile Type : "
                    + rs.getString("fileType");

        } else {

            result =
                    "Material Not Found";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    
    public String viewMaterialByTopic(
        int topicID) {

    String result = "";

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM material "
                + "WHERE topicID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(1, topicID);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()) {

            result +=
                    rs.getString("fileName")
                    + "\n";
        }

    } catch(Exception e) {

        e.printStackTrace();
    }

    return result;
}
    
    public boolean materialExists(
        int materialID) {

    try {

        Connection conn =
                DatabaseConnection.getConnection();

        String sql =
                "SELECT * FROM material "
                + "WHERE materialID=?";

        PreparedStatement ps =
                conn.prepareStatement(sql);

        ps.setInt(
                1,
                materialID);

        ResultSet rs =
                ps.executeQuery();

        return rs.next();

    } catch(Exception e) {

        e.printStackTrace();
    }

    return false;
}
}