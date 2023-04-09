/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones.ejemploClase;

/**
 *
 * @author luciana
 */
public class ejecutable {

  public static void main(String[] args) {
    B b = new B("hola");
    A a = new A(1);

    a.b[0] = b;
    a.b[1] = new B("chau");
    a.b[2] = new B("hola2");
    a.b[3] = new B("chau2");
    a.b[4] = new B();
    a.attribA();
    b.attribB();
  }
    
}
