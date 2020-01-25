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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Componente.inicializarComboCategoriaPaquete;
import static util.Componente.inicializarComboEstadoEntrega;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class VconsultarEntregaController implements Initializable {

    @FXML
    private ImageView cerrar_sesion;
    @FXML
    private ImageView boton_atras;
    @FXML
    private Button boton_buscar;
    @FXML
    private TextField nombre_paquete;
    @FXML
    private TextField descripcion_paquete;
    @FXML
    private ComboBox<String> estado_paquete;
    @FXML
    private ComboBox<String> categoria_paquete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboEstadoEntrega(estado_paquete);
        inicializarComboCategoriaPaquete(categoria_paquete);
    }    

    @FXML
    private void action_Atras(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/Vcajero.fxml",event, this);
    }

    @FXML
    private void action_cerrar_session(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }

    @FXML
    private void accion_buscar(MouseEvent event) {
    }
    
}
