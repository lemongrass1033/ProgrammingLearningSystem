package com.mycompany.programminglearningsystem.model;


import java.util.ArrayList;

public class Topic {

    private int topicID;
    private String topicName;
    private int course_id;

    private ArrayList<Material> materials;

    public Topic(
        int topicID,
        String topicName,
        int course_id) {

    this.topicID = topicID;
    this.topicName = topicName;
    this.course_id = course_id;

    materials = new ArrayList<>();
}

    public int getTopicID() {
    return topicID;
}
    
    public String getTopicName() {
        return topicName;
    }

    public int getCourseID() {
    return course_id;
}
    
    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }
}