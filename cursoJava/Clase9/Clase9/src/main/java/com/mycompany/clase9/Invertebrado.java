/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author luciana
 */
public class Invertebrado extends Animal {
    public boolean vuela;
    public String especie;
    
    public Invertebrado(){
        super();
    }

    public Invertebrado(String color, int edad, int patas, boolean vuela, String especie) {
        super(color, edad, patas);
        this.vuela = vuela;
        this.especie = especie;
    }
    
    @Override
    public void comer(){
        System.out.println("El invertebrado come otros invertebrados ");
    }
    @Override
    public void darClase(){
        System.out.println("Es la clase de invertebrados");
    }
    
    public void mostrarAtributos(){
        System.out.println("color: "+ color);
        System.out.println("Edad: " + edad );
        System.out.println("Nro de patas:" + patas);
        System.out.println("VUela? : "+ vuela);
        System.out.println("Especie: "+ especie);
    }
    
    
    
}
