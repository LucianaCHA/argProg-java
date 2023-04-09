/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

/**
 *
 * @author luciana
 */
public class EjecutaTrabajadorEmpresa {

  public static void main(String[] args) {
    
    Empresa impares = new Empresa("Empresa impares");
    Empresa pares = new Empresa("Empresa pares");
    
    Trabajador trabajador1 = new Trabajador(111111);
    Trabajador trabajador2 = new Trabajador(222222);

    Trabajador trabajador3 = new Trabajador(333333, impares);
    Trabajador trabajador4 = new Trabajador(444444, pares);

    Trabajador trabajador5 = new Trabajador();
    trabajador5.setDni(12345678);
    trabajador5.setEmpleador(impares);
    
    trabajador1.setEmpleador(impares);
    trabajador2.setEmpleador(pares);

    impares.empleados = new Trabajador[2];
    impares.empleados[0] = trabajador1;
    impares.empleados[1] = trabajador3;

    pares.empleados = new Trabajador[2];
    pares.empleados[0] = trabajador2;
    pares.empleados[1] = trabajador4;
    

    // imprime datos deesde la clase Trabajador
    System.out.println("Trabajador 1: " + trabajador1.getDni() + " - " + trabajador1.getEmpleador().rSocial);
    System.out.println("Trabajador 2: " + trabajador2.getDni() + " - " + trabajador2.getEmpleador().rSocial);

    // imprime datos deesde la clase Empresa

    System.out.println("Empresa 1: " + impares.rSocial);
    for (int i = 0; i < impares.empleados.length; i++) {
      System.out.println("Trabajador: " + impares.empleados[i].getDni());
    }



  }
    
}
