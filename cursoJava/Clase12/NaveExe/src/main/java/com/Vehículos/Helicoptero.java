/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public class Helicoptero extends VehiculoAereo {

  public Helicoptero() {
  }

  public Helicoptero(char tipoCombustible, float cantCombustible) {
    super(tipoCombustible, cantCombustible);
  }

  @Override
  float alturaVuelo() {
    return 8000;
  }

  @Override
  public float velocMaxima() {
    return 310;
  }

  @Override
  public float capacidad_max_carga() {
    return 7000;
  }

    
}
