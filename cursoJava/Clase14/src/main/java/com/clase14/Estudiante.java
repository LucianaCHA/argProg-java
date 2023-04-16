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
public class Estudiante extends  Persona{

    public ArrayList<Inscripcion> formulario = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(String nombre, int legajo) {
        super(nombre, legajo);
    }

    public ArrayList<Inscripcion> getFormulario() {
        return formulario;
    } 
    
  
  
    
}
