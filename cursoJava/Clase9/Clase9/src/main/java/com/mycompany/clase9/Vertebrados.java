/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author luciana
 */
public abstract class Vertebrados extends Animal {
  
    public boolean mamifero;

    public Vertebrados(){
    }

    public Vertebrados(String color, int edad, boolean mamifero, int patas) {
        super(color, edad, patas);
        this.mamifero = mamifero;
        this.patas = patas;
    }    
}
