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
public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private TypeProduct categoria;

    public Producto(String id, String nombre, String descripcion, TypeProduct categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TypeProduct getCategoria() {
        return categoria;
    }

    public void setCategoria(TypeProduct categoria) {
        this.categoria = categoria;
    }
    
    
    
}
