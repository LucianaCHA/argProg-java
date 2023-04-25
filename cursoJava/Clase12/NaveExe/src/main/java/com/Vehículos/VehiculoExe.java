/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Vehículos;

/**
 *
 * @author luciana
 */
public class VehiculoExe {
    
    public static void main(String[] args) {


      Coche coche = new Coche(4, 'G', 100);
      System.out.println("Coche: " + coche.cantRuedas + " ruedas. ");

      System.out.println("Combustible: " + coche.getTipoCombustible() + " - " + coche.cantCombustible + " litros. ");
      System.out.println("Velocidad maxima en la clase coche: " + coche.velocMaxima() + " km/h. ");
      System.out.println("Capacidad maxima de carga en la clase coche: " + coche.capacidad_max_carga() + " kg.");



      Moto moto = new Moto(2, 'N', 100);
      System.out.println("Moto: " + moto.cantRuedas + " ruedas. ");

      System.out.println("Combustible: " + moto.getTipoCombustible() + " - " + moto.cantCombustible + " litros. ");
      System.out.println("Velocidad maxima en la clase moto: " + moto.velocMaxima() + " km/h. ");
      System.out.println("Capacidad maxima de carga en la clase moto: " + moto.capacidad_max_carga() + " kg.");

      Avion avion = new Avion('Q', 100);
      System.out.println("Avion: " + "sin ruedas. ");

      System.out.println("Combustible: " + avion.getTipoCombustible() + " - " + avion.cantCombustible + " litros. ");
      System.out.println("Velocidad maxima en la clase avion: " + avion.velocMaxima() + " km/h. ");

      System.out.println("Capacidad maxima de carga en la clase avion: " + avion.capacidad_max_carga() + " kg.");


      Helicoptero helicoptero = new Helicoptero('U', 100);
      System.out.println("Helicoptero: " + "sin ruedas. ");

      System.out.println("Combustible: " + helicoptero.getTipoCombustible() + " - " + helicoptero.cantCombustible + " litros. ");
      System.out.println("Velocidad maxima en la clase helicoptero: " + helicoptero.velocMaxima() + " km/h. ");
      System.out.println("Capacidad maxima de carga en la clase helicoptero: " + helicoptero.capacidad_max_carga() + " kg.");

      moto.mostarCombustibles();
    }
    
}
