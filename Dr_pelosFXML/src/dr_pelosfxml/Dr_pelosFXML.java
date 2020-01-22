/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelosfxml;

import java.awt.Dimension;
import javafx.scene.image.Image;
import java.awt.Toolkit;
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author JosueDavalos
 */
public class Dr_pelosFXML extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage.setTitle("Veterinaria Dr. Pelos");
        Scene scene = new Scene(root);
        //stage.setMaximized(true);
        stage.setScene(scene);
        File fi = new File("src\\imagenes\\icono.png");
        stage.getIcons().add(new Image(fi.toURI().toString()));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
