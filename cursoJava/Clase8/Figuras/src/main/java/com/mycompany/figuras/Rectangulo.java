/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author luciana
 */
 public class Rectangulo{
        float  base;
        float altura;
        String color;
     //a   
    public void mostrarTodos(){
        System.out.println("datos " + base  + "  " + altura +" "+ color);
    }
        
    public Rectangulo(){
        
    }
    
    public Rectangulo(float base, float altura, String color){
        this.base = base;
        this.altura= altura;
        this.color=color;
    }
        
 }
