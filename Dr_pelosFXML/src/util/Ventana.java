/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author jeffer
 */
public class Ventana {
    
    public static void cambiarVentana(String ruta, MouseEvent event, Object obj) throws IOException{
       FXMLLoader loader = new FXMLLoader(obj.getClass().getResource(ruta));
       Parent root = loader.load();
       Scene nuevo = new Scene(root);
       
       Stage ventana = (Stage)((Node) event.getSource()).getScene().getWindow();
       ventana.setScene(nuevo);
       ventana.show();
    }
    
}
