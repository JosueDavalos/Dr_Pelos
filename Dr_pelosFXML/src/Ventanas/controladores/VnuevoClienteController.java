/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.controladores;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Componente.inicializarComboGenero;
import util.QueryFachade;
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
    private ComboBox<String> combo_genero;

    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField cedulaTxt;
    @FXML
    private TextField apellidoTxt;
    @FXML
    private TextField direccionTxt;
    @FXML
    private Button registrarBtn;
    @FXML
    private TextField correoTxt;
    @FXML
    private TextField telfTxt;
    @FXML
    private DatePicker fechaDP;
    
    
    public VnuevoClienteController() {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboGenero(combo_genero);
    }    
    

    @FXML
    private void AccionAtras(MouseEvent event) throws IOException{
        cambiarVentana("/Ventanas/V_cliente.fxml",event, this);
    }

    @FXML
    private void ActionCerrarSesion(MouseEvent event) throws IOException {
        cambiarVentana("/dr_pelosfxml/Login.fxml",event, this);
    }
    


    @FXML
    private void ActionRegistraCliente(ActionEvent event)throws IOException {
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String cedula = cedulaTxt.getText();
        String correo = correoTxt.getText();
        String direccion = direccionTxt.getText();
        String telefono = telfTxt.getText();
        String genero = combo_genero.getValue().equals("Femenino") ? "F" : "M";
        LocalDate fecha = fechaDP.getValue();
        
        String query = String.format("INSERT INTO Cliente(cedula, nombre, apellido, genero, correo, FechaNacimiento,direccion, telefono) "
                + "VALUES (\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",cedula,nombre,apellido,genero,correo,fecha.toString(),direccion,telefono);
        System.out.println(query);
        QueryFachade.makeQueryManipulate(query);
        
        
    }
}
