/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class RectanguloExe {
   public static void main(String[] args) {
    Rectangulo [] rectangulos = new Rectangulo[5];

    int i = 0;

    while (i < 5){
    rectangulos[i] = new Rectangulo();
    rectangulos[i].base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese base del rectángulo" + (i+1)));
    rectangulos[i].altura =   Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura del rectángulo" + (i+1)));
    rectangulos[i].color = JOptionPane.showInputDialog("Ingrese color del rectángulo" + (i+1));
    i++;
    }

    for (Rectangulo rectangulo : rectangulos) {
        rectangulo.mostrarTodos();
    }
    
    for (Rectangulo  rectangulo : rectangulos){
        rectangulo.base += 3;
        rectangulo.mostrarTodos();
    }
    
    for (Rectangulo  rectangulo : rectangulos){
        rectangulo.color = "rojo";
        rectangulo.mostrarTodos();
    }
       
       
   }
   
}
