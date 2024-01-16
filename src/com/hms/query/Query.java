/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.query;

import com.hms.database.ConnectionDatabase;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class Query {

    public static void setData(String query, String message) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionDatabase.connect();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            if (!message.isEmpty()) {
                JOptionPane.showMessageDialog(null, message);
            }
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

    public static ResultSet getData(String query) {
        Connection connection;
        Statement statement;
        ResultSet resultSet = null;
        try {
            connection = ConnectionDatabase.connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }


}
