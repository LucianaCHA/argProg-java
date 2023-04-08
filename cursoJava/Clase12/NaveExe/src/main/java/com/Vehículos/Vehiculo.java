/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public abstract  class Vehiculo implements Potencia {
  public char tipoCombustible;
	public float cantCombustible;

	public Vehiculo() {
	}

	public Vehiculo(char tipoCombustible, float cantCombustible) {
		this.tipoCombustible = tipoCombustible;
		this.cantCombustible = cantCombustible;
	}

	public String getTipoCombustible() {
		// mostarr el tipo de combustible en letras
		for (int i = 0; i < tipo_combustible_char.length; i++) {
			if (tipoCombustible == tipo_combustible_char[i]) {
				return tipo_combustible[i];
			}
		}
		return "no existe el tipo de combustible" ;
	}



	public abstract float velocMaxima();
        
    
}
