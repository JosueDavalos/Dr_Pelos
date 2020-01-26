/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import usuario.Cliente;

/**
 *
 * @author jeffer
 */
public class Datos {
    
    public static String[] atributosCliente(){
        String[] atributos = {"cedula","nombre","apellido","fechaNacimiento","genero","correo","direccion","telefono"};
        return atributos;
    }
    public static ArrayList<Cliente> getClientes(){
        Cliente c1 = new Cliente("0931657365","Bryan","Sanchez","M","1999-12-18","brymsanc@espol.edu.ec","Acuarela del rio Mz 2 V1","0989195454");
        Cliente c2 = new Cliente("7894561230","Mois","Cabezas","M","1999-12-25","bmsa@espol.edu.ec","Sauces","0989845621");
        Cliente c3 = new Cliente("1234560785","Josue","Davalos","M","1990-01-02","josuetunene@gmail.com","Acuarela del rio Mz 2 V1","0935698745");
        Cliente c4 = new Cliente("7412589630","Galrer","Saltos","M","1975-01-18","gallarota@gmail.com","Sauces 9 V1","0956471236");
        Cliente c5 = new Cliente("9632587410","Ginger","Saltos","F","1960-02-04","gsaltos@espol.edu.ec","Ceibos","0956847125");
        Cliente c6 = new Cliente("8521479630","Eduardo","Cruz","M","1975-05-08","ecruz@espol.edu.ec","Entrada de la 8","0965748954");
        Cliente c7 = new Cliente("0254136987","Allan","Galarraga","M","1990-04-05","elgala@espol.edu.ec","Acuarela del rio Mz 2 V1","0984571659");
        Cliente c8 = new Cliente("8544961234","Kimberly","Suarez","F","1999-12-18","kimberlyprexiositaemoxitap@espol.edu.ec","Aquisito","0945687521");
        Cliente c9 = new Cliente("0931655365","Jefferson","Sanchez","M","1999-11-18","jeffer@espol.edu.ec","Mapasingue Oeste","0954645756");
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(c1);clientes.add(c2);clientes.add(c3);clientes.add(c4);clientes.add(c5);
        clientes.add(c6);clientes.add(c7);clientes.add(c8);clientes.add(c9);
        return clientes;
    } 
    
}
