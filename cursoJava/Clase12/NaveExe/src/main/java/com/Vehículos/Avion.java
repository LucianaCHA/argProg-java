/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public class Avion extends VehiculoAereo {

  public Avion() {
  }

  public Avion(char tipoCombustible, float cantCombustible) {
    super(tipoCombustible, cantCombustible);
  }

  @Override
  float alturaVuelo() {
    return 12800;
  }

  @Override
  public float velocMaxima() {
    return 735;
  }

  @Override
  public float capacidad_max_carga() {
    return 1500;
  }
    
}
