package com.mycompany.programminglearningsystem.controller;

import com.mycompany.programminglearningsystem.dao.UserDAO;
import com.mycompany.programminglearningsystem.model.User;

public class ProfileController {

    public User getProfile(String email) {

        UserDAO dao =
                new UserDAO();

        return dao.getUserByEmail(email);
    }

    public boolean updateProfile(
            String username,
            String email,
            String skill,
            String github) {

        UserDAO dao =
                new UserDAO();

        return dao.updateUser(
                username,
                email,
                skill,
                github);
    }
}