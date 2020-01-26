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
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    private String correo;
    private String direccion;
    private String telefono;
    private ArrayList<Compra> compraL;

    public Cliente(String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String correo, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(String cedula, String nombre, String apellido, String genero, String fechaNacimiento, String correo, String direccion, String telefono, ArrayList<Compra> compraL) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.compraL = compraL;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Compra> getCompraL() {
        return compraL;
    }

    public void setCompraL(ArrayList<Compra> compraL) {
        this.compraL = compraL;
    }

    
    
}