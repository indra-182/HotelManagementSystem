/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.query;

import com.hms.database.ConnectionDatabase;
import java.awt.HeadlessException;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mahadi Indra <indra-182 on github.com>
 */
public class Query {

    public static void setData(String query, String message) {
        Connection connection;
        Statement statement;
        try {
            connection = ConnectionDatabase.connect();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            if (!message.isEmpty()) {
                JOptionPane.showMessageDialog(null, message);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return resultSet;
    }


}
