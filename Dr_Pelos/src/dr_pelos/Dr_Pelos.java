/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dr_pelos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import panes.LoginPane;

/**
 *
 * @author JosueDavalos
 */
public class Dr_Pelos extends Application {
    LoginPane pantalla = new LoginPane();
    
    @Override
    public void start(Stage primaryStage) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(pantalla.getRoot());
        primaryStage.setTitle("Veterinaria Dr. Pelos");
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(screenSize.height);
        primaryStage.setMinWidth(screenSize.width);
        primaryStage.setMaximized(true);
        File fi = new File("src\\imagenes\\icono.png");
        primaryStage.getIcons().add(new Image(fi.toURI().toString()));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
