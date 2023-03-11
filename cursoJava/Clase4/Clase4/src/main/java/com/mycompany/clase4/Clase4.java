/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase4 {

    public static void main(String[] args) {
        
        String letra_input = JOptionPane.showInputDialog("Ingrese un caracter: ");
        String input_num= JOptionPane.showInputDialog("Ingrese un número entero: ");
        
        char letra = letra_input.charAt(0);
        int num = Integer.parseInt(input_num);
        
        JOptionPane.showMessageDialog(null, asciiYSuma(letra, num));
    }
    
    public static int multiplicar(int factor1, int factor2) {        
        return factor1 * factor2;
    }
    
    public static int asciiYSuma(char character, int num) {        
        return ((int) character + num);
    }
}
