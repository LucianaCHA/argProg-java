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
        int[] array = makeArray(10);
        
        //JOptionPane.showMessageDialog(null, "El promedio de la lista de números brindada es"+ average(array));
        JOptionPane.showMessageDialog(null, greaterThanAverage(array));
        
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
    
}
