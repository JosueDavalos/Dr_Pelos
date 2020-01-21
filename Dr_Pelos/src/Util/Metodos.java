/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author JosueDavalos
 */
public class Metodos {
    
    
    public static String capitalize(String str) {
    if (str.isEmpty()) {
        return str;            
    } else {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1); 
    }
}
    
    
    
}
