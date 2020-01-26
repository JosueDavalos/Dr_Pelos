/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslado;

import java.time.LocalDate;
import usuario.Cliente;
/**
 *
 * @author EUNICE
 */
public class Mascota {
    private String nombre;
    private Cliente dueno;
    private TipoMascota tipo;
    private LocalDate fechaNacimiento;

    public Mascota(String nombre, Cliente dueno, TipoMascota tipo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public Mascota(String nombre, Cliente dueno, TipoMascota tipo) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
