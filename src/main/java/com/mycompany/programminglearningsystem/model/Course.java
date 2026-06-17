package com.mycompany.programminglearningsystem.model;

import java.util.ArrayList;

public class Course {

    private String courseId;
    private String courseName;
    private String description;
    private int capacity;

    //private ArrayList<Topic> topics;

    public Course(
            String courseId,
            String courseName,
            String description,
            int capacity) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.capacity = capacity;

    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //public ArrayList<Topic> getTopics() {
        //return topics;
    //}

   // public void addTopic(Topic topic) {
        //topics.add(topic);
    //}

    public void viewCourse() {

        System.out.println(
                "Viewing Course : "
                + courseName);
    }

   // public void displayCourseContent() {

        //System.out.println(
                //"\nCourse: "
               // + courseName);

        //for(Topic topic : topics) {

           // System.out.println(
                   // "Topic: "
                    //+ topic.getTopicName());

            //for(Material material :
                    //topic.getMaterials()) {

               // System.out.println(
                       // "Material: "
                       // + material.getFileName());
            //}
        //}
    //}
}