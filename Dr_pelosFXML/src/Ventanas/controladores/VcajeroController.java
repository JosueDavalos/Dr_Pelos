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
import javafx.scene.layout.HBox;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class VcajeroController implements Initializable {

    @FXML
    private HBox agregarCliente;
    @FXML
    private HBox consultarEntrega;
    @FXML
    private HBox cotizar;
    @FXML
    private HBox Venta;
    @FXML
    private HBox traslado;
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
    private void ActionIngresarCliente(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/VnuevoCliente.fxml",event, this);
    }

    @FXML
    private void AccionConsultar(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/VconsultarEntrega.fxml",event, this);
    }

    @FXML
    private void AccionCotizar(MouseEvent event) {
    }

    @FXML
    private void AccionVenta(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/V_venta.fxml",event, this);
    }

    @FXML
    private void AccionTrasladoMascota(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/V_traslado_mascota.fxml",event, this);
    }

    @FXML
    private void ActionCerrarSesson(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }

  
}
