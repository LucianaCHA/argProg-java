package com.mycompany.guia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luciana
 */

import javax.swing.JOptionPane;

public class Guia1Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Por favor, responda las siguientes preguntas considerando para ello a todos los integrantes del grupo familiar: ");
        
        if(ingresos()||
                vehiculos()||
                inmuebles()||
                suntuosos()){
            System.out.println("Pertenece al segmento de ingresos altos");            
        }else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }
    }
    
    public static boolean ingresos(){
        String input = JOptionPane.showInputDialog("¿Cuáles son los ingresos mensuales totales del hogar?");
        int value = Integer.parseInt(input);
        
        return value >= 489083;        
    }
    
    public static boolean vehiculos(){
        String input = JOptionPane.showInputDialog("¿Cantidad de vehículos con antiguedad menor a 5 años?");
        int value = Integer.parseInt(input);
        
        return value >= 3;          
    }
        
    public static boolean inmuebles(){
        String input = JOptionPane.showInputDialog("¿Número de inmuebles?");
        int value = Integer.parseInt(input);
        
        return value >= 3;          
    }
    
    public static boolean suntuosos(){
            String input_suntuosos = JOptionPane.showInputDialog("Posee al menos uno de los siguientes items?: \n - embarcación, \n -aeronave "
                    + "de lujo, \n titularidad de activos societarios que demuestren capacidad económica plena \n (Ingrese SI/NO)");
            
            return "SI".equals(input_suntuosos.toUpperCase());            
        }
}
