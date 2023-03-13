/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase5 {

    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Usted puede calcular la superficie para las figuras:\n" +
"                1. Cuadrado.\n" +
"                2. Rectángulo.\n" +
"                3. Círculo.\n" +
"                4. Salir y terminar.\n" +
"             Elija una opción indicando el número y enter:   __");
        
        switch(option){
            case("1"):
                JOptionPane.showMessageDialog(null, resultSup(supSquare(), "cuadrado"));
                break;
            case("2"):
                JOptionPane.showMessageDialog(null, resultSup(supRectangle(), "rectángulo"));
                break;
            case("3"):
                JOptionPane.showMessageDialog(null, resultSup(supCircle(), "círculo"));
                break;
            case("4"):
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                main(args);
            }
    }
    
    public static int supSquare(){
        
        String input_b = JOptionPane.showInputDialog("Ingrese lado");
        int b = Integer.parseInt(input_b);
        
        return b*b;    
    }

    public static String resultSup(int sup, String figure){
        return "La superficie del " + figure + " es: " + sup;
    }
    
    public static int supRectangle(){
        
        String input_b = JOptionPane.showInputDialog("Ingrese base");
        int b = Integer.parseInt(input_b);
        
        String input_h = JOptionPane.showInputDialog("Ingrese altura");
        int h = Integer.parseInt(input_h);
        
        return b*h;    
    }
    
    public static int supCircle(){
        
        String input_radio = JOptionPane.showInputDialog("Ingrese radio"); 
        int radio = Integer.parseInt(input_radio);

        return (int) (Math.PI * Math.pow(radio, 2));
    }
}
