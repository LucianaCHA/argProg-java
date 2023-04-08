/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
abstract  class VehiculoAereo extends Vehiculo {

  public VehiculoAereo() {
  }

  public VehiculoAereo(char tipoCombustible, float cantCombustible) {
    super(tipoCombustible, cantCombustible);
  }

  abstract float alturaVuelo();

    
}
