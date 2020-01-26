/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase_patronAbstract;

/**
 *
 * @author jeffer
 */
public class ConnectionDataBase {
    private IConnectionFactory connectionFactory;
    
    public void ConnectionDataBase(IConnectionFactory conecctionFactory){
         this.connectionFactory = conecctionFactory;
    }
    
    public void start(DBType db_type){
        IConnection connection = connectionFactory.getConnection();
        connection.connect();
    }

    public IConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(IConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
}
