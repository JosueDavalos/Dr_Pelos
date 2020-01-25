/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javafx.scene.control.ComboBox;

/**
 *
 * @author jeffer
 */
public class Componente {
    
    public static void inicializarComboGenero(ComboBox<String> combo){
        combo.getItems().addAll("Masculino","Femenino");
    }
    
    public static void inicializarComboEstadoEntrega(ComboBox<String> combo){
        combo.getItems().addAll("Entregado","Pendiente");
    }
    
    public static void inicializarComboTipoMascota(ComboBox<String> combo){
        combo.getItems().addAll("Canino","Felino","Ave","Roedor");
    }
    
    public static void inicializarComboCategoriaPaquete(ComboBox<String> combo){
        combo.getItems().addAll("Alimento","Juguete","Rospa","Medicina");
    }
    
    public static void inicializarComboTipoServicio(ComboBox<String> combo){
        combo.getItems().addAll("Peluqueria","Atencion medica");
    }
    
    public static void inicializarComboTipo(ComboBox<String> combo){
        combo.getItems().addAll("Producto","Servicio");
    }
    
    public static void comboFormaPago(ComboBox<String> combo){
        combo.getItems().addAll("Efectivo","Credito","Paypal");
        combo.getSelectionModel().select(0);//set efectivo por default
    }
}
