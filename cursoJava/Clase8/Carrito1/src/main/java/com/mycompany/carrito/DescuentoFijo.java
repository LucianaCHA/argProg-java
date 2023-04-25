/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

/**
 *
 * @author luciana
 */
public class DescuentoFijo  {
  float descuento;
  float total;
    
  public float aplicaDescuentoFijo(float importeBruto) throws Exception {
    total = importeBruto - descuento;
    
    if(importeBruto <= 0){
      throw new Exception();
    }

    if(total < 0){
      throw new Exception();
    }

    return total;
  }
  
  public DescuentoFijo(int des){
      this.descuento = des;
  }
    
}
