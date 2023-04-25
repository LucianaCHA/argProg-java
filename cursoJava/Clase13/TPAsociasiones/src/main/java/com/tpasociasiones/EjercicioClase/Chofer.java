/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones.EjercicioClase;

import java.time.LocalDate;

/**
 *
 * @author luciana
 */
public class Chofer {
  private String nombre;
  private LocalDate fechaVencimientoLicencia;
  public Taxi[] conduceTaxi = new Taxi[3];

  public Chofer() {
  }

  public Chofer(String nombre, LocalDate fechaVencimientoLicencia) {
    this.nombre = nombre;
    this.fechaVencimientoLicencia = fechaVencimientoLicencia;
  }

  public Chofer(String nombre,LocalDate fechaVencimientoLicencia, Taxi[] conduceTaxi) {
    this.nombre = nombre;
    this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    this.conduceTaxi = conduceTaxi;
  }
   
  
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFechaVencimientoLicencia() {
    return fechaVencimientoLicencia;
  }

  public void setFechaVencimientoLicencia(LocalDate fechaVencimientoLicencia) {
    this.fechaVencimientoLicencia = fechaVencimientoLicencia;
  }

  private int vencimientoLic(LocalDate fechaHoy){

    int diferencia = fechaHoy.compareTo(fechaVencimientoLicencia);
    return diferencia;
  }

  public void atributosChofer() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Conduce: ");
    for (int i = 0; i < conduceTaxi.length; i++) {
      System.out.println("Patente: " + conduceTaxi[i].getPatente());
    }
  }

}
