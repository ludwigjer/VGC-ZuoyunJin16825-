/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ludwig
 */
public class AddAndEditTeacher extends javax.swing.JFrame {

    /**
     * Creates new form AddNewTeacher
     */
    public AddAndEditTeacher() {
        initComponents();
        showTeacherData();
    }

    public Connection getConnection() {
        try {
            String dbUrl = "jdbc:mysql://localhost:3306/vgc?useSSL=false";
            String userid = "root";
            String userps = "P6agztsg";
            Connection myConn = DriverManager.getConnection(dbUrl, userid, userps);
            return myConn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public void refreshTableData(String message)
   {    
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)teacherTable.getModel();
               model.setRowCount(0);
               showTeacherData();
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");  
   }
    
    
    public ArrayList<teacherData> teacherList() {
        ArrayList<teacherData> teacherList = new ArrayList();
        Connection myConn = getConnection();
        String sql = "Select * From Faculty";
        try {
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery(sql);
            teacherData teacherDataTable;
            while (myRs.next()) {

                teacherDataTable = new teacherData(myRs.getInt("FacultyID"), myRs.getInt("PhoneNumber"), myRs.getString("FacultyFName"), myRs.getString("FacultyLName"));
                teacherList.add(teacherDataTable);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return teacherList;
    }

    public void showTeacherData() {
        ArrayList<teacherData> list = teacherList();
        DefaultTableModel model = (DefaultTableModel) teacherTable.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getFID();
            row[1] = list.get(i).getFFN();
            row[2] = list.get(i).getFLN();
            row[3] = list.get(i).getFPHONE();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FID = new javax.swing.JTextField();
        TPN = new javax.swing.JTextField();
        FFN = new javax.swing.JTextField();
        FLN = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        teacherTable = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add New Teacher By Entering The Detail Below");

        jLabel2.setText("Enter FacultyID");

        jLabel3.setText("Enter Teacher Phone Number");

        jLabel4.setText("Enter Teacher First Name");

        jLabel5.setText("Enter Teacher Last Name");

        TPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPNActionPerformed(evt);
            }
        });

        FFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFNActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        teacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "First Name", "Last Name", "Number"
            }
        ));
        teacherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(teacherTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FID, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FFN, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FLN, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TPN, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Update)
                                .addGap(36, 36, 36)
                                .addComponent(Delete)
                                .addGap(39, 39, 39)
                                .addComponent(Reset)
                                .addGap(37, 37, 37)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Insert)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Reset)
                                .addComponent(Back)
                                .addComponent(Delete)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPNActionPerformed

    private void FFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FFNActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        if (TPN.getText().isEmpty() || FID.getText().isEmpty() || FFN.getText().isEmpty() || FLN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please,enter all fields!");
        } else {
            Connection myConn = getConnection();
            String sql = "insert into Faculty(FacultyID, FacultyFName, FacultyLName, PhoneNumber) values (?,?,?,?)";
            try {
                PreparedStatement pst = myConn.prepareStatement(sql);
                pst.setString(4, TPN.getText().trim());
                pst.setString(1, FID.getText().trim());
                pst.setString(2, FFN.getText().trim());
                pst.setString(3, FLN.getText().trim());
                pst.executeUpdate();
                refreshTableData("Inserted");
            } catch (Exception exc) {
                exc.printStackTrace();
            }

        }
    }//GEN-LAST:event_InsertActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        FID.setText("");
        TPN.setText("");
        FFN.setText("");
        FLN.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
      if (FID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TeacherID CAN NOT BE NULL!!");
        } else {
            Connection myConn = getConnection();
            String sql = "update Faculty set FacultyID = ?, FacultyFName = ?, FacultyLName = ? ,PhoneNumber = ? WHERE FacultyID = ?";
            try {
                PreparedStatement pst = myConn.prepareStatement(sql);
                pst.setString(1, FID.getText().trim());
                pst.setString(2, FFN.getText().trim());
                pst.setString(3, FLN.getText().trim());
                pst.setString(4, TPN.getText().trim());
                pst.setString(5, FID.getText().trim());
                pst.executeUpdate();
                refreshTableData("Updated");
            } catch (Exception exc) {
                exc.printStackTrace();
            }
    }              
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
     Connection myConn = getConnection();
            String sql = "Delete From Faculty WHERE FacultyID = ?";
            String sql2 = "Delete From Timetable WHERE FacultyID = ?";
            try {
                PreparedStatement pst = myConn.prepareStatement(sql);
                PreparedStatement pst2 = myConn.prepareStatement(sql2);
                pst.setString(1, FID.getText().trim());
                pst2.setString(1, FID.getText().trim());
                pst2.executeUpdate();
                pst.executeUpdate();
                 refreshTableData("Deleted!");
            } catch (Exception exc) {
                exc.printStackTrace();
            }
    }//GEN-LAST:event_DeleteActionPerformed

    private void teacherTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherTableMouseClicked
            // Get The Index Of The Slected Row 
        int i = teacherTable.getSelectedRow();

        TableModel model = teacherTable.getModel();

        // Display Slected Row In JTexteFields
        FID.setText(model.getValueAt(i, 0).toString());

        FFN.setText(model.getValueAt(i, 1).toString());

        FLN.setText(model.getValueAt(i, 2).toString());
        
        TPN.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_teacherTableMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddAndEditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAndEditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAndEditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAndEditTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAndEditTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField FFN;
    private javax.swing.JTextField FID;
    private javax.swing.JTextField FLN;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField TPN;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable teacherTable;
    // End of variables declaration//GEN-END:variables
}