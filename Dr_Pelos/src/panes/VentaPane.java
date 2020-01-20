/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import dr_pelos.Metodos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author jeffer
 */
public class VentaPane extends VentanaBuscar{
    
    public VentaPane(){
        super();
        super.setCenter(ventaCenter()); 
        super.setTop();
    }
    
    private Pane ventaCenter(){
        VBox vb = new VBox(super.panelFiltos(15), Metodos.crearTable());
        vb.setSpacing(30);
        return vb;
    }
    
}
