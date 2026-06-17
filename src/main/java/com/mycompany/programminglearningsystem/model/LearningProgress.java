
package com.mycompany.programminglearningsystem.model;


public class LearningProgress {
       private int progressId;
    private int enrollmentId;
    private double progressPercentage;



    public LearningProgress(int progressId, int enrollmentId, double progressPercentage) {
        this.progressId = progressId;
        this.enrollmentId = enrollmentId;
        this.progressPercentage = progressPercentage;
    }

    public void updateProgress(double percentage) {
        progressPercentage = percentage;
    }

    public void viewProgress() {

        System.out.println(progressPercentage + "%");
    }
    
    public double getProgressPercentage() {
    return progressPercentage;
}
}
