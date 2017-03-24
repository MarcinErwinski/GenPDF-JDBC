/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generatepdf;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Erwin
 */
public class ConnectDatabase {
   
    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:PersonDatabase.db";
    
    private static Statement statement;
    private static Connection  connection;

    /**
     *
     */
    public ConnectDatabase(){
        try {
            Class.forName(ConnectDatabase.DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
        connection=DriverManager.getConnection(DB_URL);
        statement=connection.createStatement();
        }
        catch(SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
        }
        
        
    
    }

    /**
     *
     * @param name
     * @param surname
     * @param sex
     * @param street
     * @param town
     * @param phone
     * @param pesel
     * @return
     */
    protected boolean insertPerson(String name, String surname, String sex, String street, String town, String phone,String pesel)  {
        try {
            PreparedStatement preparedStatment;
            preparedStatment = connection.prepareStatement("insert into PersonDatabase (name,surname,sex,street,town,phone,pesel) values(?,?,?,?,?,?,?);  ");
            
            preparedStatment.setString(1, name);
            preparedStatment.setString(2, surname);
            preparedStatment.setString(3, sex);
            preparedStatment.setString(4, street);
            preparedStatment.setString(5, town);
            preparedStatment.setString(6, phone);
             preparedStatment.setString(7, pesel);
   
            preparedStatment.executeUpdate();
        } catch (SQLException e) {
        
            e.printStackTrace();
            return false;
        }
        return true;
    }
     public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}
