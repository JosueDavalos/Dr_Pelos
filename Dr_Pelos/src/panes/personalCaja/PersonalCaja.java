/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes.personalCaja;

import dr_pelos.Metodos;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


/**
 *
 * @author JosueDavalos
 */
public class PersonalCaja {
    private BorderPane root;
    
    public PersonalCaja(){
        root = new BorderPane();
        root.setCenter(cajaCenter()); 
    }
    
    private Pane cajaCenter(){
        int size = 100;
        
        Pane agregar_cliente = Metodos.crearOpcion("Agregar Cliente",size);
        Pane cotizar = Metodos.crearOpcion("Cotizar",size);
        Pane venta = Metodos.crearOpcion("Venta Producto o Servicio",size);
        Pane consultar_entrega = Metodos.crearOpcion("Consultar Entrega",size);
        Pane traslado_mascota = Metodos.crearOpcion("Traslado de mascota",size);
        
        VBox vb = new VBox(agregar_cliente, cotizar, venta, consultar_entrega, traslado_mascota);
        
        vb.setSpacing(20);
        vb.setAlignment(Pos.BOTTOM_LEFT);
        //Label opcion = Metodos.getLabel("Escoja una Opcion:"); opcion.setTranslateY(100);
        //HBox hb = new HBox(opcion, vb); vb.setAlignment(Pos.CENTER_LEFT); vb.setSpacing(50);
        return vb;
        
    }
    
    public Pane getRoot(){
        return root;
    }
}


