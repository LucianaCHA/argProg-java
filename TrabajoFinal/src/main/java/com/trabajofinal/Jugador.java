/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajofinal;

import java.util.ArrayList;

/**
 *
 * @author luciana
 */
public class Jugador {

    private static int ID = 1;
    public final int nro_jugador;
    private String nombre_jugador;
    private int puntos_obtenidos;

    public ArrayList<Pronostico> apuesta;

    public Jugador() {
        this.nro_jugador = ID++;
    }

    public Jugador(String nombre_jugador) {
        this.nro_jugador = ID++;
        this.nombre_jugador = nombre_jugador;
    }

    public Jugador(String nombre_jugador, int puntos_obtenidos) {
        this.nro_jugador = ID++;
        this.nombre_jugador = nombre_jugador;
        this.puntos_obtenidos = puntos_obtenidos;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    public int getPuntos_obtenidos() {
        return puntos();
    }

    public void setPuntos_obtenidos(int puntos_obtenidos) {
        this.puntos_obtenidos = puntos_obtenidos;
    }

    public int puntos() {

        for (Pronostico pronostico : this.apuesta) {
            if (pronostico.resultado() == pronostico.getPartido().resultado()) {
                this.puntos_obtenidos += 1;
            } else {
                this.puntos_obtenidos += 0;
            }
        }
        return this.puntos_obtenidos;

    }

    public ArrayList<Pronostico> getApuesta() {
        return this.apuesta;
    }

    public void setApuesta(ArrayList<Pronostico> apuesta) {
        this.apuesta = apuesta;
    }

}
