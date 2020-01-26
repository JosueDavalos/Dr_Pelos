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
public class MySqlConnectionFactory implements IConnection{
    private static MySQLConnection instance;
    public static Connection connection;
    private String url = "jdbc:mysql://192.168.100.185:3306/dr_pelos";
    
    @Override
    public void connect(String username, String password) throws Exception{
        this.connection = DriverManager.getConnection(url, username, password);
    }
    
    @Override
    public Connection getConnection(){
        return MySqlConnectionFactory.connection;
    }
    
}
