/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;
import java.time.LocalDate;
import compra.IOferta;
import java.util.ArrayList;
import pago.IFormaPago;
import usuario.Cliente;
/**
 *
 * @author EUNICE
 */
public class Compra {
    private ArrayList<IOferta> iofertas;//
    private  LocalDate fechaCompra;
    private IFormaPago formaPago;
    private Cliente cliente;

    public Compra(ArrayList<IOferta> iofertas, LocalDate fechaCompra, IFormaPago formaPago, Cliente cliente) {
        this.iofertas = iofertas;
        this.fechaCompra = fechaCompra;
        this.formaPago = formaPago;
        this.cliente = cliente;
    }

    
    public void agregarIOferta(IOferta ioferta){
        this.iofertas.add(ioferta);
    }
    public void removerIOferta(IOferta ioferta){
        this.iofertas.remove(ioferta);
    }

    public ArrayList<IOferta> getIofertas() {
        return iofertas;
    }

    public void setIofertas(ArrayList<IOferta> iofertas) {
        this.iofertas = iofertas;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public IFormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(IFormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
