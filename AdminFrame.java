package com.mycompany.programminglearningsystem.model;
import com.mycompany.programminglearningsystem.view.DashboardFrame;
public class User extends UserAccount {


    private String role;
private String status;
    public User() {
    }

    public User(String username,
                String email,
                String password,
                String skill) {

        super(username, email, password, skill);

    }

 

 @Override
public void displayDashboard() {

    DashboardFrame dashboard =
            new DashboardFrame();

    dashboard.setVisible(true);
}
    public String getRole() {
    return role;
}

public String getStatus() {
    return status;
}
public void setRole(String role) {
    this.role = role;
}

public void setStatus(String status) {
    this.status = status;
}
}