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
    
    public static String[] atributosPaquetes(){
        String[] atributos = {"id","cliente","fecha_envio","fecha_entrega","direccion","estado"};
        return atributos;
    }
    
    public static String[] atributosVentas(){
        String[] atributos = {"nombre","categoria","tipo","valor","estado","agregar"};
        return atributos;
    }
    
}
