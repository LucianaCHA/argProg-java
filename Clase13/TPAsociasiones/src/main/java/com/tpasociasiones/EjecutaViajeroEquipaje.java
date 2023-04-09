/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

/**
 *
 * @author luciana
 */
public class EjecutaViajeroEquipaje {
    
    public static void main(String[] args) {
        //viajero sin equipaje
        Viajero viajero1 = new Viajero();
        viajero1.setNombre("Pedro");
        viajero1.setSexo("M");
        showViajero(viajero1);
        
        
        Viajero viajero2 = new Viajero ("Paula ", "F");
        Equipaje bolsoMano = new Equipaje(10, "bolso de mano");

        viajero2.guarda.add(bolsoMano);
        showViajero(viajero2);
        
        Viajero viajero3 = new Viajero("Rolando", "M");
        Equipaje mochila = new Equipaje(5, "bolso de mano");
        Equipaje maleta = new Equipaje(25, "valija");
        Equipaje bolsoMano2 = new Equipaje(10, "bolso de mano");
        

        viajero3.guarda.add(mochila);
        viajero3.guarda.add(maleta);
        viajero3.guarda.add(bolsoMano2);
        showViajero(viajero3);
        
        
    }
    
    public static void showViajero(Viajero dataViajero){
        
        System.out.println("Nombre del viajero: "+ dataViajero.getNombre());
        System.out.println("Género del viajero: "+ dataViajero.getSexo());
        System.out.print("Equipaje del viajero(tipo/peso): ");
        
        if(!dataViajero.guarda.isEmpty()){
            for(Equipaje eq: dataViajero.guarda){
                System.out.println(eq.getTipo().trim()
                        + "/" + eq.getPeso() +" kilos");    
            }
            
        }else{
            System.out.println("El viajero no lleva equipaje.");
        }
    }
    
}
