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
public class RepasoEJ3 {
    public static void main(String[] args) {
        
        float inicio = pedirReal();
        float fin = pedirReal();
        
        incrementoFor(inicio, fin, 1);
        
        incrementoFor(inicio, fin, 2);
        
        incrementoFor(inicio, fin, (float) 1.5);
        
    }
    
    public static float pedirReal(){
        String input = JOptionPane.showInputDialog("Ingrese un número");
        
        try {
            float input_num = Float.parseFloat(input);
            return input_num;
        } catch (NumberFormatException e){
            JOptionPane.showConfirmDialog(null, "No es un número real, reingrese");
            return pedirReal();
        }
    }
    
    public static void incremento (float inicio, float fin, float avance){
       
        System.out.println("Aumentando de " + avance + " en " + avance);
    
        while(inicio <= fin ){
            System.out.println(inicio);
            inicio += avance;
        }

    }
    
    public static void incrementoFor(float inicio, float fin, float avance){
        System.out.println("Aumentando con ciclo for de " + avance + " en " + avance);
        for(float i = inicio; i <= fin; i+= avance){
            System.out.println(i);
        }
    }
}


