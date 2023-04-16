/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones.ejemploClase;

/**
 *
 * @author luciana
 */
public class B {
  public String texto;

  //constructor vacio
  public B() {
  }

  //constructor con texto
  public B(String texto) {
    this.texto = texto;
  }
   
  public void attribB() {
    System.out.println("Atributos de B:");
    System.out.println("texto: " + this.texto);
  }

}
