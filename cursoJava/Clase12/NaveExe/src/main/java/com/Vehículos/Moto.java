/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public class Moto extends  VehiculoTerrestre {

  public Moto() {
  }

  public Moto(int cantRuedas, char tipoCombustible, float cantCombustible) {
    super(cantRuedas, tipoCombustible, cantCombustible);
  }

  @Override
  public float velocMaxima() {
    return 280;
  }

  @Override
  public float capacidad_max_carga() {
    return 120;
  }

  public void  mostarCombustibles(){
    System.out.println("Los combustibles disponibles son: ");
    for(String combustible : Potencia.tipo_combustible){
      System.out.println(combustible);
    }

  }
    
}
