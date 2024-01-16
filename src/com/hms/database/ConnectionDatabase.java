/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class ConnectionDatabase {

    private static Connection connection;

    public static Connection connect() {
        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Koneksi Database Sukses");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return connection;
    }
}
