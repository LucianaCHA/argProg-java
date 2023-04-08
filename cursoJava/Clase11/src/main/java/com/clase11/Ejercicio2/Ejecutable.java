/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase11.Ejercicio2;

/**
 *
 * @author luciana
 */
public class Ejecutable {

  public static void main(String[] args) {
    
    Felinos gato = new Felinos("Gato", "Felis silvestris catus", "Ciudades y zonas rurales");
    gato.puedeCaminar(gato);
    gato.puedeNadar(gato);
    gato.puedeVolar(gato);


    Felinos leon = new Felinos("Leon", "Panthera leo", "Sabana");

    leon.puedeCaminar(leon);
    leon.puedeNadar(leon);
    leon.puedeVolar(leon);

    Canidos perro = new Canidos("Perro", "Canis lupus familiaris", "Ciudades y zonas rurales");

    perro.puedeCaminar(perro);
    perro.puedeNadar(perro);
    perro.puedeVolar(perro);

    NoVoladoras gallinna = new NoVoladoras("Gallina", "Gallus gallus", "Granjas");

    gallinna.puedeCaminar(gallinna);
    gallinna.puedeNadar(gallinna);
    gallinna.puedeVolar(gallinna);

    Voladoras aguila = new Voladoras("Aguila", "Aquila chrysaetos", "Montañas");

    aguila.puedeCaminar(aguila);
    aguila.puedeNadar(aguila);
    aguila.puedeVolar(aguila);


  }
    
}
