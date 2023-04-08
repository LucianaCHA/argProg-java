/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public abstract class Ave implements Capacidad {

    public String tipo;

    public Ave(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public boolean volar(){
        return true;
    }
    
    @Override
    public boolean nadar(){
        return false;
    }
    
    @Override
    public boolean caminar(){
        return true;
    }
    
    abstract void puedeCaminar(Ave ave);
    
    abstract void puedeNadar(Ave ave);
    
    abstract void puedeVolar(Ave ave);
    

    
}
