/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static com.sun.javafx.css.SizeUnits.S;
import database_queries.MySQLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.S;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.input.MouseEvent;
import static javax.swing.text.html.HTML.Tag.S;
import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.S;
import usuario.Cliente;
import static util.Componente.inicializarComboGenero;
import static util.Datos.atributosCliente;
import util.QueryFachade;
import static util.QueryFachade.getClientesDB;
import static util.Ventana.cambiarVentana;

/**
 * FXML Controller class
 *
 * @author jeffer
 */
public class V_clienteController implements Initializable {

    @FXML private ImageView boton_atras;
    @FXML private Button boton_buscar;
    @FXML private ImageView cerrar_sesion;
    @FXML private Button eliminar_cliente;
    @FXML private Button nuevo_cliente;
    
    @FXML private TextField cedula;
    @FXML private TextField nombre;
    @FXML ComboBox<String> combo_genero;
    @FXML private TextField apellido;
    
    @FXML private TableView<Cliente> tabla_cliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarComboGenero(combo_genero);
        tabla_cliente.setEditable(true);
        String[] atributos = atributosCliente();
        
        int i =0;
        for(TableColumn<Cliente,?> col: tabla_cliente.getColumns()){
            TableColumn<Cliente,String> c = (TableColumn<Cliente,String>) col;
            c.setStyle( "-fx-alignment: CENTER;");
            c.setCellValueFactory(new PropertyValueFactory<>(atributos[i++]));
            c.setCellFactory(TextFieldTableCell.forTableColumn());
        }
        tabla_cliente.getItems().addAll(getClientesDB());          
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
    private void accion_eliminar_cliente(MouseEvent event) {
        Cliente clienteSelected = tabla_cliente.getSelectionModel().getSelectedItem();
        System.out.println("Boton aplastado");
        QueryFachade.makeQueryManipulate("DELETE FROM Cliente WHERE cedula='0931655365';");
        
        
    }

    @FXML
    private void accion_nuevo_cliente(MouseEvent event) throws IOException {
        cambiarVentana("/Ventanas/VnuevoCliente.fxml",event, this);
    }
    
    @FXML
    private void cambiar_nombre(CellEditEvent<Cliente, String> event) {
        Cliente clienteSelected = tabla_cliente.getSelectionModel().getSelectedItem();
        clienteSelected.setNombre(event.getNewValue().toString());
    }

  
    
}
