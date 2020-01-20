/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes.personalCaja;

import dr_pelos.Metodos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import panes.Ventana;

/**
 *
 * @author jeffer
 */
public class NuevoCliente extends Ventana{
    private TextField Tcedula;
    private TextField Tnombre;
    private TextField Tapellido;
    private ComboBox Cgenero;
    private TextField Ttelf;
    private TextField Tdireccion;
    
    public NuevoCliente(){
        super(new BorderPane());
        Tcedula = new TextField();
        Tnombre = new TextField();
        Cgenero = Metodos.getComboGenero();
        Tapellido = new TextField();
        Ttelf = new TextField();
        Tdireccion = new TextField();
        
        super.setCenter( nuevoClienteCenter());
    }
    
    private Pane nuevoClienteCenter(){
        int size = 25;
        Label Lcedula = Metodos.getLabel("Cedula", size); 
        Label Lnombre = Metodos.getLabel("Nombres", size); 
        Label Lapellido = Metodos.getLabel("Apellidos", size); 
        Label Lgenero = Metodos.getLabel("Genero", size); 
        Label Ltelf = Metodos.getLabel("Telefono", size); 
        Label Ldireccion = Metodos.getLabel("Direccion", size);
        
        GridPane gp = new GridPane();
        gp.addColumn(0,Lcedula, Lnombre, Lapellido, Lgenero, Ltelf, Ldireccion);
        gp.addColumn(1,Tcedula, Tnombre, Tapellido, Cgenero, Ttelf, Tdireccion);
        gp.setHgap(40);
        gp.setVgap(20);
        gp.setAlignment(Pos.CENTER);
        
        Button guardar = Metodos.crearBoton("Guardar");
        Button cancelar = Metodos.crearBoton("Cancelar");
        HBox botones = new HBox(guardar, cancelar);
        botones.setAlignment(Pos.CENTER); botones.setSpacing(30);
        
        VBox vb = new VBox(Metodos.getLabel("Nuevo Cliente", 30),gp,botones);
        return vb;
    }
    
}
