/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author luciana
 */
public class EjecutaInvertebrado {
    //(String color, int edad, int patas, boolean vuela, String especie)
    public static void main(String[] args) {
        Invertebrado hormiga = new Invertebrado("negro", 3, 6, false, "hormiga negra? ");
        
        hormiga.mostrarAtributos();
        hormiga.comer();
        hormiga.darClase();
    }
    
}
