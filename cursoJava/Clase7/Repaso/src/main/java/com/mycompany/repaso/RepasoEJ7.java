/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import static com.mycompany.repaso.RepasoEJ6.numeroRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class RepasoEJ7 {
   public static void main(String[] args) {
    String opcion = JOptionPane.showInputDialog("¿Desea jugar? \n 1. Si \n Cualquier teccla para salir");
    
    int aciertos = 0; 
    
    while ("1".equals(opcion) ){
        int numero_usuario = RepasoEJ5.pedirEntero("Ingrese un número del 1 al 10");
        int numero_random = numeroRandom();

        while(numero_usuario != numero_random){
          numero_usuario = RepasoEJ5.pedirEntero("Inténtelo otra vez");
        }

        if(numero_usuario == numero_random){
          JOptionPane.showMessageDialog(null, "Ganó!!! Felicitaciones");
          aciertos++;
          opcion = JOptionPane.showInputDialog("¿Desea seguir jugando? \n 1. Si \n Cualquier teccla para salir");
        }
    }
    JOptionPane.showMessageDialog(null, "Nro de aciertos: " + aciertos + "\n Gracias por participar");
    }    
}