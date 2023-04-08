/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public class  NoVoladoras extends Ave {

  public String familia;
  public String nombre;

  public NoVoladoras(String tipo){
    super(tipo);
  }

  public NoVoladoras(String tipo, String familia, String nombre) {
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
    System.out.println("La ave " + ave.tipo + " no puede volar");
  }



}
