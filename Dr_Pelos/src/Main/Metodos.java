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
    
    public static ImageView imagenAsignatura(int largo, int ancho){
        Image asignatura = new Image(Constantes.ruta+"agregar_usuario.png",largo,ancho,true,true);
        return new ImageView(asignatura); 
     }
}
