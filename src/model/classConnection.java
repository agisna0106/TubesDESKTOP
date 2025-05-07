/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Rizkan
 */
public class classConnection {
    public Connection connection;
    
    public classConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/tubesdesktop", "root", "");
            JOptionPane.showMessageDialog(null, "Terhubung ke database");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Tidak terhubungke database", "Pesan", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
