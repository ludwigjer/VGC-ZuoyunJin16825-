/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @ZuoyunJin16825
 */
public class AddAndEditBranche extends javax.swing.JFrame implements ProgramInterface {

    /**
     * Creates new form AddNewBranche
     */
    public AddAndEditBranche() {
        initComponents();
        showbrancheData();
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

    public ArrayList<brancheData> brancheList() {
        ArrayList<brancheData> brancheList = new ArrayList();
        Connection myConn = getConnection();
        String sql = "Select * from Branches";
        try {
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery(sql);
            brancheData brancheDataTable;
            while (myRs.next()) {

                brancheDataTable = new brancheData(myRs.getInt("BranchesID"), myRs.getString("BranchesADD"), myRs.getInt("TEL"));
                brancheList.add(brancheDataTable);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return brancheList;
    }

    public void refreshTableData(String message) {
        // refresh jtable data
        DefaultTableModel model = (DefaultTableModel) brancheTable.getModel();
        model.setRowCount(0);
        showbrancheData();

        JOptionPane.showMessageDialog(null, "Data " + message + " Succefully");
    }

    public void showbrancheData() {
        ArrayList<brancheData> list = brancheList();
        DefaultTableModel model = (DefaultTableModel) brancheTable.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getBID();
            row[1] = list.get(i).getBADD();
            row[2] = list.get(i).getBNO();
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
        BID = new javax.swing.JTextField();
        BADD = new javax.swing.JTextField();
        BNO = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        brancheTable = new javax.swing.JTable();
        BIDC = new javax.swing.JLabel();
        BADC = new javax.swing.JLabel();
        BNOC = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add New Branche By Entering The Detail Below");

        jLabel2.setText("Enter Branches ID");

        jLabel3.setText("Enter Branches Address");

        jLabel4.setText("Enter Branches Number");

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        brancheTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branches ID", "Branches Address", "Branches TEL"
            }
        ));
        brancheTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brancheTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(brancheTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BADD, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(BID, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(BIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BADC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BNOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BNO, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Insert)
                                .addGap(68, 68, 68)
                                .addComponent(Update)
                                .addGap(66, 66, 66)
                                .addComponent(Delete)
                                .addGap(55, 55, 55)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BIDC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BADC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BNOC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(Update)
                    .addComponent(Delete)
                    .addComponent(Back))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        Connection myConn = getConnection();
        String sql = "Delete From Timetable WHERE BranchesID = ?";
        String sql2 = "Delete From Branches WHERE BranchesID = ?";
        try {
            PreparedStatement pst = myConn.prepareStatement(sql);
            PreparedStatement pst2 = myConn.prepareStatement(sql2);
            pst.setString(1, BID.getText().trim());
            pst2.setString(1, BID.getText().trim());
            pst.executeUpdate();
            pst2.executeUpdate();
            refreshTableData("Deleted!");
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        if (BID.getText().isEmpty() || BADD.getText().isEmpty() || BNO.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please,enter all fields!");
        } else {
            Connection myConn = getConnection();
            String sql = "insert into Branches(BranchesID, BranchesADD, TEL) values (?,?,?)";

            Pattern pBID = Pattern.compile("\\d{1,2}");
            Matcher mBID = pBID.matcher(BID.getText());
            boolean isBIDValid = mBID.matches();

            Pattern pBADD = Pattern.compile(".{1,40}");
            Matcher mBADD = pBADD.matcher(BADD.getText());
            boolean isBADDValid = mBADD.matches();

            Pattern pBNO = Pattern.compile("\\d{1,10}");
            Matcher mBNO = pBNO.matcher(BNO.getText());
            boolean isBNOValid = mBNO.matches();

            if (isBIDValid) {
                BIDC.setText("Valid");
                BIDC.setForeground(Color.BLUE);
            } else {
                BIDC.setText("InValid (1 - 2 DECIMAL Only)");
                BIDC.setForeground(Color.red);
            }
            if (isBADDValid) {
                BADC.setText("Valid");
                BADC.setForeground(Color.BLUE);
            } else {
                BADC.setText("InValid (1 - 40 Charactors Only)");
                BADC.setForeground(Color.red);
            }

            if (isBNOValid) {
                BNOC.setText("Valid");
                BNOC.setForeground(Color.BLUE);
            } else {
                BNOC.setText("InValid (1 - 10 DECIMAL Only)");
                BNOC.setForeground(Color.red);
            }
            if (isBIDValid && isBADDValid && isBNOValid) {
                try {
                    PreparedStatement pst = myConn.prepareStatement(sql);
                    pst.setString(1, BID.getText().trim());
                    pst.setString(2, BADD.getText().trim());
                    pst.setString(3, BNO.getText().trim());
                    pst.executeUpdate();
                    refreshTableData("Inserted");
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void brancheTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brancheTableMouseClicked
        // Get The Index Of The Slected Row 
        int i = brancheTable.getSelectedRow();

        TableModel model = brancheTable.getModel();

        // Display Slected Row In JTexteFields
        BID.setText(model.getValueAt(i, 0).toString());

        BADD.setText(model.getValueAt(i, 1).toString());

        BNO.setText(model.getValueAt(i, 2).toString());

    }//GEN-LAST:event_brancheTableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if (BID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "BranchesID CAN NOT BE NULL!!!");
        } else {
            Connection myConn = getConnection();
            String sql = "update Branches set BranchesID = ?, BranchesADD = ?, TEL = ? WHERE BranchesID = ?";

            Pattern pBID = Pattern.compile("\\d{1,2}");
            Matcher mBID = pBID.matcher(BID.getText());
            boolean isBIDValid = mBID.matches();

            Pattern pBADD = Pattern.compile(".{1,40}");
            Matcher mBADD = pBADD.matcher(BADD.getText());
            boolean isBADDValid = mBADD.matches();

            Pattern pBNO = Pattern.compile("\\d{1,10}");
            Matcher mBNO = pBNO.matcher(BNO.getText());
            boolean isBNOValid = mBNO.matches();

            if (isBIDValid) {
                BIDC.setText("Valid");
                BIDC.setForeground(Color.BLUE);
            } else {
                BIDC.setText("InValid (1 - 2 DECIMAL Only)");
                BIDC.setForeground(Color.red);
            }
            if (isBADDValid) {
                BADC.setText("Valid");
                BADC.setForeground(Color.BLUE);
            } else {
                BADC.setText("InValid (1 - 40 Charactors Only)");
                BADC.setForeground(Color.red);
            }

            if (isBNOValid) {
                BNOC.setText("Valid");
                BNOC.setForeground(Color.BLUE);
            } else {
                BNOC.setText("InValid (1 - 10 DECIMAL Only)");
                BNOC.setForeground(Color.red);
            }

            if (isBIDValid && isBADDValid && isBNOValid) {
                try {
                    PreparedStatement pst = myConn.prepareStatement(sql);
                    pst.setString(1, BID.getText().trim());
                    pst.setString(2, BADD.getText().trim());
                    pst.setString(3, BNO.getText().trim());
                    pst.setString(4, BID.getText().trim());
                    pst.executeUpdate();
                    refreshTableData("Updated");
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
    }//GEN-LAST:event_UpdateActionPerformed
    }

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
            java.util.logging.Logger.getLogger(AddAndEditBranche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAndEditBranche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAndEditBranche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAndEditBranche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAndEditBranche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BADC;
    private javax.swing.JTextField BADD;
    private javax.swing.JTextField BID;
    private javax.swing.JLabel BIDC;
    private javax.swing.JTextField BNO;
    private javax.swing.JLabel BNOC;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JTable brancheTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
