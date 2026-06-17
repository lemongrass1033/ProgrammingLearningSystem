package com.mycompany.programminglearningsystem.controller;

import com.mycompany.programminglearningsystem.dao.UserDAO;
import com.mycompany.programminglearningsystem.dao.SkillDAO;
import com.mycompany.programminglearningsystem.model.Skill;
import java.util.ArrayList;
import com.mycompany.programminglearningsystem.session.Session;
public class TeamFormationController {
private ArrayList<String> bestUsers =
        new ArrayList<>();
    UserDAO dao =
            new UserDAO();


public String findBestMatch(
        ArrayList<Skill> requiredSkills) {
bestUsers.clear();
    SkillDAO dao =
            new SkillDAO();

    CompatibilityCalculator calc =
            new CompatibilityCalculator();

    ArrayList<String> emails =
            dao.getAllEmails();

 String currentEmail =
        Session.currentUserEmail;

    double bestScore =
            Double.MAX_VALUE;


    int bestIntersection = 0;
    int bestUnion = 0;

    StringBuilder report =
            new StringBuilder();

    report.append(
            "========== TEAM FORMATION REPORT ==========\n\n");

    report.append(
            "Required Skills : ")
            .append(requiredSkills)
            .append("\n\n");

    report.append(
            "========== CANDIDATE ANALYSIS ==========\n\n");

    for(String email : emails) {

        if(email.equals(currentEmail)) {

            continue;
        }

        ArrayList<Skill> otherSkills =
                dao.getSkillsByEmail(
                        email);

        double score =
                calc.calculateSimilarity(
                        requiredSkills,
                        otherSkills);

        int currentIntersection =
                calc.getIntersection(
                        requiredSkills,
                        otherSkills);

        int currentUnion =
                calc.getUnion(
                        requiredSkills,
                        otherSkills);

        report.append(
                "Candidate : ")
                .append(email)
                .append("\n");

        report.append(
                "Common Skills : ")
                .append(currentIntersection)
                .append("\n");

        report.append(
                "Total Unique Skills : ")
                .append(currentUnion)
                .append("\n");

        report.append(
                "Compatibility : ")
                .append(String.format(
                        "%.2f%%",
                        (1 - score) * 100))
                .append("\n\n");

     if(score < bestScore) {

    bestScore = score;

    bestUsers.clear();
    bestUsers.add(email);

            bestIntersection =
                    currentIntersection;

            bestUnion =
                    currentUnion;
        }
     else if(score == bestScore) {

    bestUsers.add(email);
}
    }

report.append(
        "========== BEST MATCHES ==========\n\n");

for(String user : bestUsers) {

    report.append(
            "Recommended Teammate : ")
            .append(user)
            .append("\n");
}
if(bestUsers.size() > 1) {

    report.append("\n\n");

    report.append(
        "Multiple candidates found.\n");

    report.append(
        "Please choose one teammate.\n");
}

report.append("\n");

report.append(
        "Common Skills : ")
        .append(bestIntersection)
        .append("\n");

report.append(
        "Total Unique Skills : ")
        .append(bestUnion)
        .append("\n");

report.append(
        "Compatibility Score : ")
        .append(String.format(
                "%.2f%%",
                (1 - bestScore) * 100))
        .append("\n");

report.append(
        "Recommendation : ")
        .append(
                getRecommendation(
                        bestScore));
    return report.toString();
}
private String getRecommendation(
        double score){

    if(score <= 0.2){

        return "Excellent Match";
    }

    if(score <= 0.5){

        return "Good Match";
    }

    if(score <= 0.7){

        return "Moderate Match";
    }

    return "Low Match";
}
public ArrayList<String> getBestUsers() {

    return bestUsers;
}
}