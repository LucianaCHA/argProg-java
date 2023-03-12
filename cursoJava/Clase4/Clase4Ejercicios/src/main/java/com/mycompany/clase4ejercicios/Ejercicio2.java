/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4ejercicios;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Ejercicio2 {
  public static void main(String[] args)  throws Exception {
    String ruta = JOptionPane.showInputDialog("Ingrese la ruta del archivo");
    char operador = JOptionPane.showInputDialog("Ingrese el operador").charAt(0);
    
    try {
      System.out.println(sumarNumeros(ruta, operador));
    } catch (Exception e) {
      // si no existe el archivo o no se puede leer
      System.out.println("No se pudo leer el archivo");
    }
  }

  public static int sumarNumeros(String ruta, char operador ) throws Exception {
    // Creo un objeto de tipo InputStream para leer el archivo y lanzo una excepción si no se puede leer 

    InputStream file = new FileInputStream(ruta);

    //Scanner permite leer el archivo linea por linea
    try (Scanner obj = new Scanner(file)) {
      
      int resultado = 1;

      while(obj.hasNextLine()){

        String linea = obj.nextLine();

        if(linea.matches("[0-9]+")){
            if(operador == '+'){
                resultado += Integer.parseInt(linea);
            }else if(operador == '*'){
                resultado *= Integer.parseInt(linea);
            }          
        }
      }
      if(operador == '+'){
          return resultado -1;
            }          
      return resultado;
    }
  }    
}
