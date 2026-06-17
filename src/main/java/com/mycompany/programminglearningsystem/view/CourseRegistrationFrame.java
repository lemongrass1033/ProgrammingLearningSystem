
package com.mycompany.programminglearningsystem.view;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import com.mycompany.programminglearningsystem.database.DatabaseManager;
import com.mycompany.programminglearningsystem.session.Session;
public class CourseRegistrationFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CourseRegistrationFrame.class.getName());
public CourseRegistrationFrame() {

    System.out.println("Constructor Start");

    initComponents();

    System.out.println("Components Loaded");

    loadCourseTable();

    System.out.println("Table Loaded");
}
    /**
     * Creates new form CourseRegistrationFrame
     */
  private void loadCourseTable() {

    try {

        System.out.println("Start Loading");

        DatabaseManager db =
                new DatabaseManager();

        ResultSet rs =
                db.viewCourse();

        System.out.println("ResultSet Created");

        DefaultTableModel model =
                (DefaultTableModel)
                tblCourse.getModel();

        model.setRowCount(0);

        while(rs.next()) {

            System.out.println(
                    rs.getString("course_name"));

            model.addRow(new Object[]{

                rs.getInt("course_id"),
                rs.getString("course_name"),
                 rs.getInt("capacity")
            });
        }

        System.out.println("Finished");

    } catch(Exception e) {

        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnViewLearning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Available Course");

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(this::btnBackActionPerformed);

        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(this::btnRegisterActionPerformed);

        btnViewLearning.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnViewLearning.setText("View Learning");
        btnViewLearning.addActionListener(this::btnViewLearningActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnViewLearning)
                        .addGap(76, 76, 76)
                        .addComponent(btnRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister))
                        .addGap(40, 40, 40)))
                .addComponent(btnBack)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
 try {

        int selectedRow =
                tblCourse.getSelectedRow();

        if(selectedRow == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please select a course");

            return;
        }

        int courseId =
                Integer.parseInt(
                        tblCourse.getValueAt(
                                selectedRow,
                                0).toString());

        DatabaseManager db =
                new DatabaseManager();

        db.registerCourse(
                Session.currentUserEmail,
                courseId);

        JOptionPane.showMessageDialog(
                this,
                "Course Registered Successfully");

    } catch(Exception e) {

        e.printStackTrace();
    }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 new DashboardFrame().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewLearningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLearningActionPerformed
         DatabaseManager db =
            new DatabaseManager();

         System.out.println(
        Session.currentUserEmail);
         
    int courseId =
            db.getRegisteredCourseId(
                    Session.currentUserEmail);

    if(courseId == -1) {

        JOptionPane.showMessageDialog(
                this,
                "No registered course found");

        return;
    }

    StudentTopicFrame frame =
            new StudentTopicFrame(
                    courseId);

    frame.setVisible(true);

    dispose();
    }//GEN-LAST:event_btnViewLearningActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
System.out.println("MAIN START");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CourseRegistrationFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnViewLearning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourse;
    // End of variables declaration//GEN-END:variables
}
