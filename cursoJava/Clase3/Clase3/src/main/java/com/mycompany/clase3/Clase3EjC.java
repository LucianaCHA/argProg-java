/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase3EjC {
    public static void main(String[] args) {

        String inputNum = JOptionPane.showInputDialog("Ingrese extensión de lista numérica");
        String inputX = JOptionPane.showInputDialog("Ingrese X");
        
        int valorX = Integer.parseInt(inputX);
        int [] lista = crearArregloNumeros(Integer.parseInt(inputNum));
        
        System.out.println("La suma de los valores mayores a " + valorX + " es igual a: " + sumarMayores(lista, valorX));
        
    }    
        public static int sumarMayores(int[] array, int number) {
            int suma = 0;
            for (int i = 0; i < array.length; i++){               
                if( array[i] > number){
                    suma += number;                    
                }
            }
            return suma;
    }
        public static int [] crearArregloNumeros(int longitud){
            int NUMEROS = longitud;
            int numeros[] = new int[NUMEROS];

            int contador = 0;
            
            while (contador < numeros.length){
                String inputNum = JOptionPane.showInputDialog("Ingrese número: ");
                numeros[contador] = Integer.parseInt(inputNum);
                contador++;            
            }
            return numeros;
        }
}
