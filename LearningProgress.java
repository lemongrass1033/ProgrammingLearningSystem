
package com.mycompany.programminglearningsystem.model;


public class CompletionStatus {
private int statusId;
    private int enrollmentId;
    private double completionPercentage;


    public CompletionStatus(int statusId, int enrollmentId, double completionPercentage) {

        this.statusId = statusId;
        this.enrollmentId = enrollmentId;
        this.completionPercentage = completionPercentage;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(
            double completionPercentage) {

        this.completionPercentage =
                completionPercentage;
    }

    public void updateCompletionStatus() {

        System.out.println(
                "Completion Status Updated");
    }

    public void viewCompletionStatus() {

        System.out.println(
                "Viewing Completion Status");
    }
}
