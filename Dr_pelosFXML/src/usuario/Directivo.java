/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;
import controlador.IGestorEntidad;
import controlador.CreatorGestor;
/**
 *
 * @author jeffer
 */
public class Directivo extends Usuario{
    //private IGestorEntidad igestorEntidad;
    public Directivo(String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String correo, String direccion, String telefono) {
        super(cedula, nombre, apellido, genero, fechaNacimiento, correo, direccion, telefono);
    }
    public IGestorEntidad gestionarInformacion( CreatorGestor creator){ //new ConcreteCreator le puede enviar
        IGestorEntidad igestorEntidad  = creator.factoryMethod();
        return igestorEntidad; //Aqui le retorna el gestor de la entidad para 
    }
}
