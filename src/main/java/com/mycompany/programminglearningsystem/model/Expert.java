package com.mycompany.programminglearningsystem.model;

import java.util.ArrayList;

public class Expert {

    private String id;

    private ArrayList<Skill> skills;

    public Expert(String id) {

        this.id = id;

        this.skills =
                new ArrayList<>();
    }

    public String getId() {

        return id;
    }

    public ArrayList<Skill> getSkills() {

        return skills;
    }

    public void addSkill(
            Skill skill) {

        skills.add(skill);
    }
}