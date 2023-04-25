/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioClaseVegetal;

/**
 *
 * @author luciana
 */
public class EjecutaVegetal {
    
    public static void main(String[] args) {
        
        Vegetal1();
        Vegetal2();
                
        
    }
    
    public static void Vegetal1() {
        Vegetal v1 = new Vegetal();
        v1.fruto= "limon";
        v1.cantidad = 23;
        v1.costo = 25;
        v1.cantidad = 12;
        v1.setEstacion("verano");        
        v1.mostrarAtributos();
        v1.costoTotal();
        
    }
    
    public static void Vegetal2(){
        Vegetal v2 = new Vegetal("calabaza", "invierno", 10, 123);
        
        v2.mostrarAtributos();
        v2.costoTotal();
    }
}
