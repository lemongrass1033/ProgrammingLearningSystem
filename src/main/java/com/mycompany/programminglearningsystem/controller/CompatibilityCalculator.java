package com.mycompany.programminglearningsystem.controller;

import java.util.ArrayList;
import com.mycompany.programminglearningsystem.model.Skill;
import com.mycompany.programminglearningsystem.model.Skill;

public class CompatibilityCalculator {

    public double calculateSimilarity(
            ArrayList<Skill> user1Skills,
            ArrayList<Skill> user2Skills) {

        int intersection =
                getIntersection(
                        user1Skills,
                        user2Skills);

        int union =
                getUnion(
                        user1Skills,
                        user2Skills);

        if(union == 0) {

            return 0;
        }

        return 1.0 -
               ((double) intersection / union);
    }

    public int getIntersection(
            ArrayList<Skill> user1Skills,
            ArrayList<Skill> user2Skills) {

        int intersection = 0;

        for(Skill skill1 : user1Skills) {

            for(Skill skill2 : user2Skills) {

                if(skill1.getSkillName()
                        .equalsIgnoreCase(
                                skill2.getSkillName())) {

                    intersection++;
                    break;
                }
            }
        }

        return intersection;
    }

    public int getUnion(
            ArrayList<Skill> user1Skills,
            ArrayList<Skill> user2Skills) {

        ArrayList<String> uniqueSkills =
                new ArrayList<>();

        for(Skill skill : user1Skills) {

            if(!uniqueSkills.contains(
                    skill.getSkillName())) {

                uniqueSkills.add(
                        skill.getSkillName());
            }
        }

        for(Skill skill : user2Skills) {

            if(!uniqueSkills.contains(
                    skill.getSkillName())) {

                uniqueSkills.add(
                        skill.getSkillName());
            }
        }

        return uniqueSkills.size();
    }
}