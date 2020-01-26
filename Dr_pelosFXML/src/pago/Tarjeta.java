
package pago;


import java.util.ArrayList;

public class Tarjeta implements IFormaPago{
    private TipoTarjeta tipotarjeta;
    private String numero;
    private String nombreTitular;

    public Tarjeta(TipoTarjeta tipotarjeta, String numero, String nombreTitular) {
        this.tipotarjeta = tipotarjeta;
        this.numero = numero;
        this.nombreTitular = nombreTitular;
    }


    public String getNumero() {
        return numero;
    }
}
