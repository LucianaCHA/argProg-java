/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase3 {

    public static void main(String[] args) {
        
        String palabra_input = JOptionPane.showInputDialog("Ingrese una palabra: ");
        String letra_input = JOptionPane.showInputDialog("Ingrese letra a buscar: ");

        char letra = letra_input.charAt(0);
        int contador = 0;
        String palabra = palabra_input.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la palabra " + palabra);
    };

}
