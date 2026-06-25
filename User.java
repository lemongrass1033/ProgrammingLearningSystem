package com.mycompany.programminglearningsystem.model;

public class Skill {

    private String skillName;

    public Skill(String skillName) {

        this.skillName = skillName;
    }

    public String getSkillName() {

        return skillName;
    }

    public void setSkillName(
            String skillName) {

        this.skillName = skillName;
    }

    @Override
    public String toString() {

        return skillName;
    }
}