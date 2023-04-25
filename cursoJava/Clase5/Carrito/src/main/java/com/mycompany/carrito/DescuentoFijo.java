/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

/**
 *
 * @author luciana
 */
public class DescuentoFijo {
  float descuento;
    
  public float aplicaDescuentoFijo(float importeBruto){
      return importeBruto - descuento;
  }
  
  public DescuentoFijo(int des){
      this.descuento = des;
  }
    
}
