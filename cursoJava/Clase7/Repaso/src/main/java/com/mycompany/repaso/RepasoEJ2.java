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
public class RepasoEJ2 {
    public static void main(String[] args) {
      int NUMEROS = 3;

      int[] numeros = new int[NUMEROS];
      int contador = 0;

      while (contador < NUMEROS) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if (numero != numeros[0] && numero != numeros[1] && numero != numeros[2]) {
          numeros[contador] = numero;
          contador++;
        } else {
          JOptionPane.showMessageDialog(null, "El número ya fue ingresado");
        }
      }

      int mayor = numeros[0];

      for (int i = 1; i < NUMEROS; i++) {
        if (numeros[i] > mayor) {
          mayor = numeros[i];
        }
      }

      JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
    }
    
}
