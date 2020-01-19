/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panes.CajeroCaja;

import Main.Metodos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author jeffer
 */
public class PersonalCajaPane {
    private static BorderPane root;
    
    public PersonalCajaPane(){
        root = new BorderPane();
        root.setCenter(cajaCenter()); 
        
    }
    
    private Pane cajaCenter(){
        //Opcion Agregar nuevo cliente
        ImageView img_nuevo_usuario =  Metodos.imagenAsignatura(100,100);
        Label LUser = new Label("Agregar Cliente"); LUser.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        HBox h_user = new HBox(img_nuevo_usuario, LUser); h_user.setAlignment(Pos.CENTER);
        /*vp.setOnMouseClicked( (event) -> {
            ProfeAdminPane profe_pane = new ProfeAdminPane();
            root.getChildren().clear();
            root.setCenter(profe_pane.getRoot());
        });*/
        
        /*//Opcion Cotizar
        ImageView img_cotizar =  Metodos.getImagen("agregar-usuario",200,200);
        Label Lest = new Label("Estudiante"); Lest.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        VBox ve = new VBox(img_cotizar, Lest); ve.setAlignment(Pos.CENTER);
        
        //Opcion Venta Producto y servicio
        ImageView img_venta =  Metodos.getImagen("agregar-usuario",200,200);
        Label Lsalon = new Label("Niveles"); Lsalon.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        VBox vs = new VBox(img_venta,Lsalon); vs.setAlignment(Pos.CENTER);
        
        
        //Opcion Consultar Entrega
        ImageView img_consulta_entrega =  Metodos.getImagen("agregar-usuario",200,200);
        Label Lasig = new Label("Asignatura"); Lasig.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        VBox va = new VBox(img_consulta_entrega, Lasig); va.setAlignment(Pos.CENTER);

        
        //Opcion Trnslado de mascota
        ImageView img_traslado =  Metodos.getImagen("agregar-usuario",200,200);
        Label Lreport = new Label("Reportes"); Lreport.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        VBox vr = new VBox(img_traslado, Lreport); vr.setAlignment(Pos.CENTER);*/
  
        
        HBox hb = new HBox(h_user);
        hb.setSpacing(70);
        hb.setAlignment(Pos.CENTER);
        Label opcion = new Label("Escoja una Opcion:"); opcion.setFont(Font.font("Arial", FontWeight.BOLD, 30)); opcion.setTranslateX(100);
        VBox vb = new VBox(opcion, hb); vb.setAlignment(Pos.CENTER_LEFT); vb.setSpacing(50);
        return vb;
    }
    
    public Pane getRoot(){
        return root;
    }
    
}
