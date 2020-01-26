/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;
import compra.Compra;
/**
 *
 * @author jeffer
 */
public class Cliente extends Usuario {
    private ArrayList<Compra> compraL;

    public Cliente(String cedula, String nombre, String apellido, String genero, String correo, String fechaNacimiento, String direccion, String telefono) {
        super(cedula, nombre, apellido, genero, correo, fechaNacimiento, direccion, telefono);
    }


    public ArrayList<Compra> getCompraL() {
        return compraL;
    }

    public void setCompraL(ArrayList<Compra> compraL) {
        this.compraL = compraL;
    }

    
    
}
