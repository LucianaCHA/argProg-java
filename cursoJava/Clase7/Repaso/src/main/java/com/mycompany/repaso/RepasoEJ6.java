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
public class RepasoEJ6 {
  public static void main(String[] args) {


  menu(JOptionPane.showInputDialog("¿Desea jugar? \n 1. Si \n 2. No"));

  }

  public static int numeroRandom(){
    int numero = (int) (Math.random() * 10);
    return numero;
  }

  public static void menu(String opcion){

    switch (opcion){
      case "1":
      
        int numero_usuario = RepasoEJ5.pedirEntero("Ingrese un número del 1 al 10");
        int numero_random = numeroRandom();

        while(numero_usuario != numero_random){
          numero_usuario = RepasoEJ5.pedirEntero("Inténtelo otra vez");
        }

        if(numero_usuario == numero_random){
          JOptionPane.showMessageDialog(null, "Ganó!!! Felicitaciones");
          

        }
        break;

      default:
        JOptionPane.showMessageDialog(null, "Gracias por participar");
        break;       
  }
  }


  


    
}
