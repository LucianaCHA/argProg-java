/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public interface Potencia {

  String tipo_combustible[] = {
    "nafta super",
    "nafta +octanaje",
    "diesel",
    "gnc",
    "ultra diesel",
    "queroseno"
  };

  char tipo_combustible_char[] = {'N', 'O', 'D', 'G', 'U', 'Q'};

  float capacidad_max_carga();
    
}
