/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelos;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import panes.Constante;
import panes.Ventana;
import panes.personalCaja.NuevoCliente;

/**
 *
 * @author JosueDavalos
 */
public class Metodos {
    
    public static ImageView getImagen(String nombre, int largo, int ancho){
        Image imagen = new Image(Constante.ruta+nombre+".png",largo,ancho,true,true);
        return new ImageView(imagen);
    }
    
    public static Label getLabel(String string, int size){
        Label label = new Label(string); 
        label.setFont(Font.font("Arial", FontWeight.BOLD, size));
        return label;
    }
    
    public static Pane crearOpcion(String opcion, int size){
        ImageView img_user = Metodos.getImagen(opcion, size, size);
        Label LUser = Metodos.getLabel(opcion, 30);
        LUser.setTranslateY(30);
        HBox hb = new HBox(img_user,LUser);
        hb.setSpacing(50);
        return hb;
    }
    
    public static Pane topPane(){
        HBox hb = new HBox(getLabel("Salir", 20), getImagen("logout",35,35));
        hb.setTranslateY(25);
        hb.setTranslateX(-25);
        hb.setSpacing(20);
        hb.setAlignment(Pos.TOP_RIGHT);
        return hb;
    }
    
    public static ComboBox getComboGenero(){
        ComboBox cb = new ComboBox();
        cb.getItems().addAll("Masculino","Femenino");
        return cb;
    }
    
    public static Button crearBoton(String name){
         Button boton = new Button(name); 
         boton.setStyle("-fx-background-color: #000000;-fx-text-fill: white;-fx-font-size: 20;");
         return boton;
    }
    
    public static void chancePane(BorderPane root, Ventana pane){
        root.getChildren().clear();
        pane.setCenter(pane.getRoot());
    }
    
}
