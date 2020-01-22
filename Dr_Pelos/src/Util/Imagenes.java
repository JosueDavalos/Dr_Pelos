/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import panes.Constante;

/**
 *
 * @author jeffer
 */
public class Imagenes {
    
    public static ImageView getImagen(String nombre, int largo, int ancho){
        Image imagen = new Image(Constante.ruta+nombre+".png",largo,ancho,true,true);
        return new ImageView(imagen);
    }
    
    public static ImageView botonAtras(){
        return getImagen("atras",40,40);
    }
}
