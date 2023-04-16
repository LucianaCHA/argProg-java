/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tpasociasiones;

import java.util.ArrayList;

/**
 *
 * @author luciana
 */
public class Viajero {
    private String nombre;
    private String sexo;
    public ArrayList<Equipaje> guarda = new ArrayList<>();
    
    public Viajero(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Viajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
}
