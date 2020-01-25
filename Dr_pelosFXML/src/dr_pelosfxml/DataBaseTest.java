/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelosfxml;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JosueDavalos
 */
public class DataBaseTest {
    static final String DB_URL =
      "jdbc:mysql://192.168.100.46:3306/dr_pelos";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "123";
    public static void main(String args[]){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("SELECT * FROM Cliente;");
           while(resultSet.next()){
              System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
              resultSet.getInt(1),
              resultSet.getString(2),
              resultSet.getString(3),
              resultSet.getString(4),
              resultSet.getString(5),
              resultSet.getString(6),
              resultSet.getString(7),
              resultSet.getString(8),
              resultSet.getString(9));
           }

        }catch(SQLException ex){
        }finally{
           try {
              resultSet.close();
              statement.close();
              connection.close();
           } catch (SQLException ex) {
           }
        }
    }
}
