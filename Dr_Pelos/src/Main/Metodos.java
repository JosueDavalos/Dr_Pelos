/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import panes.Constantes;

/**
 *
 * @author jeffer
 */
public class Metodos {
    
    
    public static ImageView getImagen(String nombre, double largo, double ancho){
        Image atras = new Image("agregar-usuario.png",largo,ancho,true,true);
        ImageView img_atras = new ImageView(atras);
        return img_atras;
    }
}
