package com.mycompany.programminglearningsystem.controller;

import com.mycompany.programminglearningsystem.dao.UserDAO;
import com.mycompany.programminglearningsystem.model.User;

public class AdminController {

    public User searchUser(
            String username) {

        UserDAO dao =
                new UserDAO();

        return dao.getUserByUsername(
                username);
    }
    public boolean deactivateUser(
        String username) {

    UserDAO dao =
            new UserDAO();

    return dao.deactivateUser(
            username);
}
    public boolean updateRole(
        String username,
        String role) {

    UserDAO dao =
            new UserDAO();

    return dao.updateRole(
            username,
            role);
}
}