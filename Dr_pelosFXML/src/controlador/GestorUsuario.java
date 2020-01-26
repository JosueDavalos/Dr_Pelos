/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import database_queries.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EUNICE
 */
public class GestorUsuario implements IGestorEntidad {

    @Override
    public IGestorEntidad getGestorEntidad() {
        return null;
    }

    @Override
    public void removeGestorEntidad(IGestorEntidad gestorEntidad) {
        MySQLConnection ms = MySQLConnection.getInstance();
    }

    @Override
    public void addIGestorEntidad(IGestorEntidad gestorEntidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
