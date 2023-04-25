/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase14;

import java.util.ArrayList;

/**
 *
 * @author luciana
 */
public class Profesor extends Persona {
    public String titulo;
    public ArrayList <Asignatura> curso = new ArrayList();

    public Profesor() {
        super();
    }

    public Profesor(String nombre, int legajo, String titulo) {
        super(nombre, legajo);
        this.titulo = titulo;
    }

    
    
    
}
