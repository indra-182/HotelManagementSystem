/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.query;

import com.hms.database.ConnectionDatabase;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class Table {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionDatabase.connect();
            statement = connection.createStatement();
            statement.executeUpdate("create table users( email varchar primary key,name varchar(50), password varchar(100), security_question varchar(100), answer varchar(50), status varchar(10), role varchar(20))");
            JOptionPane.showMessageDialog(null, "Sukses membuat table users");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
