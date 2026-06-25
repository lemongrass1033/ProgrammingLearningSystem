package com.mycompany.programminglearningsystem.model;
import com.mycompany.programminglearningsystem.view.AdminFrame;
public class Admin extends User {

   @Override
public void displayDashboard() {

    AdminFrame admin =
            new AdminFrame();

    admin.setVisible(true);
}
}