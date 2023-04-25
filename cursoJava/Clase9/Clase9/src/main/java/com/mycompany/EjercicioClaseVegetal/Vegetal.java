/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioClaseVegetal;

/**
 *
 * @author luciana
 */
public class Vegetal {

  public String fruto;
  private String estacion;
  protected int cantidad;
  public int costo;

  public Vegetal() {
  }

  public Vegetal(String fruto, String estacion, int cantidad, int costo) {
    this.fruto = fruto;
    this.estacion = estacion;
    this.cantidad = cantidad;
    this.costo = costo;
  }


  public String getEstacion() {
    return estacion;
  }

  public void setEstacion(String estacion) {
    this.estacion = estacion;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
  public void mostrarAtributos(){
      System.out.println("Fruto: "+ fruto);
      System.out.println("Estación: "+ estacion);
      System.out.println("Cantidad: "+ cantidad);
      System.out.println("Costo: "+ costo);
  }
  
  public void costoTotal(){
      int costoTotal = costo*cantidad;
      
      System.out.println("Total a pagar= "+ costoTotal);
  }


    
}
