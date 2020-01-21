/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes.personalCaja;

import Util.ComponentePane;
import Util.Metodos;
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
        super();
        
        Tcedula = new TextField();
        Tnombre = new TextField();
        Cgenero = ComponentePane.getComboGenero();
        Tapellido = new TextField();
        Ttelf = new TextField();
        Tdireccion = new TextField();
        
        super.setCenter( nuevoClienteCenter());
        super.setTop();
    }
    
    private Pane nuevoClienteCenter(){
        int size = 25;
        Label Lcedula = ComponentePane.getLabel("Cedula", size); 
        Label Lnombre = ComponentePane.getLabel("Nombres", size); 
        Label Lapellido = ComponentePane.getLabel("Apellidos", size); 
        Label Lgenero = ComponentePane.getLabel("Genero", size); 
        Label Ltelf = ComponentePane.getLabel("Telefono", size); 
        Label Ldireccion = ComponentePane.getLabel("Direccion", size);
        
        GridPane gp = new GridPane();
        gp.addColumn(0,Lcedula, Lnombre, Lapellido, Lgenero, Ltelf, Ldireccion);
        gp.addColumn(1,Tcedula, Tnombre, Tapellido, Cgenero, Ttelf, Tdireccion);
        gp.setHgap(40);
        gp.setVgap(20);
        gp.setAlignment(Pos.CENTER);
        
        Button guardar = ComponentePane.crearBoton("Guardar");
        Button cancelar = ComponentePane.crearBoton("Cancelar");
        HBox botones = new HBox(guardar, cancelar);
        botones.setAlignment(Pos.CENTER); botones.setSpacing(30);
        
        VBox vb = new VBox(ComponentePane.getLabel("Nuevo Cliente", 30),gp,botones);
        return vb;
    }
    
}
