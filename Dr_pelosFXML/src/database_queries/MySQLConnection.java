/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_queries;

import DataBase_patronAbstract.IConnection;
import DataBase_patronAbstract.MySqlConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosueDavalos
 */
public class MySQLConnection {
    private static MySQLConnection instance;
    private IConnection connection;
    private String url = "jdbc:mysql://192.168.100.46:3306/dr_pelos";
    public static String username = "root";
    public static String password = "123";
    
    private MySQLConnection(String username, String password){
        connection = new MySqlConnect();
        connection.connect(username, password);
    }
    
    public static void start(String user, String password){
        instance = new MySQLConnection(user,password);
    }
    
    public static MySQLConnection getInstance(){;
        return instance;
    }
    
    public ResultSet queryGet(String query){
        ResultSet resultSet = null;
        try {
            Connection conn = connection.getConnection();
            Statement st = conn.createStatement();
            resultSet=st.executeQuery(query);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;        
    }
    
    
    public void queryManipulate(String query){
        try {
            Connection conn = connection.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Query realizado!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}