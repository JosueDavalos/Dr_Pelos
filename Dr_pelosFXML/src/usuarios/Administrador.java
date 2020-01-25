/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author jeffer
 */
public class Administrador extends Usuario{
    
    public Administrador(String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String correo, String direccion, String telefono) {
        super(cedula, nombre, apellido, genero, fechaNacimiento, correo, direccion, telefono);
    }
    
}
