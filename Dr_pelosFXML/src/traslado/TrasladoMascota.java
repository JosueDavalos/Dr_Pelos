/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslado;

import java.time.LocalDate;
import java.util.ArrayList;
import usuario.Cliente;
/**
 *
 * @author EUNICE
 */
public class TrasladoMascota {
    private LocalDate fechaTraslado;
    private ArrayList<Mascota> mascotaL;
    private Cliente cliente;

    public TrasladoMascota(LocalDate fechaTraslado, ArrayList<Mascota> mascotaL, Cliente cliente) {
        this.fechaTraslado = fechaTraslado;
        this.mascotaL = mascotaL;
        this.cliente = cliente;
    }

    public LocalDate getFechaTraslado() {
        return fechaTraslado;
    }

    public void setFechaTraslado(LocalDate fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }

    public ArrayList<Mascota> getMascotaL() {
        return mascotaL;
    }

    public void setMascotaL(ArrayList<Mascota> mascotaL) {
        this.mascotaL = mascotaL;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
    
    
}
