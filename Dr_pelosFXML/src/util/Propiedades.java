/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author JosueDavalos
 */
public class Propiedades {
    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static float x_screen = screenSize.height;
    public static float y_screen = screenSize.width;
    
    
   
}
