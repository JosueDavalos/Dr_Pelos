/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.controladores;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import static util.Ventana.cambiarVentana;

/**
 *
 * @author JosueDavalos
 */
public class LoginController implements Initializable {
    @FXML
    private Button botonIngresar;
    @FXML
    private Button botonSalir;
    @FXML
    private TextField user;
    @FXML
    private PasswordField password;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void AccionIngresar(MouseEvent event) throws IOException {
       cambiarVentana("/Ventanas/Vcajero.fxml",event, this);
    }

    @FXML
    private void AccionSalir(MouseEvent event) {
        System.exit(0);
    }
       
    
}
