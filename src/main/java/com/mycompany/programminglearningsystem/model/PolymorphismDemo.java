package com.mycompany.programminglearningsystem.model;

public class PolymorphismDemo {

    public static void main(String[] args) {

        UserAccount user1 =
                new User();

        UserAccount user2 =
                new Instructor();

        UserAccount user3 =
                new Admin();

        user1.displayDashboard();
        user2.displayDashboard();
        user3.displayDashboard();
    }
}