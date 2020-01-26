
package compra;

public class Producto implements Comparable<Producto>, IOferta{
    private String codigo;
    private String descripcion;
    private String nombre;
    private double precio;
    
    private TipoProducto categoria;
    
    public Producto(){
        
    }
    public Producto(String codigo, String descripcion, String nombre, double precio, TipoProducto categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    public Producto(String codigo,String descripcion, Boolean isDigital, String nombre,double precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.nombre=nombre;
        this.precio=precio;
    }
    
   /* public String toString(){
        return "Codigo del producto: "+ codigo+
                "\nNombre del Procudto"+ nombre*/
    public int compareTo(Producto p){
        if (this.precio< p.precio){
            return -1;
        }
        if(this.precio> p.precio){
            return +1;
        }
        return 0;
    }
    
    public String toString(){
        return "Nombre: "+this.nombre+ 
                    "; Codigo: "+this.codigo+
                "; Precio: "+ precio;
                
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(TipoProducto categoria) {
        this.categoria = categoria;
    }

    

    public TipoProducto getCategoria() {
        return categoria;
    }

    public void comprar(){
        System.out.println("METODO DE PRUEBA");
    }
    }

        
    
    

