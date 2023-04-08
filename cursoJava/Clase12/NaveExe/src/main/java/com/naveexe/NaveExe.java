/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.naveexe;

/**
 *
 * @author luciana
 */
public class NaveExe {

    public static void main(String[] args) {
        AvionCarga b747ERF = new AvionCarga("Boeing 747 – 400 ERF");
        System.out.println("Modelo: "+ b747ERF.tipoNave + 
                "\n Combustible: " + b747ERF.tipoCombustible +
                "\n Carga máxima de combustible: "+ b747ERF.capacidadCombustible +
                "\n Carga maxima: "+ b747ERF.getCantMaxKG() +
                "\n Autonomia: " + (int) b747ERF.rendimientoCombustible() + "km.");
        

        AvionCarga b747F = new AvionCarga("Boeing 747  Freighter","Querosene",229980, (float) 364.235);
        System.out.println("Modelo: "+ b747F.tipoNave + 
                "\n Combustible: " + b747F.tipoCombustible +
                "\n Carga máxima de combustible: "+ b747F.capacidadCombustible +
                "\n Carga maxima: "+ b747F.getCantMaxKG() +
                "\n Autonomia: " + (int) b747F.rendimientoCombustible() + "km.");


        AvionPasajeros b737 = new AvionPasajeros("Boeing 737");
        System.out.println("Modelo: "+ b737.tipoNave + 
                "\n Combustible: " + b737.tipoCombustible +
                "\n Carga máxima de combustible: "+ b737.capacidadCombustible +
                "\n Cant. Max pasajeros: "+ b737.getCantMaxPax() +
                "\n Autonomia: " + (int) b737.rendimientoCombustible() + "km.");
        
        AvionPasajeros a380 = new AvionPasajeros("Airbus A380", "Querosene", 10000, 800);
        System.out.println("Modelo: "+ a380.tipoNave + 
                "\n Combustible: " + a380.tipoCombustible +
                "\n Carga máxima de combustible: "+ a380.capacidadCombustible +
                "\n Cant. Max pasajeros: "+ a380.getCantMaxPax() +
                "\n Autonomia: " + (int) a380.rendimientoCombustible() + "km.");        
    }
}
