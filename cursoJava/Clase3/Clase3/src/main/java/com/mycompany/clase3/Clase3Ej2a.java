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
public class Clase3Ej2a {
    public static void main(String[] args) {
        
        
        
        System.out.println(Codificar());
        
        System.out.println(Decodificar());
    }
    
    public static String Codificar(){
        
        String inputText = JOptionPane.showInputDialog("Ingrese texto a cifrar: ").toLowerCase();
        String inputNum = JOptionPane.showInputDialog("Ingrese clave: ");
        
        int paso = Integer.parseInt(inputNum);
        
        String codificado = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < inputText.length(); i++){
            int posicion = alpha.indexOf(inputText.charAt(i)); 
//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.

// lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.

//The charAt() method returns the character at the specified index in a string. 
            int key= (paso + posicion ) % 26;
            codificado += alpha.charAt(key);
            
        }
            
        return "El texto codificado es: "+ codificado;
    }
    
    public static String Decodificar(){
        String inputText = JOptionPane.showInputDialog("Ingrese texto cifrado: ").toLowerCase();
        String inputNum = JOptionPane.showInputDialog("Ingrese clave: ");
        
        int paso = Integer.parseInt(inputNum);
        
        String codificado = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < inputText.length(); i++){
            int posicion = alpha.indexOf(inputText.charAt(i)); 
            int key= (posicion - paso ) % 26;
            
            if(key < 0){
                key = alpha.length() + key;
            }
            codificado += alpha.charAt(key);
            
        }
            
        return "El texto es: "+ codificado;
    }
}
