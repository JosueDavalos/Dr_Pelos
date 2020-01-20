/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import dr_pelos.Metodos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author jeffer
 */
public class CotizarPane extends VentanaBuscar{
    public CotizarPane(){
        super();
        super.setCenter(cotizarCenter()); 
        super.setTop();
    }
    
    private Pane cotizarCenter(){
        VBox vb = new VBox(super.panelFiltos(25), Metodos.crearTable());
        vb.setSpacing(30);
        return vb;
    }
    
}
