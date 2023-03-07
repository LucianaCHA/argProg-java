/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase3EjB {
    public static void main(String[] args) {
        int NUMEROS = 3;
        int numeros[] = new int[NUMEROS];

        int contador = 0;
        String sortBy = JOptionPane.showInputDialog("Ingrese orden (Menor a mayor/ Mayor a menor): ");

        while (contador < numeros.length){
            String inputNum = JOptionPane.showInputDialog("Ingrese número: ");
            numeros[contador] = Integer.parseInt(inputNum);
            contador++;            
        }
        
        if("Menor a mayor".equals(sortBy)){
            System.out.println(menorAMayor(numeros));
            
        }else if("Mayor a menor".equals(sortBy)){
            System.out.println(mayorAMenor(numeros));
            
        }else {
            System.out.println("Ordenamiento invalido será ordenado de mayor a menor");
            System.out.println(mayorAMenor(numeros));
        }
    }
    
    public static String menorAMayor(int[] array) {
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[i] < array[j]){
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        
        return "Ordenado de menor a mayor " + Arrays.toString(array);
    }
    
    public static String mayorAMenor(int[] array) {
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[i] > array[j]){
                        int aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }
                }
            }
        
        return "Ordenado de mayor a menor " + Arrays.toString(array);
    }
}