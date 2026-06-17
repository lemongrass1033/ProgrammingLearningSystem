package com.mycompany.programminglearningsystem.model;

public class UserAccount {

    private String username;
    private String email;
    private String password;
    private String skill;

    public UserAccount() {
    }

    public UserAccount(String username,
                       String email,
                       String password,
                       String skill) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.skill = skill;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void displayDashboard() {

    }
}