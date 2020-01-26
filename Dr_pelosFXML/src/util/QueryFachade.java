/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import TDAs.Paquete;
import TDAs.Venta;
import database_queries.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import usuario.Cliente;

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
    
    public static List<Cliente> getClientesDB() {
        List<Cliente> clientes = new LinkedList<>();
        ResultSet rs = makeQuerySelect("SELECT * FROM Cliente;");
        try {
            while(rs.next()){
                Cliente c = new Cliente(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public static List<Paquete> getPaquetesDB() {
        List<Paquete> paquetes = new LinkedList<>();
        ResultSet rs = makeQuerySelect("select p.ID, c.nombre, c.apellido, p.fechaEnvio, p.fechaEntrega, p.direccion, p.estado from Paquete p\n" +
                                        "join Cliente c where c.ID= p.cliente;");
        try {
            while(rs.next()){
                Paquete c = new Paquete(rs.getString(1),rs.getString(2)+" "+rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                paquetes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paquetes;
    }
    
    public static List<Venta> getServiciosDB() {
        List<Venta> ventas = new LinkedList<>();
        ResultSet rs = makeQuerySelect("select p.ID, c.nombre, c.apellido, p.fechaEnvio, p.fechaEntrega, p.direccion, p.estado from Paquete p\n" +
                                        "join Cliente c where c.ID= p.cliente;");
        try {
            while(rs.next()){
                Venta c = new Venta(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
                ventas.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }
    
    public static List<Venta> getProductosDB() {
        List<Venta> ventas = new LinkedList<>();
        ResultSet rs = makeQuerySelect("select p.ID, c.nombre, c.apellido, p.fechaEnvio, p.fechaEntrega, p.direccion, p.estado from Paquete p\n" +
                                        "join Cliente c where c.ID= p.cliente;");
        try {
            while(rs.next()){
                Venta c = new Venta(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
                ventas.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }
}
