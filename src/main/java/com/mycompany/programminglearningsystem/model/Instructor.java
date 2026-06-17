package com.mycompany.programminglearningsystem.model;

import com.mycompany.programminglearningsystem.view.InstructorFrame;

public class Instructor extends User {

    private String specialization;

    public Instructor() {
    }

    @Override
    public void displayDashboard() {

        InstructorFrame instructor =
                new InstructorFrame();

        instructor.setVisible(true);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(
            String specialization) {

        this.specialization =
                specialization;
    }

    public void updateProgressStatus(
            int progressId,
            double percentage) {

    }

    public void updateCompletionStatus(
            int statusId,
            String status) {

    }
}