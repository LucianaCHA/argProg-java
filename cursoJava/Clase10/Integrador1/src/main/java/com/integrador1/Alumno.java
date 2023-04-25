/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author luciana
 */
public class Alumno {
    private String nombre;
    private static int legajo= 1;
    private ArrayList<Materia> materiasAprobadas;
    
    Alumno(){
        legajo = Alumno.legajo++;
    }

    public Alumno(String nombre, ArrayList<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
        legajo = Alumno.legajo++;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre =nombre;
    }

}