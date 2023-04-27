/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajofinal;

/**
 *
 * @author luciana
 */
public class Partido {

    private Equipo[] equipos = new Equipo[2];

    private static int ID = 0;
    private final int id;

    public Partido() {
        this.id = ID++;

    }

    public Partido(Equipo[] equipos) {
        this.id = ID++;
        this.equipos = equipos;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public int getId() {
        return id;
    }

    public ResultadoEnum resultado() {
        return ResultadoEnum.getResultado(equipos);
    }
}
