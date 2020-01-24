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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class VnuevoClienteController implements Initializable {

    @FXML
    private ImageView botonAtras;
    @FXML
    private ImageView cerrar_sesion;
    @FXML
    private Button botonCancelar;
    @FXML
    private ComboBox<?> combo_genero;

    public VnuevoClienteController() {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    private void AccionAtras(MouseEvent event) throws IOException{
        cambiarVentana("/Ventanas/Vcajero.fxml",event, this);
    }

    @FXML
    private void ActionCerrarSesion(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }
    
}
