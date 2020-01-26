
package pago;

public enum TipoTarjeta {
    VISA,MASTERCARD,DINNERS;

    public static TipoTarjeta getVISA() {
        return VISA;
    }

    public static TipoTarjeta getMASTERCARD() {
        return MASTERCARD;
    }

    public static TipoTarjeta getDINNERS() {
        return DINNERS;
    }
    
}
