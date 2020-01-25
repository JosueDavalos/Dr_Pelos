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
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Componente.comboFormaPago;
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
    @FXML
    private Button boton_cotizar;
    @FXML
    private Button boton_comprar;
    @FXML
    private Button boton_cancelar;
    @FXML
    private ComboBox<String> combo_cliente;
    @FXML
    private ComboBox<String> forma_pago;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboFormaPago(forma_pago);
    }    

    @FXML
    private void action_Atras(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/V_venta.fxml",event, this);
    }

    @FXML
    private void action_cerrar_session(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }

    @FXML
    private void accion_cotizar(MouseEvent event) {
        
    }

    @FXML
    private void accion_comprar(MouseEvent event) {
    }

    @FXML
    private void accion_cancelar(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/Vcajero.fxml",event, this);
    }
    
}
