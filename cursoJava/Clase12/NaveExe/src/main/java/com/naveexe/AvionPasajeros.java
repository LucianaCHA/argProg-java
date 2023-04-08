/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naveexe;

/**
 *
 * @author luciana
 */
public class AvionPasajeros extends Nave {
    private int cantMaxPax;
    
    public AvionPasajeros(String tipo) {
        super(tipo);
    }

    public AvionPasajeros( String tipo, String tipoCombustible, float capacidadCombustible, int cantMaxPax) {
        super(tipo);
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible = capacidadCombustible;
        this.cantMaxPax = cantMaxPax;
    }
    
    public void setCantMaxPax(int pax){
        this.cantMaxPax = pax;
    }
    
    public int getCantMaxPax(){
        return this.cantMaxPax;
    }
    
}
