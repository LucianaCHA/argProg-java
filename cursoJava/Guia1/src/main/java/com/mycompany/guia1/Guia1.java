/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Guia1 {  


    public static void main(String[] args) {
        System.out.println("Por favor, ingrese dos números enteros: ");

        String input_num_a = JOptionPane.showInputDialog("Número 1: ");
        int num_a = Integer.parseInt(input_num_a);

        String input_num_b = JOptionPane.showInputDialog("Número 2: ");
        int num_b = Integer.parseInt(input_num_b);
        
        imprimir_pares_reverse(num_a,num_b);        
        
        //elegir_par_impar(num_a,num_b);
        // imprimir_todos(num_a,num_b);
        //imprimir_pares(num_a,num_b);
        
        
    }
    // ejercicio 1a imprimir todos los nmeros entre a y b 
    public static void imprimir_todos(int num_a, int num_b) {
        int inicio = Math.min(num_b, num_a);
        int fin = Math.max(num_b, num_a);
        
        while (inicio <= fin){
            System.out.println(inicio);
            inicio++;
        } 
    }
    
        // ejercicio 1b imprimir todos los números pares entre a y b 
    public static void imprimir_pares(int num_a, int num_b) {
        int inicio = Math.min(num_b, num_a);
        int fin = Math.max(num_b, num_a);
        
        while (inicio <= fin){
            if(inicio % 2 == 0){
                System.out.println(inicio);
            }            
            inicio++;
        }      
    }
    
    public static void imprimir_impares(int num_a, int num_b) {
        int inicio = Math.min(num_b, num_a);
        int fin = Math.max(num_b, num_a);
        
        while (inicio <= fin){
            if(inicio % 2 != 0){
                System.out.println(inicio);
            }            
            inicio++;
        }  
    
    }
    
    public static void elegir_par_impar(int num_a, int num_b) {
        
        String paridad = JOptionPane.showInputDialog("Para imprimir impares ingrese 1, pares 2 ");
        
        if("1".equals(paridad)){
            imprimir_impares(num_a,num_b);
        }else{
            imprimir_pares(num_a,num_b);
        }
    }
    
    public static void imprimir_pares_reverse(int num_a, int num_b){
        
        int inicio = Math.min(num_b, num_a);
        int fin = Math.max(num_b, num_a);
        
        for(int i = fin; i >= inicio; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }            
        }        
    }
}
