/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase14;

/**
 *
 * @author luciana
 */
public class Inscripcion {
    public static int numero = 0;
    public Estudiante inscripto;
    public Asignatura en;
    public Inscripcion(){
        en = new Asignatura();
    }

    public Inscripcion(Estudiante inscripto) {
        numero++;
        this.inscripto = inscripto;
        en = new Asignatura();
    }

    public Inscripcion(Estudiante inscripto, Asignatura en) {
        numero++;
        this.inscripto = inscripto;
        this.en = new Asignatura();
    }
    
}
