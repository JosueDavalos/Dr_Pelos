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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class V_continuar_ventaController implements Initializable {

    @FXML
    private ImageView boton_atras;
    @FXML
    private ImageView cerrar_sesion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void action_Atras(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/V_venta.fxml",event, this);
    }

    @FXML
    private void action_cerrar_session(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }
    
}
