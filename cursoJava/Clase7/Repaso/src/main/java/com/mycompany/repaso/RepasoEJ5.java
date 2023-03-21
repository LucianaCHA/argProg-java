/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class RepasoEJ5 {
    public static void main(String[] args) {
        
    mostrarListaCombinada(crearListaNombres(5),crearListaEdad(5) );
        
              
    }
    
    public static String [] crearListaNombres(int longitud){
            int LONG = longitud;
            String nombres[] = new String [LONG];

            int contador = 0;
            
            while (contador < nombres.length){
                String inputNombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                if(inputNombre.length() > 0){
                    nombres[contador] = inputNombre;
                    contador++;     
                }else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
                }
            }
            return nombres;
        }        
    
    public static int [] crearListaEdad(int longitud){
        int NUMEROS = longitud;
        int edades[] = new int[NUMEROS];

        int contador = 0;
            
        while (contador < edades.length){
            int edad_valida = pedirEntero("Ingrese número: ");
            edades[contador] = edad_valida;
            contador++;            
            }
        return edades;
    }

    public static int pedirEntero(String message){
        String input = JOptionPane.showInputDialog(message);
        
        try {
            int input_num = Integer.parseInt(input);
            
            if(input_num > 0){
                return input_num;
            }else{
                JOptionPane.showMessageDialog(null, "No es un valor válido, reingrese");
                return pedirEntero(message);
            }
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "No es un valor válido, reingrese");
            return pedirEntero(message);
        }
    }
    
    public static void mostrarListaCombinada(String [] nombres, int [] edades){
        
        int i = 0;
        
        while (i < nombres.length){
            JOptionPane.showMessageDialog(null, "Persona " + (i + 1)
                    + " nombre: " + nombres[i] + 
                    ", edad : " + edades[i]);
            i++;
        }  
    }
}
