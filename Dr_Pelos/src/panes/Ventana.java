/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import Util.ComponentePane;
import Util.Metodos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author jeffer
 */
public class Ventana {
    private BorderPane root;

    public Ventana() {
        this.root = new BorderPane();
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }
    
    public void setCenter(Pane pane){
        root.getChildren().clear();
        root.setCenter(pane);
    }
    
    public void setTop(){
         this.root.setTop(ComponentePane.topPane());
    } 
    
}
