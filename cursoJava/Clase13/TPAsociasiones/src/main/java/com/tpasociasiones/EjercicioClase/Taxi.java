/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones.EjercicioClase;

/**
 *
 * @author luciana
 */
public class Taxi {

  private String patente;

  public Taxi() {
  }

  public Taxi(String patente) {
    this.patente = patente;
  }

  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public void printPatente() {
    System.out.println("Patente: " + patente);
  }
}
