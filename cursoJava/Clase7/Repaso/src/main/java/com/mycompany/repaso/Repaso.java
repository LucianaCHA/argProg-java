/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso;

import javax.swing.JOptionPane;
/**
 *
 * @author luciana
 */
public class Repaso {

    public static void main(String[] args) {
        String input_num1 = JOptionPane.showInputDialog("Ingrese un número");
        double num1 = Double.parseDouble(input_num1);
        
        String input_num2 = JOptionPane.showInputDialog("Ingrese un número");
        double num2 = Double.parseDouble(input_num2);
        
        System.out.println(checkValues(num1, num2));        
    }
    
    public static double checkValues (double unNumero, double otroNumero){
        
        if(unNumero == otroNumero){
           return  multiplicar(unNumero, otroNumero);        
        }else if (unNumero > otroNumero){
            return restar(unNumero, otroNumero);
        }else{
            return sumar(unNumero, otroNumero);
        }        
    }
    
    public static double multiplicar(double unNumero, double otroNumero){
        return unNumero * otroNumero;
    }
    
    public static double restar(double unNumero, double otroNumero){
        return unNumero - otroNumero;
    }
    public static double sumar(double unNumero, double otroNumero){
        return unNumero + otroNumero;
    }
}
