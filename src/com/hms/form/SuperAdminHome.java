/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.form;

import com.hms.query.Query;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class SuperAdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public SuperAdminHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSetNameUser = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSetCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSetNameUser.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        txtSetNameUser.setForeground(new java.awt.Color(252, 3, 3));
        txtSetNameUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/superadmin.jpg"))); // NOI18N
        txtSetNameUser.setText("SUPER ADMIN");
        getContentPane().add(txtSetNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        btnLogout.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/logout.jpg"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 30, -1, -1));

        btnExit.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/close.jpg"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Cari by Nama atau Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, 30));

        txtSetCari.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtSetCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetCariActionPerformed(evt);
            }
        });
        getContentPane().add(txtSetCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 640, -1));

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Email", "Name", "Status", "Role"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 1430, 540));

        btnCari.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/mainbg.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(2300, 1185));
        jLabel1.setMinimumSize(new java.awt.Dimension(2300, 1185));
        jLabel1.setPreferredSize(new java.awt.Dimension(2300, 1185));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 2130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSetCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetCariActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Exit", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin logout?", "Exit", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String queryGetAllData = "SELECT * FROM users";
        ResultSet result = Query.getData(queryGetAllData);
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        model.setRowCount(0);
        try {
            while (result.next()) {
                model.addRow(new Object[]{
                    result.getString("email"),
                    result.getString("name"),
                    result.getString("status"),
                    result.getString("role")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_formComponentShown

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String queryCari = "SELECT * FROM users WHERE name LIKE '%" + txtSetCari.getText() + "%' OR email LIKE '%" + txtSetCari.getText() + "%'";
        ResultSet result = Query.getData(queryCari);
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        model.setRowCount(0);
        try {
            while (result.next()) {
                System.out.println(result.getString("email"));
                model.addRow(new Object[]{
                    result.getString("email"),
                    result.getString("name"),
                    result.getString("status"),
                    result.getString("role")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        int index = tableData.getSelectedRow();
        TableModel model = tableData.getModel();
        String email = model.getValueAt(index, 0).toString();
        String status = model.getValueAt(index, 2).toString();
        if (status.equalsIgnoreCase("pending")) {
            int choose = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah user " + email + " menjadi aktif?", "Exit", JOptionPane.YES_NO_OPTION);
            if (choose == 0) {
                String query = "UPDATE users SET status = 'Active' WHERE email = '" + email + "'";
                Query.setData(query, "User dengan email" + email + " sudah aktif");
                setVisible(false);
                new SuperAdminHome().setVisible(true);
            }
        }
    }//GEN-LAST:event_tableDataMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtSetCari;
    private javax.swing.JLabel txtSetNameUser;
    // End of variables declaration//GEN-END:variables
}
