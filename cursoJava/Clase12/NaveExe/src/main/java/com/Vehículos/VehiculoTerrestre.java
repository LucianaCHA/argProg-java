/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
abstract  class VehiculoTerrestre extends Vehiculo {

  int cantRuedas;

  public VehiculoTerrestre() {
  }

  public VehiculoTerrestre(int cantRuedas, char tipoCombustible, float cantCombustible) {
    super(tipoCombustible, cantCombustible);
    this.cantRuedas = cantRuedas;
  }
    
}
