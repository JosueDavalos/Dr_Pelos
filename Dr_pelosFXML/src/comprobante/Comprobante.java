/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobante;

import compra.Producto;
import formato.Mail;
import java.util.ArrayList;
import usuario.Usuario;

/**
 *
 * @author EUNICE
 */
public abstract class Comprobante {
    private String id;
    
    private String encabezado;
    private String cuerpo;
    private String summary;
    
    
    abstract void crearEncabezado();
    abstract void crearCuerpo();
    abstract void crearSummary();

    public void crearFormato(){
        crearEncabezado();
        crearCuerpo();
        crearSummary();
        
    };
        public static void enviarCorreo(ArrayList<Producto> p, Usuario u){
        Mail mail=new Mail();
        String mensaje= "LISTA DE LOS PRODUCTOS COMPRADOS\n"+p;
        String correo=  u.getCorreo();
        mail.Send(mensaje, correo, "COMPRA REALIZADA");
        
        
        
    }
}
