package com.mycompany.programminglearningsystem.model;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<User> members;

    public Team(String teamName) {

        this.teamName = teamName;
        members = new ArrayList<>();
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void displayTeam() {

        System.out.println("Team : " + teamName);

        for(User u : members) {

            System.out.println(
                u.getUsername()
                + " - "
                + u.getSkill()
            );
        }
    }
}