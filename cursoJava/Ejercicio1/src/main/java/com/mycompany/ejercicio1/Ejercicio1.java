/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int factor1 = 18;
        String input_num = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int factor2 = Integer.parseInt(input_num);
        
        System.out.println("Multiplicaremos " + factor1 + " por " + factor2);        
        int producto = factor1 * factor2;
        System.out.println(factor1 + "X" + factor2 + " = " + producto);
    }
}
