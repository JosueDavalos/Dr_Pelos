/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase_patronAbstract;

import java.sql.Connection;

/**
 *
 * @author jeffer
 */
public interface IConnection {
    public void connect(String username, String password) throws Exception;
    public Connection getConnection();
}
