/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

/**
 *
 * @author luciana
 */
public class Producto {
  String nombre;
  float precio_unitario;
  int codigo;

  public float costoFinal(float interes){
    float porcentaje_interes = interes / 100;

      return precio_unitario + (precio_unitario * porcentaje_interes);
  }

  public Producto(String nombre, float precio_unitario, int codigo) {
      this.nombre = nombre;
      this.precio_unitario = precio_unitario;
      this.codigo = codigo;

  }
}
