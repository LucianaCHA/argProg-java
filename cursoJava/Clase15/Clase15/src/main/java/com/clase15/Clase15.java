/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.clase15;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Clase15 {

    public static void main(String[] args) {

        // crear objetos
        Persona persona1 = new Persona(12345678, "Luciana");
        Persona persona2 = new Persona(54448, "Marisol");

        Autor autor1 = new Autor(77851, "Johan Rowling", "Profesora", "J.K.Rowling");
        autor1.setLibrosEscritos(new ArrayList<>());
        autor1.getLibrosecritos().add(new Libro(1, "Harry Potter : Caliz de fuego", "Fantasia"));

        Autor autor2 = new Autor(77852, "Joseph King", "Escritor", " Joe Hill");

        Libro libro1 = new Libro(1, "Harry Potter : Caliz de fuego", "Fantasia");

        Libro libro2 = new Libro(2, "El hombre en el castillo", "Ciencia Ficción");
        Libro libro3 = new Libro(3, "Prisionero de Azkaban", "Fantasía");
        Libro libro4 = new Libro(4, "El traje del muerto", "Terror");

        ArrayList<Autor> autoresLibro1 = new ArrayList<>();
        autoresLibro1.add(autor1);
        libro1.setAutores(autoresLibro1);

        ArrayList<Autor> autoresLibro2 = new ArrayList<>();
        autoresLibro2.add(autor2);
        autoresLibro2.add(autor1);
        libro2.setAutores(autoresLibro2);

        libro3.setAutores(autoresLibro1);

        ArrayList<Autor> autoresLibro4 = new ArrayList<>();
        autoresLibro4.add(autor2);
        libro4.setAutores(autoresLibro4);
        libro4.prestado = persona1;
        libro4.setDevuelto(false);

        // mostrar atributos
        System.out.println("Persona 1: ");
        persona1.mostrarAtributosPersona();

        System.out.println("Persona 2: ");
        persona2.mostrarAtributosPersona();

        System.out.println("Autor 1: ");
        autor1.mostrarAtributosAutor();

        System.out.println("Autor 2: ");
        autor2.mostrarAtributosAutor();

        System.out.println("Libro 1: ");
        libro1.mostrarAtributosLibro();

        System.out.println("Libro 2: ");
        libro2.mostrarAtributosLibro();

        System.out.println("Libro 3: ");
        libro3.mostrarAtributosLibro();

        System.out.println("Libro 4: ");
        libro4.mostrarAtributosLibro();

        JOptionPane.showMessageDialog(null, "Bienvenido a la biblioteca");

        ArrayList<Libro> libros = new ArrayList<>(Arrays.asList(libro1, libro2, libro3, libro4));
        ArrayList<Persona> socios = new ArrayList<>(Arrays.asList(persona1, persona2));
        ArrayList<Autor> autores = new ArrayList<>(Arrays.asList(autor1, autor2));

        int opcion = 0;

        while (opcion != 6) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:"
                    + " \n 1. Crear Socio \n 2. Crear Libro \n 3. Crear Autor \n 4. Préstamo \n 5. Devolución \n 6. Salir"));

            switch (opcion) {
                case 1:
                    socios.add(crearSocio());
                    break;
                case 2:
                    libros.add(crearLibro());

                    break;
                case 3:
                    autores.add(crearAutor());

                    break;
                case 4:
                    solicitarPrestamo(libros, socios);
                    break;
                case 5:
                    devolucion(libros, socios);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros sistemas");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }
        }

    }

    public static Persona crearSocio() {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del socio"));

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del socio");
        Persona socio = new Persona(dni, nombre);

        return socio;
    }

    public static Libro crearLibro() {
        int num_orden = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de orden del libro"));
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro");
        String tema = JOptionPane.showInputDialog("Ingrese el tema del libro");
        String editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro");

        ArrayList<Autor> autores = new ArrayList<>();
        int opcion = 0;
        while (opcion != 2) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1. Agregar autor \n 2. Salir"));
            switch (opcion) {
                case 1:
                    autores.add(crearAutor());
                    break;
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }
        }

        Libro libro = new Libro(num_orden, titulo, tema, editorial);
        libro.setAutores(autores);

        return libro;
    }

    public static Autor crearAutor() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del autor");
        String profesion = JOptionPane.showInputDialog("Ingrese la profesion del autor");
        String pseudonimo = JOptionPane.showInputDialog("Ingrese el pseudonimo del autor");
        Autor autor = new Autor(nombre, profesion, pseudonimo);

        return autor;
    }

    public static Libro solicitarPrestamo(ArrayList<Libro> libros, ArrayList<Persona> socios) {

        int opcion = 0;

        while (opcion != 4) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1. Buscar libro por titulo \n 2. Buscar libro por autor \n 3. Buscar libro por tema \n 4. Salir"));

            switch (opcion) {
                case 1:
                    //mostrar libros disponibles
                    mostrarOpcionesLibros(buscarLibroPorTitulo(libros), socios);
                    break;
                case 2:
                    //mostrar coincidencias por autor
                    mostrarOpcionesLibros(buscarLibroPorAutor(libros), socios);
                    break;
                case 3:
                    mostrarOpcionesLibros(buscarLibroPorTema(libros), socios);
                    break;
                case 4:
                    //salir
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }
        }
        return null;
    }

    public static ArrayList<Libro> buscarLibroPorTitulo(ArrayList<Libro> libros) {
        String titulo = SetFormat.toLowerAndStripped(JOptionPane.showInputDialog("Ingrese palabra clave del titulo del libro"));
        ArrayList<Libro> coincidencias = new ArrayList<>();
        for (Libro libro : libros) {
            if (SetFormat.toLowerAndStripped(libro.getTitulo()).contains(titulo) && libro.getDevuelto() == true) {
                coincidencias.add(libro);
            }
        }
        return coincidencias;
    }

    public static void mostrarOpcionesLibros(ArrayList<Libro> libros, ArrayList<Persona> socios) {
        int opciones = libros.size();
        if (opciones == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            return;
        }
        JOptionPane.showMessageDialog(null, "Seleccione opción. \n Libros disponibles: ");

        String mostrarOpciones = " ";
        int seleccion;

        for (int i = 0; i < libros.size(); i++) {
            mostrarOpciones += " \n" + (i + 1) + "." + libros.get(i).getTitulo();

        }

        seleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione opción: " + mostrarOpciones));

        if (seleccion > 0 && seleccion <= opciones) {
            // confirmar prestamo
            JOptionPane.showMessageDialog(null, "Usted seleccionó: " + libros.get(seleccion - 1).getTitulo());
            int opcion = JOptionPane.showConfirmDialog(null, "Confirma solicita préstamo de " + libros.get(seleccion - 1).getTitulo(), "Confirmar selección", JOptionPane.YES_NO_OPTION);

            Libro libroSeleccionado = libros.get(seleccion - 1);

            if (opcion == JOptionPane.YES_OPTION) {
                Persona socio = buscarSocioPorDNI(socios);
                JOptionPane.showMessageDialog(null, libroSeleccionado.solicitarPrestamo(socio));
            } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }

    }

    public static ArrayList<Libro> buscarLibroPorAutor(ArrayList<Libro> libros) {
        String autor = SetFormat.toLowerAndStripped(JOptionPane.showInputDialog("Ingrese palabra clave del autor del libro"));
        ArrayList<Libro> coincidencias = new ArrayList<>();
        for (Libro libro : libros) {
            for (Autor autorLibro : libro.getAutores()) {
                if (SetFormat.toLowerAndStripped(autorLibro.getNombre()).contains(autor)) {
                    coincidencias.add(libro);
                }
            }
        }
        return coincidencias;
    }

    public static ArrayList<Libro> buscarLibroPorTema(ArrayList<Libro> libros) {
        String tema = SetFormat.toLowerAndStripped(JOptionPane.showInputDialog("Ingrese palabra clave del tema del libro"));
        ArrayList<Libro> coincidencias = new ArrayList<>();
        for (Libro libro : libros) {
            if (SetFormat.toLowerAndStripped(libro.getTema()).contains(tema)) {
                coincidencias.add(libro);
            }
        }
        return coincidencias;
    }

    public static Persona buscarSocioPorDNI(ArrayList<Persona> socios) {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del socio"));

        for (Persona socio : socios) {
            if (socio.getDni() == dni) {
                return socio;
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró el socio");

        String opcion = JOptionPane.showInputDialog("Ingrese una opcion: \n 1. Crear Socio \n 2. Salir");

        if (opcion.equals("1")) {
            return crearSocio();
        } else {
            JOptionPane.showMessageDialog(null, "Operaión cancelada");
        }
        return null;
    }

    public static ArrayList<Persona> mostrarSocios(ArrayList<Persona> socios) {
        for (Persona socio : socios) {
            JOptionPane.showMessageDialog(null, socio.getNroSocio() + socio.getNombre());
        }
        return socios;

    }

    public static void devolucion(ArrayList<Libro> libros, ArrayList<Persona> socios) {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del socio"));
        int num_orden = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de orden del libro"));
        for (Persona socio : socios) {
            if (socio.getDni() == dni) {
                for (Libro libro : libros) {
                    if (libro.getNumOrden() == num_orden) {
                        JOptionPane.showMessageDialog(null, libro.devolverLibro(socio));
                    }
                }
            }
        }
    }
}
