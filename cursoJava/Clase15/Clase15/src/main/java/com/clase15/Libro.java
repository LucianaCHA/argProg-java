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
public class Libro implements Normas {

    public int num_orden;
    public String titulo;
    public String editorial;
    private boolean devuelto;
    public String material;
    private boolean enCirculacion;

    public Persona prestado;
    private ArrayList<Autor> autores;
    // tema deb estar en la interfaz Normas
    public String tema;

    public Libro() {
    }

    public Libro(int num_orden, String titulo, String tema) {
        this.devuelto = true;
        this.num_orden = num_orden;
        this.titulo = titulo;
        this.tema = tema;
    }

    public Libro(int num_orden, String titulo, String editorial, String tema) {
        this.devuelto = true;
        this.num_orden = num_orden;
        this.titulo = titulo;
        this.editorial = editorial;
        this.tema = tema;

    }

    @Override
    public String materialEncuaderado() {
        return material;
    }

    @Override
    public int[] tamaño() {
        // alto, ancho, prof
        int[] tamanio = {0, 0, 0};
        return tamanio;
    }

    public boolean getDevuelto() {
        return this.devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void getNumOrden(int num_orden) {
        this.num_orden = num_orden;
    }

    public int getNumOrden() {
        return this.num_orden;
    }

    public boolean isEnCirculacion() {
        return enCirculacion;
    }

    public void setEnCirculacion(boolean enCirculacion) {
        this.enCirculacion = enCirculacion;
    }

    public void mostrarAtributosLibro() {
        System.out.println(
                "Libro :"
                + "num_orden= " + num_orden
                + ", titulo= " + titulo
                + ", editorial= " + editorial
                + ", tema= " + tema
                + ", devuelto= " + devuelto
                + ", material= " + material
                + ", prestado= " + prestado
                + ", autores= ");
        
        if(this.getAutores() != null){
            for (Autor autor : this.getAutores()) {
            System.out.println("\n " + autor.getNombre());
            }
        }else{
            System.out.println("Sin autores informados para este título");
        }
        
    }

    public String solicitarPrestamo(Persona persona) {
        if (persona.getTieneLibro() == false) {
            if (this.devuelto) {
                System.out.println("El libro esta disponible");
                this.prestado = persona;
                this.devuelto = false;
                persona.setTieneLibro(true);
                return this.titulo + " prestado a " + this.prestado.getNombre();
            } else {
                return "El libro no esta disponible";
            }
        } else {
            return "El socio ya tiene un libro prestado";
        }
    }

    public String devolverLibro(Persona persona) {
        this.devuelto = true;
        this.prestado.setTieneLibro(false);
        this.prestado = null;

        return "El libro " + this.titulo + " fue devuelto por " + persona.getNombre();
    }

}
