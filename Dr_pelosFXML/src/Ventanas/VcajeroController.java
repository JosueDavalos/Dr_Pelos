/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import dr_pelosfxml.LoginController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JosueDavalos
 */
public class VcajeroController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /*public void ActionIngresarCliente(ActionEvent event) throws IOException {
        System.out.println("Hola bb2");
        
        Parent v_agregar_cliente = (new VnuevoClienteController()).getEscenario();
        Scene scene_agregar_cliente = new Scene(v_agregar_cliente);
        Stage ventana = (Stage)((Node) event.getSource()).getScene().getWindow();
        ventana.setScene(scene_agregar_cliente);
        ventana.show();
    }*/
    
  
    
    public Parent getEscenario() throws IOException{
        return FXMLLoader.load(getClass().getResource("Vcajero.fxml"));
    }

    @FXML
    private void ActionCerrarSesion(MouseEvent event) {
        System.out.println("cerrar session");
    }

    @FXML
    private void ActionIngresarCliente(MouseEvent event) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("VnuevoCliente.fxml"));
       Parent root = loader.load();
       VnuevoClienteController control = loader.getController();
       Scene nuevo = new Scene(root);
       
       Stage ventana = (Stage)((Node) event.getSource()).getScene().getWindow();
       ventana.setScene(nuevo);
       ventana.show();
       
    }
}
