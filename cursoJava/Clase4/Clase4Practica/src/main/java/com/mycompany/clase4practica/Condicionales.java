/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4practica;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Condicionales {
    public static void main(String[] args) {
        int asistenciaMes =JOptionPane.showConfirmDialog(null, "Asistió todo el mes?", "", JOptionPane.YES_NO_OPTION);
        
        String input_adicionales= JOptionPane.showInputDialog("Horas trabajadas en domingo");
        int adicionales = Integer.parseInt(input_adicionales);
        
        String input_salario= JOptionPane.showInputDialog("Salario");
        int salario = Integer.parseInt(input_salario);
        
        if(asistenciaMes == JOptionPane.YES_OPTION){
            if( adicionales >= 3 && adicionales <= 5){
                JOptionPane.showMessageDialog(null, " El adicional es del 3%, salario calculado :" + salario * 1.03f);
            }else if( adicionales > 5){
                JOptionPane.showMessageDialog(null, " El adicional es del 10%, salario calculado :" + salario * 1.10f);
            }
        }else{
            if (adicionales >= 3 ){
                JOptionPane.showMessageDialog(null, " El adicional es del 2%, salario calculado :" + salario * 1.02f);
            } 
        }
        

        
        
        
    }
    
    public static void Ejercicio1(){
        String input_num= JOptionPane.showInputDialog("Ingrese un número entero: ");
        int num = Integer.parseInt(input_num);
        
        String input_div= JOptionPane.showInputDialog("Ingrese dvisor: ");
        int divisor = Integer.parseInt(input_div);
        
        if(Divisible(num, divisor)){
            JOptionPane.showMessageDialog(null, num + " es divisible por " + divisor);
        }else{
            JOptionPane.showMessageDialog(null, num + " no es divisible por " + divisor);
        }
    }
    public static boolean Divisible (int number, int divisor){
        return number % divisor == 0;
    }
    
    public static int MaxNum (int num1 , int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
    public static void Ejercicio2(){
        String input_num1= JOptionPane.showInputDialog("Ingrese un número entero: ");
        int num1 = Integer.parseInt(input_num1);
        String input_num2= JOptionPane.showInputDialog("Ingrese un número entero: ");
        int num2 = Integer.parseInt(input_num2);
        
        JOptionPane.showMessageDialog(null, "Entre " + num1+ " y " + num2 + " el mayor es " + MaxNum(num1, num2));
        
    }
    
    public static void Ejercicio3(){
        String input_num1= JOptionPane.showInputDialog("Ingrese un número entero: ");
        int num = Integer.parseInt(input_num1);
        
        if(num % 2 == 0 ){
            System.out.println("Es número par");
        }else{
            System.out.println("Es número impar");
        }
    }
    
    public static void Ejercicio4(){
    String text = JOptionPane.showInputDialog("Ingrese nombre");

        switch (text.toLowerCase()) {
            case "Pi":
                System.out.println("3.1416");                
                break;
            case "e":
                System.out.println("2.7182");
                break;
            case "phi":
                System.out.println("1.6180");
                break;
            case "tau":
                System.out.println("6.2832");
                break;
            case "omega":
                System.out.println("ὦ");
                break;
            case "alpha":
                System.out.println("α");
                break;
            default:
                System.out.println("Símbolo desconocido");;
        }
    }
}
