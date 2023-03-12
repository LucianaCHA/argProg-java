/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4ejercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase4Ejercicios {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, sort(5,'D'));
        
    }
   

    public static String sort(int ...optionalParams){
        
        int num1;
        int num2;
        int num3;
        char sortBy;

        boolean sort = false;

        if(CheckCharParam(optionalParams)){
            sortBy = (char) optionalParams[optionalParams.length - 1];
            sort = true;
        }else{
            sortBy = InsertChar();
        }

        if(sort){
            switch(optionalParams.length){
                case 1:
                    num1 = InsertNum();
                    num2 = InsertNum();
                    num3 = InsertNum();
                    break;
                case 2:
                    num1 = optionalParams[0];
                    num2 = InsertNum();
                    num3 = InsertNum();
                    break;
                case 3:
                    num1 = optionalParams[0];
                    num2 = optionalParams[1];
                    num3 = InsertNum();
                    break;
                case 4:
                    num1 = optionalParams[0];
                    num2 = optionalParams[1];
                    num3 = optionalParams[2];
                    break;
                
                default:
                    return "Ocurrió un error, reintente";
            }
        }else{
            int [] completeParams = CompleteParams(optionalParams);
            num1 = completeParams[0];
            num2 = completeParams[1];
            num3 = completeParams[2];
        }

        int[] numeros = {num1, num2, num3};
        for (int i = 0; i < numeros.length; i++){
            
            if(sortBy == 'D'){
                for (int j = 0; j <numeros.length; j++){
                    if (numeros[i] > numeros[j]){
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            } else if(sortBy == 'A'){
                for (int j = 0; j < numeros.length; j++){
                    if (numeros[i] < numeros[j]){
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            }            
        }
    
        return Arrays.toString(numeros);
    }
    
    public static int InsertNum(){
        String input_num = JOptionPane.showInputDialog("Ingrese número");
        return Integer.parseInt(input_num);        
    }

    public static char InsertChar(){
        String input_char = JOptionPane.showInputDialog("Ingrese orden; A(ascendente) / D (descendente)");
        return input_char.charAt(0);
    }    

    public static boolean CheckCharParam(int[] array){
        boolean check = false;
        if (array.length > 0){
            if (array[array.length - 1] == 'A' || array[array.length - 1] == 'D'){
                check = true;
            }
        }
        return check;
    }

    public static int[] CompleteParams(int[] params){
        int[] newParams = new int[3];

        for (int i = 0; i < params.length; i++){
           
            if (params[i] != 'A' || params[i] != 'D'){
                newParams[i] = params[i];
            }
        }

        for (int i = params.length ; i < newParams.length; i++){
            if (newParams[i] == 0){
                newParams[i] = InsertNum();
            }
        }
        return newParams;
    }
};
