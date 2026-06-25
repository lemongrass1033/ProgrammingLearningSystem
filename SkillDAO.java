package com.mycompany.programminglearningsystem.controller;
import com.mycompany.programminglearningsystem.model.LearningProgress;
import com.mycompany.programminglearningsystem.model.CompletionStatus;
    public class TopsisCalculator {
    private double progressWeight;
    private double completionWeight;

    public TopsisCalculator(double progressWeight, double completionWeight) {

        this.progressWeight = progressWeight;

        this.completionWeight = completionWeight;
    }

    public double getProgressWeight() {
        return progressWeight;
    }

    public void setProgressWeight(
            double progressWeight) {

        this.progressWeight =
                progressWeight;
    }

    public double getCompletionWeight() {
        return completionWeight;
    }

    public void setCompletionWeight(double completionWeight) {

        this.completionWeight =completionWeight;
    }

    public double calculateScore(double progressPercentage, double completionPercentage) {

        return (progressPercentage * (progressWeight / 100)) +(completionPercentage * (completionWeight / 100));
    }

public double calculateScore(LearningProgress progress, CompletionStatus completion) {

        return (progress.getProgressPercentage() * (progressWeight / 100)) + (completion.getCompletionPercentage() * (completionWeight / 100));
    }
}
