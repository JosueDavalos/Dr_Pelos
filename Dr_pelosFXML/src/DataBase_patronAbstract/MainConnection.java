/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase_patronAbstract;

/**
 *
 * @author JosueDavalos
 */
public class MainConnection {
    
    public static void main(String[] args){
        DBType dbtype = DBType.MySQL;
        IConnectionFactory icf = getConnectionFactory(dbtype);
        ConnectionDataBase connectiondb = new ConnectionDataBase(icf);
    }
    private static IConnectionFactory getConnectionFactory(DBType dbtype){
        return new MySqlConnectionFactory();
        
    }
}
