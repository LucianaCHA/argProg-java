/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author luciana
 */
public class Caballo extends Vertebrados {
    public String raza;
    public boolean  es_macho;

    public Caballo(String color, int edad, boolean mamifero, int patas, String raza, boolean es_macho) {
        super(color, edad, mamifero, patas); // super referencia a la clase padre
        this.raza = raza;
        this.es_macho = es_macho;
    }

    @Override
    public void comer() {
        System.out.println("El caballo come pasto");
    }

    @Override
    public void darClase() {
        System.out.println("Es la clase de caballos");
    }

    public void mostrarAtributos(){
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
        System.out.println("Mamifero: " + mamifero);
        System.out.println("Patas: " + patas);
        System.out.println("Raza: " + raza);
        System.out.println("Es macho: " + es_macho);
    }
    
}
