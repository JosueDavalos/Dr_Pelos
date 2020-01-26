/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.controladores;

import TDAs.Paquete;
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
import static util.Componente.inicializarComboCategoriaPaquete;
import static util.Componente.inicializarComboTipo;
import static util.Componente.inicializarComboTipoServicio;
import static util.Datos.atributosPaquetes;
import static util.Datos.atributosVentas;
import static util.QueryFachade.getPaquetesDB;
import static util.QueryFachade.getProductosDB;
import static util.QueryFachade.getServiciosDB;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class V_ventaController implements Initializable {

    @FXML
    private ImageView boton_atras;
    @FXML
    private ImageView cerrar_sesion;
    @FXML
    private Button boton_buscar;
    @FXML
    private Button continuar_venta;
    @FXML
    private TextField nombre_producto;
    @FXML
    private TextField descripcion;
    @FXML
    private ComboBox<String> combo_categoria;
    @FXML
    private ComboBox<String> tipo;
    @FXML
    private TableView<Venta> table_venta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboCategoriaPaquete(combo_categoria);
        inicializarComboTipoServicio(combo_categoria);
        inicializarComboTipo(tipo);
        
         String[] atributos = atributosVentas();
        
        int i =0;
        for(TableColumn<Venta,?> col: table_venta.getColumns()){
            col.setStyle( "-fx-alignment: CENTER;");
            col.setCellValueFactory(new PropertyValueFactory<>(atributos[i++]));
        }
        table_venta.getItems().addAll(getProductosDB());    
        table_venta.getItems().addAll(getServiciosDB()); 
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

    @FXML
    private void accion_continuar_venta(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/V_continuar_venta.fxml",event, this);
    }
    
}
