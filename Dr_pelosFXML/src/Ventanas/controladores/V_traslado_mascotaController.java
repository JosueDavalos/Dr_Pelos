/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.controladores;

import TDAs.Traslado;
import TDAs.Venta;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static util.Componente.inicializarComboEstadoEntrega;
import static util.Componente.inicializarComboTipoMascota;
import static util.Datos.atributosTraslados;
import static util.Datos.atributosVentas;
import static util.QueryFachade.getTrasladosDB;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class V_traslado_mascotaController implements Initializable {

    @FXML
    private ImageView boton_atras;
    @FXML
    private ImageView cerrar_sesion;
    @FXML
    private Button continuar_venta;
    @FXML
    private Button boton_buscar;
    @FXML
    private TextField nombte_mascota;
    @FXML
    private TextField direccion_mascota;
    @FXML
    private ComboBox<String> combo_estado_entrega;
    @FXML
    private ComboBox<String> combo_tipo;
    @FXML
    private TableView<Traslado> table_traslado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboEstadoEntrega(combo_estado_entrega);
        
        inicializarComboTipoMascota(combo_tipo);
        String[] atributos = atributosTraslados();
        
        int i =0;
        for(TableColumn<Traslado,?> col: table_traslado.getColumns()){
            col.setStyle( "-fx-alignment: CENTER;");
            col.setCellValueFactory(new PropertyValueFactory<>(atributos[i++]));
        }
        table_traslado.getItems().addAll(getTrasladosDB());    
        
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
    private void accion_continuar_venta(MouseEvent event) {
    }

    @FXML
    private void accion_buscar(MouseEvent event) {
    }
    
}
