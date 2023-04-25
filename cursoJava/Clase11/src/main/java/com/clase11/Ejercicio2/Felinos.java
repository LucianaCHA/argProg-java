/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public class Felinos extends Mamifero {

    public Felinos(String tipo){
        super(tipo);
    }

    public String especie;
    public String habitat;

    public Felinos(String tipo, String especie, String habitat){
        super(tipo);
        this.especie = especie;
        this.habitat = habitat;
    }

    
    @Override
    public void puedeCaminar(Mamifero m){
      if(m.caminar()){
        System.out.println(m.tipo + " es un felino. Su especie es " + this.especie + " y su habitat es " + this.habitat + " y puede caminar");
      }else{
        System.out.println(m.tipo + " es un felino. Su especie es " + this.especie + " y su habitat es " + this.habitat + " y no puede caminar");
      }
    }
    
    @Override
    public void puedeNadar(Mamifero m){
      if(m.nadar()){
        System.out.println(m.tipo + " es un felino. Su especie es " + this.especie + " y su habitat es " + this.habitat + " y puede nadar");
      }else{
        System.out.println(m.tipo + " es un felino. Su habitat es " + this.habitat + " y no puede nadar");
      }
    }
    
    @Override
    public void puedeVolar(Mamifero m){
      if(m.volar()){
        System.out.println(m.tipo + " es un felino. Su especie es " + this.especie + " y su habitat es " + this.habitat + " y puede volar");
      }else{
        System.out.println(m.tipo + " es un felino. Su especie es " + this.especie + " y su habitat es " + this.habitat + " y no puede volar");
      }
    }
    
}
