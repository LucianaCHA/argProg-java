/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

/**
 *
 * @author luciana
 */
public class Empresa {

  public String rSocial;
  public Trabajador[] empleados;

  public Empresa() {
  }

  public Empresa(String rSocial) {
    this.rSocial = rSocial;
  }

  public Empresa(String rSocial, Trabajador[] empleados) {
    this.rSocial = rSocial;
    this.empleados = empleados;
  }


    
}
