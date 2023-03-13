/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author luciana
 */
public class NewClass {

    public static void main(String[] args) {

      int a = 1, b = 5, c = 8; 
      float h= 9f, i=7.3f, j=3.55f; 
      String x = "abc", y = "xyz", z = "7"; 
      char r = 't';

      multiplicar(b , (x+y) ,String.valueOf( j+(int)r ));

    }
    public static char multiplicar(int a, float b, String c) {
      
      return c.charAt(0);
    }

}
