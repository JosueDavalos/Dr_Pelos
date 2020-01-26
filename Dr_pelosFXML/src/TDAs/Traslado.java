/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

/**
 *
 * @author jeffer
 */
public class Traslado {
    private String nombre;
    private String tipo;
    private String dueno;
    private String fecha_envio;
    private String dierccion;
    private String fecha_entrega;
    private String estado;

    public Traslado(String nombre, String tipo, String dueno, String fecha_envio, String dierccion, String fecha_entrega, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dueno = dueno;
        this.fecha_envio = fecha_envio;
        this.dierccion = dierccion;
        this.fecha_entrega = fecha_entrega;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getDierccion() {
        return dierccion;
    }

    public void setDierccion(String dierccion) {
        this.dierccion = dierccion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
