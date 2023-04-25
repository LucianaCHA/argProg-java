/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciana
 */
public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    
    Materia(){
        
    }
    
    Materia(String nombre, List<Materia> correlativas){
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public List<Materia> getCorrelativas(){
            if (correlativas == null) {
                return new ArrayList<>();
            }
            return new ArrayList<>(correlativas);
        }
    
    public void setCorrelativas(List<Materia> correlativas){
        this.correlativas = (correlativas == null) ? new ArrayList<>() : new ArrayList<>(correlativas);

        
    }
    
    public boolean puedeCursar(Alumno alumno){
        List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();

        if(materiasAprobadas.contains(this)){
            return false;
        }

        if (this.getCorrelativas().isEmpty()) {
            return true;
        }

        for (Materia correlativa : this.getCorrelativas()) {
            if (!materiasAprobadas.contains(correlativa)) {
                return false;
            }
        }
    
        // If all correlatives have been approved, the student can take the course
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;

        Materia materia = (Materia) o;

        return nombre != null ? nombre.equals(materia.nombre) : materia.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }
    
}
