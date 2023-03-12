/*
 */
package com.mycompany.clase4practica;

public class Conversiones {

  public static void main(String[] args) {
    char car = 'r';
    int antiguo = 128;
    String piso = "7";

    // a. Creando nuevas variables tipo entero, convierta car y piso a tipo int.
    int carInt = (int) car;
    int pisoInt = Integer.parseInt(piso);

    // b. Luego sume las tres variables y muestre el resultado.

    int suma = carInt + antiguo + pisoInt;
    System.out.println("La suma es: " + suma);

    // c. Luego convierta car y antiguo a tipo String, y car a mayúscula (toUpperCase()).
    String carString = String.valueOf(car).toUpperCase();
    String antiguoString = String.valueOf(antiguo);

    // d. Utilice lo hecho en el punto c para mostrar la frase: Hay 7 áRboles de 128 años.

    System.out.println("Hay " + piso + " " +"a" + carString + "boles de " + antiguoString + " años.");
  }
    
}
