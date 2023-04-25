/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naveexe;

/**
 *
 * @author luciana
 */
public  class AvionCarga extends Nave{
    private float cantMaxKG;
    
    public AvionCarga(String tipo) {
        super(tipo);
    }

    public AvionCarga( String tipo, float cantMaxKG) {
        super(tipo);
        this.cantMaxKG = cantMaxKG;
    }
    
    public AvionCarga( String tipo, String tipoCombustible, float capacidadCombustible, float cantMaxKG) {
        super(tipo);
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible = capacidadCombustible;
        this.cantMaxKG = cantMaxKG;
    }
    
    public void setCantMaxKG(float carga){
        this.cantMaxKG = carga;
    }
    
    public float getCantMaxKG(){
        return this.cantMaxKG;
    }
}
