/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import controlador.CreatorGestor;
import controlador.IGestorEntidad;

/**
 *
 * @author jeffer
 */
public class PersonalCaja extends Usuario{

    public PersonalCaja(String cedula, String nombre, String apellido, String genero, String correo, String fechaNacimiento, String direccion, String telefono) {
        super(cedula, nombre, apellido, genero, correo, fechaNacimiento, direccion, telefono);
    }
    
   
    
        public IGestorEntidad gestionarInformacion( CreatorGestor creator){ //new ConcreteCreator le puede enviar
        IGestorEntidad igestorEntidad  = creator.factoryMethod();
        return igestorEntidad; //Aqui le retorna el gestor de la entidad para 
    }
    
}
