/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TDAs.Paquete;
import TDAs.Traslado;
import TDAs.Venta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usuario.Cliente;
import util.QueryFachade;
import static util.QueryFachade.makeQuerySelect;


/**
 *
 * @author LastSoul
 */
public class PruebasUnitarias {
    
    static final String DB_URL =
      "jdbc:mysql://192.168.100.185:3306/dr_pelos";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "123";
    Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

    public PruebasUnitarias() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test1(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("SELECT * FROM Cliente WHERE Cliente.ID = 1");
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
           String dueno = resultSet.getString(3);
           assertEquals(dueno,"Bryan");
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
    
    
    @Test
    public void test2(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("SELECT * FROM cotizacion;");
           while(resultSet.next()){
              System.out.printf("%s\t%s\t%s\n",
              resultSet.getInt(1),
              resultSet.getString(2),
              resultSet.getString(3));
           }

        }catch(SQLException ex){
        }finally{
           try {
               assertNotNull(resultSet);
              resultSet.close();
              statement.close();
              connection.close();
           } catch (SQLException ex) {
           }
        }
}
    @Test
    public void test3(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("select m.nombre, m.tipo, d.nombre, d.apellido, t.fechaEnvio, t.fechaEntrega, t.direccion, t.estado from Mascota m \n" +
"join TrasladoMascota t on m.dueno=t.dueno\n" +
"join Cliente d on d.ID=m.dueno;");
           while(resultSet.next()){
              System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
              resultSet.getInt(1),
              resultSet.getString(2),
              resultSet.getString(3),
              resultSet.getInt(4),
              resultSet.getString(5),
              resultSet.getString(6),
              resultSet.getString(7),
              resultSet.getString(8));
           }

        }catch(SQLException ex){
        }finally{
           try {
               assertNotNull(resultSet);
              resultSet.close();
              statement.close();
              connection.close();
           } catch (SQLException ex) {
           }
        }
}
    @Test
    public void test4(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("select * from Servicio where Servicio.categoria = 'Medica';");
           while(resultSet.next()){
              System.out.printf("s\t%s\t%s\t%s\t%s\t%s\n",
              resultSet.getInt(1),
              resultSet.getString(2),
              resultSet.getString(3),
              resultSet.getInt(4),
              resultSet.getString(5),
              resultSet.getString(6));
           }
           String categoria = resultSet.getString(2);
           assertEquals(categoria,"Bacunas");
        }catch(SQLException ex){
        }finally{
           try {
               assertNotNull(resultSet);
              resultSet.close();
              statement.close();
              connection.close();
           } catch (SQLException ex) {
           }
        }
}
    @Test
    public void test5(){
        try{
            List<Paquete> paquetes = new LinkedList<>();
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("select p.ID, c.nombre, c.apellido, p.fechaEnvio, p.fechaEntrega, p.direccion, p.estado from Paquete p\n" +
                                        "join Cliente c where c.ID= p.cliente;");
           try {
            while(resultSet.next()){
                Paquete c = new Paquete(resultSet.getString(1),resultSet.getString(2)+" "+resultSet.getString(3),resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
                paquetes.add(c);
            }
            assertEquals(paquetes.size(),14,1);
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
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
    @Test
    public void test6(){
        try {
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           List<Venta> ventas = new LinkedList<>();
        resultSet=statement.executeQuery
              ("select p.ID, c.nombre, c.apellido, p.fechaEnvio, p.fechaEntrega, p.direccion, p.estado from Paquete p\n" +
                                        "join Cliente c where c.ID= p.cliente;");
        
            while(resultSet.next()){
                Venta c = new Venta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(5), resultSet.getString(4), resultSet.getString(6));
                ventas.add(c);
            }
            assertEquals(ventas.size(),14,1);
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    @Test
    public void test7(){
        try {
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
        List<Traslado> traslados = new LinkedList<>();
        resultSet = statement.executeQuery("select m.nombre, m.tipo, d.nombre, d.apellido, t.fechaEnvio, t.fechaEntrega, t.direccion, t.estado from Mascota m \n" +
                                        "join TrasladoMascota t on m.dueno=t.dueno\n" +
                                        "join Cliente d on d.ID=m.dueno;");
        
            while(resultSet.next()){
                Traslado c = new Traslado(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
                traslados.add(c);
            }
            assertNotNull(traslados);
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    @Test
    public void test8(){
        try {
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
        List<Venta> ventas = new LinkedList<>();
        resultSet = statement.executeQuery("select * from Producto;");
        
            while(resultSet.next()){
                Venta c = new Venta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(5), resultSet.getString(4), resultSet.getString(6));
                ventas.add(c);
            }
            assertNotNull(ventas);
        } catch (SQLException ex) {
            Logger.getLogger(QueryFachade.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @Test
    public void test9(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("SELECT * FROM Mascota;");
           String dueno ="";
           while(resultSet.next()){
              System.out.printf("%s\t%s\t%s\t%s\t%s\n",
              resultSet.getInt(1),
              dueno =resultSet.getString(2),
              resultSet.getString(3),
              resultSet.getString(4),
              resultSet.getString(5));
           }
           assertNotNull(dueno);
        }catch(SQLException ex){
        }finally{
           try {
               assertNotNull(resultSet);
              resultSet.close();
              statement.close();
              connection.close();
           } catch (SQLException ex) {
           }
        }
}
    @Test
    public void test10(){
        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
           statement=connection.createStatement();
           resultSet=statement.executeQuery
              ("select DISTINCT * from Mascota join Cliente where Mascota.dueno=Cliente.ID and Mascota.nombre=\"Firulais\";");
           while(resultSet.next()){
              System.out.printf("%s\t%s\t%s\n",
              resultSet.getInt(1),
              resultSet.getString(2),
              resultSet.getString(3),
              resultSet.getInt(4),
              resultSet.getString(5),
              resultSet.getString(6),
              resultSet.getString(7),
              resultSet.getString(8));
           }
           String dueno = resultSet.getString(8);
           assertEquals(dueno,"Bryan");
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
