/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

/**
 *
 * @author luciana
 */
public class Descuento {
    
    float descuento;
    
    public float aplicaDescuento(float importeBruto){
        return importeBruto - (descuento/100)* importeBruto;
    }
    
    public Descuento(float des){
        this.descuento = des;
    }
    
}
