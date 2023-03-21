/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

/**
 *
 * @author luciana
 */
public class DescuentoPorcentajeConTope {

  float TOPE = 2500;
  float descuento;

  public float aplicaDescuentoConTope(float importeBruto){
      float descuentoFinal = (descuento/100)* importeBruto;
      if(descuentoFinal > TOPE){
          return importeBruto - TOPE;
      }else{
          return importeBruto - descuentoFinal;
      }
  }    
}
