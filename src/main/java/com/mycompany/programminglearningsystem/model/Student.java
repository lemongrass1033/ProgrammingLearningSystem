package com.mycompany.programminglearningsystem.model;

import javax.swing.JOptionPane;

public class Student extends User {

    public Student(
            int userID,
            String username) {

        super(
                userID,
                username);
    }

    @Override
public void displayRole() {

    JOptionPane.showMessageDialog(
            null,
            "Logged in as Student");
}
}