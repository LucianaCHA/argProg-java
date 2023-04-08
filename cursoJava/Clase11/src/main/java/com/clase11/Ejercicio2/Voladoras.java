/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public class  Voladoras extends Ave {

  public Voladoras(String tipo){
    super(tipo);
  }

  public String familia;
  public String nombre;

  public Voladoras(String tipo, String familia, String nombre) {
    super(tipo);
    this.familia = familia;
    this.nombre = nombre;
  }
  

  @Override
  public void puedeCaminar(Ave ave) {
    System.out.println("La ave " + ave.tipo + " puede caminar");
  }

  @Override
  public void puedeNadar(Ave ave) {
    System.out.println("La ave " + ave.tipo + " puede nadar");
  }

  @Override
  public void puedeVolar(Ave ave) {
    System.out.println("La ave " + ave.tipo + " puede volar");
  }

  

}
