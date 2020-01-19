/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelos;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import panes.Constante;

/**
 *
 * @author JosueDavalos
 */
public class Metodos {
    
    public static ImageView getImagen(String nombre, int largo, int ancho){
        Image imagen = new Image(Constante.ruta+nombre+".png",largo,ancho,true,true);
        return new ImageView(imagen);
    }
    
    public static Label getLabel(String string){
        Label label = new Label(string); 
        label.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        return label;
    }
    
    public static Pane crearOpcion(String opcion, int size){
        ImageView img_user = Metodos.getImagen(opcion, size, size);
        Label LUser = Metodos.getLabel(opcion);
        LUser.setTranslateY(25);
        HBox hb = new HBox(img_user,LUser); 
        hb.setSpacing(50);
        return hb;
    }
}
