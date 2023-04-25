/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public class Coche extends VehiculoTerrestre {


    public Coche() {
    }

    public Coche(int cantRuedas, char tipoCombustible, float cantCombustible) {
        super(cantRuedas, tipoCombustible, cantCombustible);
    }

    @Override
    public float velocMaxima() {
        return 250;
    }

    @Override
    public float capacidad_max_carga() {
        return 700;
    }
    
}
