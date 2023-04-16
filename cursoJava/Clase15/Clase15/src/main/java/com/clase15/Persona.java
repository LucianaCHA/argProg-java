/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase15;

/**
 *
 * @author luciana
 */
public class Persona {

    private static int nroSocio = 100;
    private int dni;
    public String nombre;
    private boolean tieneLibro;

    public Persona() {
        nroSocio++;
    }

    public Persona(String nombre) {
        nroSocio++;
        this.nombre = nombre;
    }

    public Persona(int dni, String nombre) {
        nroSocio++;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean getTieneLibro() {
        return this.tieneLibro;
    }

    public void setTieneLibro(boolean tieneLibro) {
        this.tieneLibro = tieneLibro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void mostrarAtributosPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Nro. Socio: " + this.getNroSocio());
        System.out.println("Tiene Libro: " + this.tieneLibro);
    }

}
