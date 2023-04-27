/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

/**
 *
 * @author luciana
 */
public class Trabajador {

  private int dni;
  private Empresa empleador;

  public Trabajador() {
  }

  public Trabajador(int dni) {
    this.dni = dni;
  }

  public Trabajador(int dni, Empresa empleador) {
    this.dni = dni;
    this.empleador = empleador;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public Empresa getEmpleador() {
    return empleador;
  }

  public void setEmpleador(Empresa empleador) {
    this.empleador = empleador;
  }

  
    
}
