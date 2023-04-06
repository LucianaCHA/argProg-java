/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.integrador1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Integrador1 {

    public static void main(String[] args) throws Exception {

        Collection materias = inicializarMaterias();
        Collection alumnos = inicializarAlumnos();

        GuardarArchivo(crearListaInscripciones(materias, alumnos));
        

    }

    // Inicializar materias: crear 3 o 4 materias, con y sin correlativas entre ellas
    private static Collection<Materia> inicializarMaterias() {

        //Analisis Matematico
        Materia AMI = new Materia();
        AMI.setNombre("Análisis matemático I");
        AMI.setCorrelativas(null);

        ArrayList<Materia> correlativasAMII = new ArrayList<>();
        correlativasAMII.add(AMI);

        Materia AMII = new Materia("Análisis matemático II", correlativasAMII);

        // Programacion
        Materia PI = new Materia("Programación I", null);
        ArrayList<Materia> correlativasPII = new ArrayList<>();
        correlativasPII.add(PI);

        Materia PII = new Materia("Programación II", correlativasPII);

        // Bases de Datos
        Materia BD = new Materia("Bases de datos I", null);
        ArrayList<Materia> correlativasBDII = new ArrayList<>();
        correlativasBDII.add(BD);

        Materia BDII = new Materia("Bases de datos II", correlativasBDII);

        // complementaria
        Materia POO = new Materia("Programación orientada a objetos", null);

        Materia SO = new Materia("Sistemas Operativos", null);

        // Collection<Materia> materias = new ArrayList<>();
        // materias.add(AMI);
        // materias.add(AMII);
        // materias.add(PI);
        // materias.add(PII);
        // materias.add(BD);
        // materias.add(BDII);
        // materias.add(POO);
        // materias.add(SO);
        // esto es lo mismo que el add de arriba, el método asList() trata a los parametros como una lista y los agrega a la lista materias
        Collection<Materia> materias = Arrays.asList(AMI, AMII, PI, PII, BD, BDII, POO, SO);

        for (Materia materia : materias) {
            System.out.println(materia.getNombre());
        }
        return materias;

    }

    // Inicializar los alumnos, crear 2 o 3 alumnos, con y sin materias aprobadas.
    // Usar para las materias los MISMOS objetos de la colección de más arriba
    private static ArrayList<Materia> buscarMaterias(String[] nombreMaterias, Collection<Materia> materias) {
        ArrayList<Materia> materiasEncontradas = new ArrayList<>();

        for (String nombreMateria : nombreMaterias) {
            for (Materia materia : materias) {
                if (materia.getNombre().equals(nombreMateria)) {
                    materiasEncontradas.add(materia);
                }
            }
        }
        return materiasEncontradas;
    }

    private static Collection inicializarAlumnos() {
        Collection<Materia> materias = inicializarMaterias();

        Alumno alumno1 = new Alumno("Juan Perez", null);

        ArrayList<Materia> aprobadasAlumno2 = buscarMaterias(new String[]{"Análisis matemático I", "Programación I"}, materias);

        Alumno alumno2 = new Alumno("José Rodriguez", aprobadasAlumno2);

        ArrayList<Materia> aprobadasAlumno3 = buscarMaterias(new String[]{"Análisis matemático I"}, materias);

        Alumno alumno3 = new Alumno("Vanesa Sosa", aprobadasAlumno3);

        ArrayList<Materia> aprobadasAlumno4 = buscarMaterias(new String[]{"Análisis Matemático I", "Programación I", "Bases de Datos I"}, materias);

        Alumno alumno4 = new Alumno("Marina Soler", aprobadasAlumno4);

        Collection<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4);
        System.out.println("Alumnos inicializados:");

        return alumnos;

    }

// Leer el archivo parado por parámetros de args y por cada línea
// instanciar un objeto Inscripción, pero para llenar las materias y
//alumnos DEBE usar los objetos que creo más arriba
// Imprimir la línea, con el resultado si la inscripción está o no ok
    private static ArrayList leerInscripciones() throws Exception {

        String archivo = JOptionPane.showInputDialog("Ingrese archivo");

        InputStream file = new FileInputStream(archivo);

        ArrayList<String> lista = new ArrayList<>();
        int i = 0;

        try (Scanner obj = new Scanner(file)) {
            while (obj.hasNextLine()) {
                String linea = obj.nextLine();
                lista.add(linea);
                i++;
            }
        }

        return new ArrayList(lista.subList(1, lista.size()));

    }

    private static ArrayList<String> crearListaInscripciones(Collection<Materia> materias, Collection<Alumno> alumnos) throws Exception {

        ArrayList listaInscripciones = leerInscripciones();

        ArrayList<String> inscripciones = new ArrayList<>();

        for (int i = 0; i < listaInscripciones.size(); i++) {
            String linea = (String) listaInscripciones.get(i);

            String[] datos = linea.split(",");
            String nombreAlumno = datos[0];
            String nombreMateria = datos[1];

            Alumno alumno = buscarAlumno(nombreAlumno, alumnos);
            Materia materia = buscarMateria(nombreMateria, materias);

            String nuevaLinea;

            if (alumno == null) {
                nuevaLinea = nombreAlumno + "," + nombreMateria + "," + "Alumno no encontrado";

            } else if (materia == null) {

                nuevaLinea = nombreAlumno + "," + nombreMateria + "," + "Materia no encontrada";

            } else {
                // si el alumno y la materia son válidos, creo la inscripción 

                Inscripcion nuevaInscripcion = new Inscripcion(alumno, materia);
                boolean estado = nuevaInscripcion.aprobada();

                if (estado) {
                    nuevaLinea = nombreAlumno + "," + nombreMateria + "," + "Aprobada";
                } else {
                    nuevaLinea = nombreAlumno + "," + nombreMateria + "," + "Rechazada";
                }

            }

            inscripciones.add(nuevaLinea);

        }

        return inscripciones;

    }

    private static Alumno buscarAlumno(String nombreAlumno, Collection<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                return alumno;
            }
        }
        return null;
    }

    private static Materia buscarMateria(String nombreMateria, Collection<Materia> materias) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia;
            }
        }
        return null;
    }

    private static void GuardarArchivo(ArrayList<String> inscripciones)throws Exception {

        try(PrintWriter linea = new PrintWriter("resultadoInscripciones")){
        for (String inscripcion : inscripciones){
                System.out.println(linea);
                linea.println(inscripcion.replace(",", "    "));
            }
        }
        System.out.println("Resultado de inscripciones guardado correctamente");
    }

}
