/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import database_queries.MySQLConnection;
import java.sql.ResultSet;

/**
 *
 * @author JosueDavalos
 */
public class QueryFachade {
    private static MySQLConnection msq = MySQLConnection.getInstance();
    
    public static ResultSet makeQuerySelect(String query){
        return msq.queryGet(query);
    }
    
    public static void makeQueryManipulate(String query){
        msq.queryManipulate(query);
    }
}
