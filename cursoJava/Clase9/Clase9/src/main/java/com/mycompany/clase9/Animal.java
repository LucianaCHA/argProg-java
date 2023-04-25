/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author luciana
 */
public abstract  class Animal {

  public String color;
  public int edad;
  public int patas;

 
  public Animal(String color, int edad, int patas) {
    this.color = color;
    this.edad = edad;
    this.patas = patas;
  }
  
   public Animal() {
  }

   
  public abstract void comer();
  public abstract void darClase();
}
