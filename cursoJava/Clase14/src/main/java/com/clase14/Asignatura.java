/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase14;

/**
 *
 * @author luciana
 */
public class Asignatura {
    private int codigo;
    public String nombre;
    public Profesor instructor;

    public Asignatura() {
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura(Asignatura en) {
        this.nombre = en.nombre;
            }

    public Asignatura(int codigo,String nombre, Profesor instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
