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
public class Ronda {

    private int nro;
    private ArrayList<Partido> partidos;

    public Ronda() {
    }

    public Ronda(int nro) {
        this.nro = nro;
        this.partidos = new ArrayList<>();
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

}
