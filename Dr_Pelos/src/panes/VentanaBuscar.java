/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import Util.ComponentePane;
import Util.Metodos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author jeffer
 */
public class VentanaBuscar extends Ventana{
    private Button buscar;
    private TextField Tnombre;
    private TextField Tcategoria;
    private TextField Tdescripcion;

    public VentanaBuscar() {
        super();
        Tnombre = new TextField();
        Tcategoria = new TextField();
        Tdescripcion = new TextField();
        buscar = ComponentePane.crearBoton("Buscar");
        
    }
    
    public Pane panelFiltos(int size){
        Label Lnombre = ComponentePane.getLabel("Nombre", size);
        Label Lcategoria = ComponentePane.getLabel("Categoria", size);
        Label Ldescripcion = ComponentePane.getLabel("Descripcion", size);
        
        GridPane gp = new GridPane();
        gp.addRow(0, Lnombre, Tnombre, Lcategoria, Tcategoria, buscar);
        gp.addRow(1, Ldescripcion, Tdescripcion);
        gp.setHgap(25); 
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        return gp;
    }
}
