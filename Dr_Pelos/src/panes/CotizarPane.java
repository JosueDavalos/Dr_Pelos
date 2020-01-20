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
public class CotizarPane extends Ventana{
    private Button buscar;
    private TextField Tnombre;
    private TextField Tcategoria;
    private TextField Tdescripcion;
    
    public CotizarPane(){
        super(new BorderPane());
        super.setCenter(cotizarCenter()); 
        super.setTop();
    }
    
    private Pane cotizarCenter(){
        buscar = Metodos.crearBoton("Buscar");
        
        VBox vb = new VBox(panelFiltos(), Metodos.crearTable());
        vb.setSpacing(30);
        return vb;
    }
    
    private Pane panelFiltos(){
        int size= 15;
        Label Lnombre = Metodos.getLabel("Nombre", size);
        Label Lcategoria = Metodos.getLabel("Categoria", size);
        Label Ldescripcion = Metodos.getLabel("Descripcion", size);
        Tnombre = new TextField();
        Tcategoria = new TextField();
        Tdescripcion = new TextField();
        
        GridPane gp = new GridPane();
        gp.addColumn(0, Lnombre, Tnombre, Lcategoria, Tcategoria);
        gp.addColumn(1, Ldescripcion, Tdescripcion, buscar);
        gp.setHgap(15); 
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        return gp;
    }
    
}
