/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes.personalCaja;

import Util.ComponentePane;
import Util.Metodos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import panes.CotizarPane;
import panes.VentaPane;
import panes.Ventana;


/**
 *
 * @author JosueDavalos
 */
public class PersonalCaja extends Ventana{
    
    public PersonalCaja(){ 
        super();
        super.setCenter(cajaCenter()); 
        super.setTop();
    }
    
    private Pane cajaCenter(){
        int size = 110;
        
        Pane agregar_cliente = ComponentePane.crearOpcion("Agregar Cliente",size);
        Pane cotizar = ComponentePane.crearOpcion("Cotizar",size);
        Pane venta = ComponentePane.crearOpcion("Venta Producto o Servicio",size);
        Pane consultar_entrega = ComponentePane.crearOpcion("Consultar Entrega",size);
        Pane traslado_mascota = ComponentePane.crearOpcion("Traslado de mascota",size);
        
        agregar_cliente.setOnMouseClicked( (event) -> {
            super.setCenter( new NuevoCliente().getRoot() ) ;
        });
        
        cotizar.setOnMouseClicked( (event) -> {
            super.setCenter( new CotizarPane().getRoot() ) ;
        });
        
        venta.setOnMouseClicked( (event) -> {
            super.setCenter( new VentaPane().getRoot() ) ;
        });
        
        GridPane gp = new GridPane();
        gp.addColumn(0, agregar_cliente, cotizar, venta);
        gp.addColumn(1, consultar_entrega, traslado_mascota);
        gp.setHgap(40);
        gp.setVgap(40);
        gp.setAlignment(Pos.CENTER);
        
        Label opcion = ComponentePane.getLabel("Escoja una Opcion:", 30); opcion.setTranslateX(50);
        VBox vb = new VBox(opcion, gp); vb.setAlignment(Pos.CENTER_LEFT); vb.setSpacing(50);
        return vb;
        
    }
    
}


