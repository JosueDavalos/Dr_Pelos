/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase_patronAbstract;

import database_queries.MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeffer
 */
public class MySqlConnect implements IConnection{
    private static MySQLConnection instance;
    public static Connection connection;
    private String url = "jdbc:mysql://192.168.100.46:3306/dr_pelos";
    
    @Override
    public void connect(String username, String password) {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Connection getConnection(){
        return MySqlConnect.connection;
    }
    
}
