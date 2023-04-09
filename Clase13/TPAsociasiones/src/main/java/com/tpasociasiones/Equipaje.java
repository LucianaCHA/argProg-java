/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

/**
 *
 * @author luciana
 */
public class Equipaje {
    private int peso;
    private String tipo;

    public Equipaje() {
    }
    
    
    public Equipaje(int peso, String tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    public int getPeso() {
        if (this == null){
            return 0;
        }
        return peso;
    }

    public void setPeso(int peso) {
        
        this.peso = peso;
    }

    public String getTipo() {
        if (this == null){
            return "tipo no definido";
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    
    
    
}
