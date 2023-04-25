/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.integrador1;

import java.time.LocalDate;

/**
 *
 * @author luciana
 */
public class Inscripcion {
    
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha = LocalDate.now();
    
    public Inscripcion(){
        fecha = LocalDate.now();        
    }
    
    public Inscripcion(Alumno alumno, Materia materia){
        this.alumno = alumno;
        this.materia = materia;
        fecha = LocalDate.now();
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
    public Alumno getAlumno(){
        return this.alumno;
    }
    
    public void setMateria(Materia materia){
        this.materia = materia;
    }
    
    public Materia getMateria(){
        return this.materia;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }
    
}
