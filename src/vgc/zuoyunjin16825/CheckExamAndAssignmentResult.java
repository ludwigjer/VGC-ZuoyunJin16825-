/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @ZuoyunJin16825
 */
public class CheckExamAndAssignmentResult extends javax.swing.JFrame implements ProgramInterface{

    /**
     * Creates new form CheckExamResult
     */
    public CheckExamAndAssignmentResult() {
        initComponents();
        showExamData();
        showAssignmentData();
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
    String UserID;

    public void getUserID() {
        try {

            FileReader file2 = new FileReader("UserID.txt");
            BufferedReader buffer = new BufferedReader(file2);
            String line;
            while ((line = buffer.readLine()) != null) {
                UserID = line;
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("A write error has occured");
        }

    }
    public ArrayList<AssignmentsData> AssignmentsList() {
        getUserID();
        ArrayList<AssignmentsData> AssignmentsList = new ArrayList();
        Connection myConn = getConnection();
        String sql = "select Courses.CoursesName,AssignmentsGradeBook.AssignmentsDate,AssignmentsGradeBook.AssignmentsResults from AssignmentsGradeBook inner join Courses on AssignmentsGradeBook.CoursesID = Courses.CoursesID where AssignmentsGradeBook.StudentID ="+UserID;
        try {
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery(sql);
            AssignmentsData AssignmentsDataTable;
            while (myRs.next()) {

                AssignmentsDataTable = new AssignmentsData(myRs.getString("CoursesName"), myRs.getString("AssignmentsDate"), myRs.getInt("AssignmentsResults"));
                AssignmentsList.add(AssignmentsDataTable);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return AssignmentsList;
    }
    public ArrayList<examData> examList() {
        getUserID();
        ArrayList<examData> examList = new ArrayList();
        Connection myConn = getConnection();
        String sql = "select Courses.CoursesName,ExamsGradeBook.ExamsDate,ExamsGradeBook.ExamsResults from ExamsGradeBook inner join Courses on ExamsGradeBook.CoursesID = Courses.CoursesID where ExamsGradeBook.StudentID =" + UserID;
        try {
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery(sql);
            examData examDataTable;
            while (myRs.next()) {

                examDataTable = new examData(myRs.getString("CoursesName"), myRs.getString("ExamsDate"), myRs.getInt("ExamsResults"));
                examList.add(examDataTable);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return examList;
    }

    public void refreshTableData(String message) {
    }

    public void showExamData() {
        ArrayList<examData> list = examList();
        DefaultTableModel model = (DefaultTableModel) ExamTable.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCNA();
            row[1] = list.get(i).getEXD();
            row[2] = list.get(i).getEXR();
            model.addRow(row);
        }
    }
     public void showAssignmentData() {
        ArrayList<AssignmentsData> list = AssignmentsList();
        DefaultTableModel model = (DefaultTableModel) AssignmentTable.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCNA();
            row[1] = list.get(i).getAMD();
            row[2] = list.get(i).getAMR();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        AssignmentTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExamTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AssignmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CoursesName", "AssignmentDate", "AssignmentResults"
            }
        ));
        AssignmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AssignmentTable);

        ExamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CoursesName", "ExamsDate", "ExamsResults"
            }
        ));
        ExamTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ExamTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssignmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignmentTableMouseClicked

    }//GEN-LAST:event_AssignmentTableMouseClicked

    private void ExamTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuS().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckExamAndAssignmentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckExamAndAssignmentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckExamAndAssignmentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckExamAndAssignmentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckExamAndAssignmentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AssignmentTable;
    private javax.swing.JTable ExamTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
