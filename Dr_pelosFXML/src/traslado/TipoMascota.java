/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslado;

/**
 *
 * @author EUNICE
 */
public enum TipoMascota {
    CANINO,
    FELINO,
    ROEDOR,
    AVE;
    
    public static TipoMascota getCANINO() {    
        return CANINO;
    }

    public static TipoMascota getFELINO() {
        return FELINO;
    }

    public static TipoMascota getROEDOR() {
        return ROEDOR;
    }

    public static TipoMascota getAVE() {
        return AVE;
    }
}
