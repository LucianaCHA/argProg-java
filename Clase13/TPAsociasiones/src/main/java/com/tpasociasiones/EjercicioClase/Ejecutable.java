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
public class Ejecutable {

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("ABC123");
        Taxi taxi2 = new Taxi("DEF456");
        Taxi taxi3 = new Taxi("GHI789");
        Taxi taxi4 = new Taxi("JKL012");
        Taxi taxi5 = new Taxi("MNO345");
        Taxi taxi6 = new Taxi("PQR678");
        Taxi taxi7 = new Taxi("STU901");
        Taxi taxi8 = new Taxi("VWX234");
        Taxi taxi9 = new Taxi("YZA567");
        Taxi taxi10 = new Taxi("BCD890");
        
        Chofer chofer1 = new Chofer("Luciana", LocalDate.of(2023, 12, 31), new Taxi[]{taxi1, taxi2, taxi3});
        Chofer chofer2 = new Chofer("Juan", LocalDate.of(2023, 06, 30), new Taxi[]{taxi4, taxi5, taxi6});
        Chofer chofer3 = new Chofer("Pedro", LocalDate.of(2023, 01, 31), new Taxi[]{taxi7, taxi8, taxi9});
        Chofer chofer4 = new Chofer("Maria", LocalDate.of(2021, 12, 31), new Taxi[]{taxi10});
        
        chofer1.atributosChofer();
        chofer2.atributosChofer();
        chofer3.atributosChofer();
        chofer4.atributosChofer();
    }
    
}
