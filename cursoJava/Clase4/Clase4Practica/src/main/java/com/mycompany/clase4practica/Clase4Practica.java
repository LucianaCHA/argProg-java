/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4practica;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase4Practica {

    public static void main(String[] args) {
        String inputNum = JOptionPane.showInputDialog("Ingrese extensión de lista numérica");
        int valorX = Integer.parseInt(inputNum);
        int[] array = makeArray(valorX);
        
        //JOptionPane.showMessageDialog(null, "El promedio de la lista de números brindada es"+ average(array));
        //JOptionPane.showMessageDialog(null, greaterThanAverage(array));
        JOptionPane.showMessageDialog(null, "La lista original : "+  Arrays.toString(array) +
                "\n la lista invertida: " +Arrays.toString(reverseArray(array)));
        
    }
    
    public static int[] makeArray(int length){        
        int numeros[] = new int[length];        
        int i = 0;
        
        while (i < numeros.length){
            String inputNum = JOptionPane.showInputDialog("Ingrese número: ");
            numeros[i] = Integer.parseInt(inputNum);
            i++;
        }      
        
        return numeros;
    }
    
    public static int average(int[] numArray){
        int suma = 0;
        
        for (int i = 0; i < numArray.length; i++){
            suma += numArray[i];
        }
  
        return  suma / numArray.length;
    }
    
    public static String greaterThanAverage(int[] numarray){
        ArrayList<Integer> greaters = new ArrayList<>();
        int average = average(numarray);
        
        
        for (int i = 0; i < numarray.length; i++ ){
            if(numarray[i] > average){
                greaters.add(numarray[i]);
            }
        }
        
        String listValues = greaters.toString();
        
        return "Para la lista de numeros: \n " 
                + Arrays.toString(numarray) + 
                "\n el promedio es: " + average + ", \n"
                + "los numeros mayores que el promedio son: " + greaters.size() 
                + "\n ( " + listValues + ")." ;
    }
    
    public static int[] reverseArray(int[] array){
        
        int[] reversed = new int[array.length];
        
        for (int i = array.length - 1; i >= 0; i--){
            reversed[(array.length - i - 1)] = array[i];
        }
        
        return reversed;
    }
}
