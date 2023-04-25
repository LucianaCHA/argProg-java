/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        String option = JOptionPane.showInputDialog("Ingrese una opción: \n 1. Codificar \n 2. Decodificar");

        switch (option){
            case "1":
                Codificar();
                break;
            case "2":
                Decodificar();
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }

    public static String getTexto(String ruta) throws Exception {

        InputStream file = new FileInputStream(ruta);

        try(Scanner obj = new Scanner(file)){                
                String texto = "";
    
                while(obj.hasNextLine()){    
                    texto += obj.nextLine();    
                }
    
                return texto;
        }

    }

    public static  String saveTextToFile(String texto, String ruta) throws Exception {

        // Creo un objeto de tipo OutputStream para escribir el archivo y lanzo una excepción si no se puede escribir 

        OutputStream file = new FileOutputStream(ruta);

        //Scanner permite leer el archivo linea por linea

        try (PrintWriter obj = new PrintWriter(file)) {
            obj.println(texto);
            return "El archivo se guardo correctamente";
        }
        
    }

    public static void Codificar() throws Exception {
        String fileToCode = JOptionPane.showInputDialog("Ingrese archivo a codificar. ");
        String inputText ="";

        String fileCoded = JOptionPane.showInputDialog("Ingrese archivo donde guardar el texto codificado. ");
        
        String inputNum = JOptionPane.showInputDialog("Ingrese paso: ");
        int key = Integer.parseInt(inputNum);

        try {
            inputText = getTexto(fileToCode).toLowerCase();
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }              
        
        String coded = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz ";
        
        for (int i = 0; i < inputText.length(); i++){
            int position = alpha.indexOf(inputText.charAt(i)); 
            int keyValue= (key + position ) % 27;
            coded += alpha.charAt(keyValue);            
        }
        
        System.out.println(saveTextToFile(coded, fileCoded));
    }
    
    public static void Decodificar() throws Exception {
        String fileToDecode = JOptionPane.showInputDialog("Ingrese archivo a codificar. ");
        String inputText ="";
        
        String fileDecoded = JOptionPane.showInputDialog("Ingrese archivo donde guardar el texto codificado. ");
        
        String inputNum = JOptionPane.showInputDialog("Ingrese paso: ");
        int key = Integer.parseInt(inputNum);
        
        String coded = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz ";

        try {
            inputText = getTexto(fileToDecode).toLowerCase();
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }
        
        for (int i = 0; i < inputText.length(); i++){
            int position = alpha.indexOf(inputText.charAt(i)); 
            int keyValue= (position - key ) % 27;
            
            if(keyValue < 0){
                keyValue = alpha.length() + keyValue;
            }
            coded += alpha.charAt(keyValue);
            
        }
        
        System.out.println(saveTextToFile(coded, fileDecoded));
    }
    
}
