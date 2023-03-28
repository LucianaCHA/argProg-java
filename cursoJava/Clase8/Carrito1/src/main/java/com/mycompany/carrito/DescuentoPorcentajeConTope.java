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
    float descuentoFinal;

  public float aplicaDescuentoConTope(float importeBruto, float descuento)throws Exception{
        descuentoFinal = (descuento/100)* importeBruto;
        System.out.println("Descuento" + descuento+ "importe bruto" + importeBruto + "descuentoFinal" + descuentoFinal);

        if(importeBruto <= 0){
            throw new Exception();
        }

        if(importeBruto - descuentoFinal < 0){
            throw new Exception();
        }

        if(descuentoFinal < TOPE){
        System.err.println("Descuento menor a tope" + descuentoFinal);
            return importeBruto - descuentoFinal;
        }else{
            return importeBruto - TOPE;
      }
  }    
}
