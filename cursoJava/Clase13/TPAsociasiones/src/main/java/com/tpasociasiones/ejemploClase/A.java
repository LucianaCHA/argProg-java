/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones.ejemploClase;

/**
 *
 * @author luciana
 */
public class A {
  public int num;
  // public B b; // aca es una asociacion de 1 a 1
  public B[] b = new B[5]; // aca es una asociacion de 1 a muchos

  //constructor vacio

  public A() {
  }

  //constructor con num
  public A(int num) {
    this.num = num;
  }
   
  //constructor con b
  public A(B b[]) {
    this.b = b;
  }

  //constructor con num y b
  public A(int num, B b[]) {
    this.num = num;
    this.b = b;
  }

  public void attribA() {
    System.out.println("Atributos de A:");
    System.out.println("num: " + num);
    System.out.println("Objetos: ");
    for (int i = 0; i < b.length; i++) {
      System.out.println("texto: " + b[i].texto);

     
    }
  }
}
