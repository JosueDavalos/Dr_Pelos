/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;

/**
 *
 * @author JOVEN EJEMPLAR
 */
public enum TipoProducto {
     MEDICINA
    ,JUGUETE
    ,ROPA
    ,ALIMENTO;
    
    public static TipoProducto getMEDICINA() {
        return MEDICINA;
    }

    public static TipoProducto getJUGUETE() {
        return JUGUETE;
    }

    public static TipoProducto getROPA() {
        return ROPA;
    }

    public static TipoProducto getALIMENTO() {
        return ALIMENTO;
    }
}
