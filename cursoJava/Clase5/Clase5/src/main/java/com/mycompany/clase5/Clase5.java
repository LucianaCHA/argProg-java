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
                resultSup(supSquare(requireInput("lado")), "cuadrado");
                break;
            case("2"):
                resultSup(supRectangle(requireInput("base"), requireInput("altura")), "rectángulo");
                break;
            case("3"):
            resultSup(supCircle(requireInput("radio")), "círculo");
                break;
            case("4"):
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                main(args);
            }
    }

    public static double requireInput(String input){
        String input_num = JOptionPane.showInputDialog("Ingrese " + input);
        return  Double.parseDouble(input_num);
    }
        
    public static double supSquare(double side){        
        return side * side ;    
    }

    public static void resultSup(double sup, String figure){
        JOptionPane.showMessageDialog(null, "La superficie del " + figure + " es: " + sup);
    }
    
    public static double supRectangle(double b, double h){        
        return b*h;    
    }
    
    public static double supCircle(double radio){
        return (double) (Math.PI * Math.pow(radio, 2.00));
    }
}
