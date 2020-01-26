/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.controladores;

import TDAs.Paquete;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import usuario.Cliente;
import static util.Componente.inicializarComboCategoriaPaquete;
import static util.Componente.inicializarComboEstadoEntrega;
import static util.Datos.atributosCliente;
import static util.Datos.atributosPaquetes;
import static util.QueryFachade.getClientesDB;
import static util.QueryFachade.getPaquetesDB;
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
    private ComboBox<String> estado_paquete;
    @FXML
    private ComboBox<Cliente> cliente;
    @FXML
    private DatePicker fecha_envio;
    @FXML
    private DatePicker fecha_entrega;
    @FXML
    private TableView<Paquete> table_consultar_paquete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboEstadoEntrega(estado_paquete);
        String[] atributos = atributosPaquetes();
        
        int i =0;
        for(TableColumn<Paquete,?> col: table_consultar_paquete.getColumns()){
            col.setStyle( "-fx-alignment: CENTER;");
            col.setCellValueFactory(new PropertyValueFactory<>(atributos[i++]));
        }
        table_consultar_paquete.getItems().addAll(getPaquetesDB());    
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
