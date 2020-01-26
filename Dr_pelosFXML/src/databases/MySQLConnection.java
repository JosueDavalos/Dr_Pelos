/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosueDavalos
 */
public class MySQLConnection {
    private static MySQLConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://192.168.100.46:3306/dr_pelos";
    private String username = "root";
    private String password = "123";
    
    private MySQLConnection(){
        try{
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Conexion a base de datos fallida: " + ex.getMessage());
        }
    }
    
    public static MySQLConnection getInstance() throws SQLException{
        if(instance == null){
            instance = new MySQLConnection();
        }else if (instance.getConnection().isClosed()) {
            instance = new MySQLConnection();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
