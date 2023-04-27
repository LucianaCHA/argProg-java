/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase15;

import java.util.ArrayList;

/**
 *
 * @author luciana
 */
public class Autor extends Persona {

    public String profesion;
    private String pseudonimo;
    private ArrayList<Libro> librosEscritos;

    public Autor() {
    }

    public Autor(String nombre) {
        super(nombre);
    }

    public Autor(int dni, String nombre) {
        super(dni, nombre);
    }

    public Autor(String profesion, String pseudonimo) {
        this.profesion = profesion;
        this.pseudonimo = pseudonimo;
    }

    public Autor(String nombre, String profesion, String pseudonimo) {
        super(nombre);
        this.profesion = profesion;
        this.pseudonimo = pseudonimo;
    }

    public Autor(int dni, String nombre, String profesion, String pseudonimo) {
        super(dni, nombre);
        this.profesion = profesion;
        this.pseudonimo = pseudonimo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public ArrayList<Libro> getLibrosecritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(ArrayList<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    public void mostrarAtributosAutor() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.getDni());
        System.out.println("Profesion: " + this.profesion);
        System.out.println("Pseudonimo: " + this.pseudonimo);
        System.out.println("Libros escritos: ");
        if(this.getLibrosecritos() != null){
            for(Libro libro: this.getLibrosecritos()){
                System.out.println(libro.getTitulo());
            }
        }else{
            System.out.println("No hay libros para este autor");
        }
        
    }

}
