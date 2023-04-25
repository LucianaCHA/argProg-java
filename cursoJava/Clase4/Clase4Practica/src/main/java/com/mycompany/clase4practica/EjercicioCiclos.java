/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4practica;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class EjercicioCiclos {
    
    public static void main(String[] args) {
        //ej1) mostrarTabla();    
        // eej2 JOptionPane.showMessageDialog(null, filterPairs(numbers));
        int [] numbers = makeArray(20);        
        JOptionPane.showMessageDialog(null, positiveNegativeZero(numbers));
    }
    
    
    public static void mostrarTabla(){
        String input_num= JOptionPane.showInputDialog("Ingrese un número entero: ");
        
        int num = Integer.parseInt(input_num);
        
        int i = 0;
        
        while(i <= 10){
            System.out.println(i + " x " + num + "= " + i*num);
            i++;
        }
    }
    
    
    public static String filterPairs(int[] numberList){
        ArrayList<Integer> evens = new ArrayList<>();
        
        for(int i = 0; i < numberList.length; i++){
            if( numberList[i] % 2 == 0){
                evens.add(numberList[i]);
            }
        }
        
        return evens.toString();  
    
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
    
    public static String positiveNegativeZero(int[] numberList){
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        
        for (int i = 0; i < numberList.length; i++){
            if(numberList[i] == 0){
                zeros++;
            }else if(numberList[i] > 0){
                positives++;
            }else{
                negatives++;
            }
        }        
        
        return "Números provistos: " + Arrays.toString(numberList) +
                "\n de los cuales "+ negatives + " son negativos, " + positives +
                " positivos y " + zeros + " son neutros.";
    }
}
