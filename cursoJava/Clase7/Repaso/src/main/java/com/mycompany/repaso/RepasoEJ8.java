/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class RepasoEJ8 {
    public static void main(String[] args) {
        //sumaToAscii(pedirDouble(), pedirDouble());        
        
        imprimirResultado(sumaToAscii(pedirDouble(), pedirDouble()));
    }
    
    public static double pedirDouble(){
    String input = JOptionPane.showInputDialog("Ingrese un número");
        
        try {
            double input_num = Double.parseDouble(input);
            return input_num;
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No es un número real, reingrese");
            return pedirDouble();
        }
    }
    
    public static char intToAscii(int num){
        return (char) num;
    }
    
    public static char sumaToAscii(double num1, double num2){
        int value = (int)num1 + (int)num2;
        return intToAscii(value);
    }
    
    public static void imprimirResultado(char caracter){
        int ascii = (int) caracter;
        JOptionPane.showMessageDialog(null, "Para el caracter " + caracter + " el código ASCII es "+ ascii);
    }
        
}
