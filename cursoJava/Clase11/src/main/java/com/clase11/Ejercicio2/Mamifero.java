/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public abstract class Mamifero implements Capacidad {

    public String tipo;

    public Mamifero(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public boolean volar(){
        return false;
    }
    
    @Override
    public boolean nadar(){
        return false;
    }
    
    @Override
    public boolean caminar(){
        return true;
    }
    
    abstract void puedeCaminar(Mamifero m);
    
    abstract void puedeNadar(Mamifero m);
    
    abstract void puedeVolar(Mamifero m);
    

    
}
