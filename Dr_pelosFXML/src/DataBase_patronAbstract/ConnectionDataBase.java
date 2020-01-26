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
    
    public ConnectionDataBase(IConnectionFactory conecctionFactory){
         this.connectionFactory = conecctionFactory;
    }
    
    public void start(DBType db_type, String username, String password) throws Exception{
        IConnection connection = connectionFactory.getConnection();
        connection.connect(username,password);
    }

    public IConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(IConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
}
