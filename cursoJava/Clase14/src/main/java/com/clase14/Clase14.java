/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.clase14;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase14 {

    public static void main(String[] args) {

        Collection <Inscripcion> inscripciones = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de inscripción de la Universidad Nacional de Córdoba");

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar una inscripción?", "Inscripción", JOptionPane.YES_NO_OPTION);

        while (opcion == JOptionPane.YES_OPTION) {
            try {

                inscripciones.add(inscribirEstudiante());
                JOptionPane.showMessageDialog(null, "Inscripción realizada con éxito");

                opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra inscripción?", "Inscripción", JOptionPane.YES_NO_OPTION);

                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al realizar la inscripción");
            }
        }

        if(opcion == JOptionPane.NO_OPTION){

            JOptionPane.showMessageDialog(null, "Adios");
        }

        System.out.println("Inscripciones realizadas: " + inscripciones.size());
    }
    public static Inscripcion inscribirEstudiante() {

        Profesor profe1 = new Profesor("Luciana",9436, "Lic. en Sistemas");
        Profesor profe2 = new Profesor("Rolando" , 2612, "Dr. en Matematicas");
        Profesor profe3 = new Profesor("Fortunato Adessi", 1234, "Dr. en Fisica");
        Profesor profe4 = new Profesor("Miguel", 5678, "Dr. en Quimica");
        Profesor profe5 = new Profesor("Mariano", 9012, "Dr. en Biologia");

        Asignatura asignatura1 = new Asignatura(130,"Análisis Matemático I", profe2);
        Asignatura asignatura2 = new Asignatura(131,"Análisis Matemático II", profe2);
        Asignatura asignatura3 = new Asignatura(450,"Física I", profe3);
        Asignatura asignatura4 = new Asignatura(453,"Física II", profe3);
        Asignatura asignatura5 = new Asignatura(454,"Física III", profe3);
        Asignatura asignatura6 = new Asignatura(455,"Química I", profe4);
        Asignatura asignatura7 = new Asignatura(456,"Química Orgánica", profe4);
        Asignatura asignatura8 = new Asignatura(457,"Biología I", profe5);

        Inscripcion inscripcion = new Inscripcion();

        String nombre = JOptionPane.showInputDialog("Ingrese nombre de estudiante: ");
        int legajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese legajo: "));

        Estudiante estudiante = new Estudiante(nombre, legajo);

        String materia = JOptionPane.showInputDialog("Ingrese materia a inscribir: 1-AM1, 2-AM2, 3-F1, 4-F2, 5-F3, 6-Q1, 7-QO, 8-B1, 0-Salir");


        switch (materia) {
            case "1":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura1;
                break;
            case "2":
            inscripcion.inscripto = estudiante;
            inscripcion.en = asignatura2;
                break;
            case "3":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura3;
                break;
            case "4":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura4;
                break;
            case "5":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura5;
                break;
            case "6":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura6;
                
                break;
            case "7":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura7;
                break;
            case "8":
                inscripcion.inscripto = estudiante;
                inscripcion.en = asignatura8;
                break;
            case "0":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;

        }

        return inscripcion;
    }

}