/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naveexe;

/**
 *
 * @author luciana
 */
public abstract class Nave {
    
    public String tipoNave;
    public String tipoCombustible;
    public float capacidadCombustible;
    
    
    public Nave(String tipoNave){
        this.tipoNave = tipoNave;
    }
    
    public Nave(String tipoNave, String tipoCombustible, float capacidadCombustible){
        this.tipoNave = tipoNave;
        this.tipoCombustible = tipoCombustible;
        this.capacidadCombustible= capacidadCombustible;
    }
    
    public float rendimientoCombustible(){
        return this.capacidadCombustible * 100;
    }
    
    
}
