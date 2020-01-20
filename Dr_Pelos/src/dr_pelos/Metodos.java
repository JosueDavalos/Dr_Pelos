/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelos;

import TDAs.Cliente;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    
    public static String capitalize(String str) {
    if (str.isEmpty()) {
        return str;            
    } else {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1); 
    }
}
    
    public static TableView crearTable(){
        TableView<Object> table = new TableView();
        String[] atributos = {"cedula","nombre","apellido","genero","correo","direccion","telefono","fechaNacimiento"};
        
        for(int i=0; i<atributos.length; i++){
            String name_col = atributos[i];
            TableColumn<Object, String> col= new TableColumn(capitalize(name_col));
            col.setMinWidth(120);
            col.setStyle( "-fx-alignment: CENTER;");
            col.setCellValueFactory(new PropertyValueFactory<>(name_col));
            table.getColumns().add(col);
        }
        
        Cliente c1 = new Cliente("0931657365","Bryan","Sanchez","1999-12-18","M","brymsanc@espol.edu.ec","Acuarela del rio Mz 2 V1","0989195454");
        Cliente c2 = new Cliente("7894561230","Mois","Cabezas","1999-12-25","M","bmsa@espol.edu.ec","Sauces","0989845621");
        Cliente c3 = new Cliente("1234560785","Josue","Davalos","1990-01-02","M","josuetunene@gmail.com","Acuarela del rio Mz 2 V1","0935698745");
        Cliente c4 = new Cliente("7412589630","Galrer","Saltos","1975-01-18","M","gallarota@gmail.com","Sauces 9 V1","0956471236");
        Cliente c5 = new Cliente("9632587410","Ginger","Saltos","1960-02-04","F","gsaltos@espol.edu.ec","Ceibos","0956847125");
        Cliente c6 = new Cliente("8521479630","Eduardo","Cruz","1975-05-08","M","ecruz@espol.edu.ec","Entrada de la 8","0965748954");
        Cliente c7 = new Cliente("0254136987","Allan","Galarraga","1990-04-05","M","elgala@espol.edu.ec","Acuarela del rio Mz 2 V1","0984571659");
        Cliente c8 = new Cliente("8544961234","Kimberly","Suarez","1999-12-18","F","kimberlyprexiositaemoxitap@espol.edu.ec","Aquisito","0945687521");
        Cliente c9 = new Cliente("0931655365","Jefferson","Sanchez","1999-11-18","M","jeffer@espol.edu.ec","Mapasingue Oeste","0954645756");
        table.getItems().addAll(c1,c2,c3,c4,c5,c6,c7,c8,c9); 
        return table;
    }
    
}
