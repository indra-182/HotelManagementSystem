/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.form;

import com.hms.model.Rooms;
import com.hms.query.Query;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class ManageRooms extends javax.swing.JFrame {

    /**
     * Creates new form ManageRooms
     */
    public ManageRooms() {
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

        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKamar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSetNomorKamar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSetTipeKamar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSetKasur = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSetHarga = new javax.swing.JTextField();
        btnAddRuangan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/close.jpg"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 30, -1, -1));

        btnBack.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/logout.jpg"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        tableKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor Kamar", "Tipe Kamar", "Tipe Kasur", "Harga", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableKamar);
        if (tableKamar.getColumnModel().getColumnCount() > 0) {
            tableKamar.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableKamar.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 153, 1010, 730));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Nomor Kamar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 153, -1, -1));

        txtSetNomorKamar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        getContentPane().add(txtSetNomorKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 193, 400, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Tipe Kamar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 239, -1, -1));

        txtSetTipeKamar.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        txtSetTipeKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Standar", "Superior", "Deluxe" }));
        getContentPane().add(txtSetTipeKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 279, 400, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Tipe Kasur");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 325, -1, -1));

        txtSetKasur.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        txtSetKasur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Single Bed", "Twin Bed", "Double Bed" }));
        getContentPane().add(txtSetKasur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 365, 400, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Harga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 411, -1, -1));

        txtSetHarga.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        getContentPane().add(txtSetHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 451, 400, -1));

        btnAddRuangan.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        btnAddRuangan.setText("Tambah Ruangan");
        btnAddRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRuanganActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 497, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hms/images/mainbg.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Exit", JOptionPane.YES_NO_OPTION);
        if (choose == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRuanganActionPerformed
        // TODO add your handling code here:
        Rooms rooms = new Rooms();
        rooms.setNomorKamar(txtSetNomorKamar.getText());
        rooms.setTipeKamar(txtSetTipeKamar.getSelectedItem().toString());
        rooms.setTipeKasur(txtSetKasur.getSelectedItem().toString());
        rooms.setHarga(Integer.parseInt(txtSetHarga.getText()));

        if (rooms.getNomorKamar().isEmpty() || rooms.getTipeKamar().isEmpty() || rooms.getTipeKasur().isEmpty() || rooms.getHarga() == 0) {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            return;
        }

        if (validateNomorKamar(rooms.getNomorKamar())) {
            JOptionPane.showMessageDialog(null, "Nomor Kamar Tersedia");
            return;
        }

        if (rooms.getTipeKamar().equals("Pilih") || rooms.getTipeKasur().equals("Pilih")) {
            JOptionPane.showMessageDialog(null, "Silakan Pilih Data");
            return;
        }

        String queryAddKamar = "INSERT INTO rooms VALUES ('" + rooms.getNomorKamar() + "', '" + rooms.getTipeKamar() + "', '" + rooms.getTipeKasur() + "', '" + rooms.getHarga() + "', '" + "Available" + "')";
        Query.setData(queryAddKamar, "Sukses Tambah Kamar");
        setVisible(false);
        new ManageRooms().setVisible(true);
    }//GEN-LAST:event_btnAddRuanganActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Query.getData("SELECT * FROM rooms");
        DefaultTableModel model = (DefaultTableModel) tableKamar.getModel();

        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("room_number"), rs.getString("room_type"), rs.getString("bed"), rs.getString("price"), rs.getString("status")});
            }
            tableKamar.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_formComponentShown

    private boolean validateNomorKamar(String nomorKamar) {
        String query = "SELECT * FROM rooms WHERE room_number = '" + nomorKamar + "'";
        ResultSet rs = Query.getData(query);
        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRuangan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKamar;
    private javax.swing.JTextField txtSetHarga;
    private javax.swing.JComboBox<String> txtSetKasur;
    private javax.swing.JTextField txtSetNomorKamar;
    private javax.swing.JComboBox<String> txtSetTipeKamar;
    // End of variables declaration//GEN-END:variables
}
