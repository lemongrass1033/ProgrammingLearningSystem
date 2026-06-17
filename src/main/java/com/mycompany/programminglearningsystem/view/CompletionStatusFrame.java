
package com.mycompany.programminglearningsystem.view;
import javax.swing.JOptionPane;
import com.mycompany.programminglearningsystem.database.DatabaseManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
public class CompletionStatusFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CompletionStatusFrame.class.getName());

    public CompletionStatusFrame() {
        initComponents();
        
        jCompletionTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

centerRenderer.setHorizontalAlignment(JLabel.CENTER);

for(int i = 0;
    i < jCompletionTable.getColumnCount(); i++) {

    jCompletionTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
}
((DefaultTableCellRenderer) jCompletionTable.getTableHeader() .getDefaultRenderer()) .setHorizontalAlignment( JLabel.CENTER); 
jCompletionTable.setRowHeight(25);
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEnrollID = new javax.swing.JLabel();
        jCompletionPercentage = new javax.swing.JLabel();
        jTextEnrollID = new javax.swing.JTextField();
        jUpdateStatus = new javax.swing.JButton();
        jViewStatus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCompletionTable = new javax.swing.JTable();
        jCompletionList = new javax.swing.JLabel();
        txtCompletionPercentage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEnrollID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jEnrollID.setText("Enrollment ID                            :");

        jCompletionPercentage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCompletionPercentage.setText("Completion Percentage (%)       :");

        jUpdateStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jUpdateStatus.setText("Update Status");
        jUpdateStatus.addActionListener(this::jUpdateStatusActionPerformed);

        jViewStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jViewStatus.setText("View Status");
        jViewStatus.addActionListener(this::jViewStatusActionPerformed);

        jCompletionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Status ID", "Enrollment ID", "Completion Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jCompletionTable);

        jCompletionList.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jCompletionList.setText("Completion List");

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(this::btnBackActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCompletionList, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jViewStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jUpdateStatus))
                        .addGap(127, 127, 127)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jEnrollID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCompletionPercentage))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCompletionPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jTextEnrollID))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCompletionList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEnrollID)
                    .addComponent(jTextEnrollID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCompletionPercentage)
                    .addComponent(txtCompletionPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnBack)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jUpdateStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jViewStatus)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateStatusActionPerformed
  DatabaseManager db =
            new DatabaseManager();

    db.updateCompletion(
            Integer.parseInt(
                    jTextEnrollID.getText()),
            Double.parseDouble(
                    txtCompletionPercentage.getText()));

    JOptionPane.showMessageDialog(
            this,
            "Completion Status Updated");
    }//GEN-LAST:event_jUpdateStatusActionPerformed

    private void jViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewStatusActionPerformed
     try {

    DatabaseManager db =
            new DatabaseManager();

    ResultSet rs = db.viewCompletion();

    DefaultTableModel model =(DefaultTableModel)
            jCompletionTable.getModel();

    model.setRowCount(0);
    
    int no = 1;
    while(rs.next()) {
        model.addRow(new Object[]{
           no++,
            rs.getInt("status_id"),
            rs.getInt("enrollment_id"),
            rs.getDouble("completion_percentage")

        });
    }

} catch(Exception e) {

    e.printStackTrace();
}
    }//GEN-LAST:event_jViewStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    new InstructorFrame().setVisible(true);

    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CompletionStatusFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jCompletionList;
    private javax.swing.JLabel jCompletionPercentage;
    private javax.swing.JTable jCompletionTable;
    private javax.swing.JLabel jEnrollID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextEnrollID;
    private javax.swing.JButton jUpdateStatus;
    private javax.swing.JButton jViewStatus;
    private javax.swing.JTextField txtCompletionPercentage;
    // End of variables declaration//GEN-END:variables
}
