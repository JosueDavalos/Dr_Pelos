
package pago;


import java.util.ArrayList;

public class Paypal implements IFormaPago{
    private String nombreUsuario;
    private String contrasena;

    
    public Paypal(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }


    
}
