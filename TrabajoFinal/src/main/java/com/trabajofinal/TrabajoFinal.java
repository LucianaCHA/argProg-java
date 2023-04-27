/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.trabajofinal;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * Trabajo Integrador Desarrollador Java inicial Grupo 20 - Comisión 062
 *
 * Integrantes PABLO SAMAT (samatpablo@gmail.com) 
 * GUILLERMO SEBASTIAN MARTINEZ (guillermo.s.martinez@hotmail.com) 
 * LUCIANA CHAMORRO (lucianachamorro87@gmail.com)
 */
public class TrabajoFinal {

    public static void main(String[] args) {

        try {
            ArrayList<String> resultados = leerArchivo("resultados");
            ArrayList<String> pronosticos = leerArchivo("pronosticos");
            ArrayList<Ronda> rondas = crearRondas(resultados);
            ArrayList<Jugador> resultadoProde = crearJugadores(pronosticos, rondas);

            calcularPuntaje(resultadoProde);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static ArrayList leerArchivo(String archivo) throws Exception {

        String data = JOptionPane.showInputDialog("Ingrese archivo de " + archivo);

        InputStream file = new FileInputStream(data);

        ArrayList<String> datos = new ArrayList<>();
        int i = 0;

        try (Scanner obj = new Scanner(file)) {
            while (obj.hasNextLine()) {
                String linea = obj.nextLine();
                datos.add(linea);
                i++;
            }
        }
        return new ArrayList(datos.subList(1, datos.size()));
    }

    private static void calcularPuntaje(ArrayList<Jugador> listaPronosticos) {
        String puntaje = "";

        for (Jugador jugador1 : listaPronosticos) {
            puntaje += jugador1.getNombre_jugador() + " : " + jugador1.getPuntos_obtenidos() + "\n";
        }

        JOptionPane.showInternalMessageDialog(null, puntaje, "Puntaje calculado", JOptionPane.PLAIN_MESSAGE);
    }

    private static Partido crearPartido(String eq1, String goles1, String eq2, String goles2) throws Exception {

        Equipo eq1_name = new Equipo(eq1, "", Integer.parseInt(goles1));
        Equipo eq2_name = new Equipo(eq2, "", Integer.parseInt(goles2));
        Equipo[] equipos = new Equipo[2];
        equipos[0] = eq1_name;
        equipos[1] = eq2_name;

        Partido partido = new Partido(equipos);

        return partido;
    }

    private static ArrayList<Ronda> crearRondas(ArrayList<String> resultados) throws Exception {

        ArrayList<Ronda> rondas = new ArrayList<>();

        for (int i = 0; i < resultados.size(); i++) {
            String linea = (String) resultados.get(i);
            String[] datos = linea.split(",");

            if (datos.length != 6) {
                throw new Exception("Error en el archivo de resultados, número de campos inválido en línea " + (i + 1));
            }

            int nroRonda = Integer.parseInt(datos[0]);

            if (rondas.isEmpty()) {

                Ronda ronda = new Ronda(nroRonda);
                Partido partido = crearPartido(datos[1], datos[2], datos[4], datos[3]);

                ronda.getPartidos().add(partido);

                rondas.add(ronda);

            } else if (rondas.get(rondas.size() - 1).getNro() != nroRonda) {
                Ronda ronda = new Ronda(nroRonda);
                Partido partido = crearPartido(datos[1], datos[2], datos[4], datos[3]);

                ronda.getPartidos().add(partido);

                rondas.add(ronda);

            } else {

                Ronda ronda = rondas.get(rondas.size() - 1);
                Partido partido = crearPartido(datos[1], datos[2], datos[4], datos[3]);
                ronda.getPartidos().add(partido);
            }
        }

        return rondas;

    }

    private static ArrayList<Jugador> crearJugadores(ArrayList<String> pronosticos, ArrayList<Ronda> rondas) throws Exception {

        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 0; i < pronosticos.size(); i++) {
            String linea = (String) pronosticos.get(i);
            String[] datos = linea.split(",");

            if (datos.length != 6) {
                throw new Exception("Error en el archivo de pronosticos, número de campos inválido en línea " + (i + 1));
            }

            String nombre_jugador = datos[0];

            if (jugadores.isEmpty()) {
                Jugador jugador = new Jugador(nombre_jugador);
                Pronostico pronostico = new Pronostico();

                Partido partido = validaPartido(rondas, datos[1], datos[5]);

                pronostico.setPartido(partido);

                try {
                    pronostico.setApuesta(asignarResultado(datos));
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    break;
                }

                jugador.setApuesta(new ArrayList<>());
                jugador.getApuesta().add(pronostico);
                jugadores.add(jugador);

            } else if (!jugadores.get(jugadores.size() - 1).getNombre_jugador().equals(nombre_jugador)) {

                Jugador jugador = new Jugador(nombre_jugador);
                Pronostico pronostico = new Pronostico();

                Partido partido = validaPartido(rondas, datos[1], datos[5]);

                pronostico.setPartido(partido);

                try {
                    pronostico.setApuesta(asignarResultado(datos));
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    break;
                }

                jugador.setApuesta(new ArrayList<>());
                jugador.getApuesta().add(pronostico);
                jugadores.add(jugador);
            } else {
                Jugador jugador = !jugadores.isEmpty() ? jugadores.get(jugadores.size() - 1) : jugadores.get(0);
                Pronostico pronostico = new Pronostico();

                Partido partido = validaPartido(rondas, datos[1], datos[5]);

                pronostico.setPartido(partido);

                try {
                    pronostico.setApuesta(asignarResultado(datos));
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

                jugador.getApuesta().add(pronostico);

            }
        }

        return jugadores;
    }

    private static Partido validaPartido(ArrayList<Ronda> rondas, String eq1, String eq2) throws Exception {
        Partido partido = null;

        for (int j = 0; j < rondas.size(); j++) {
            for (int k = 0; k < rondas.get(j).getPartidos().size(); k++) {
                if (rondas.get(j).getPartidos().get(k).getEquipos()[0].getNombre().equals(eq1) && rondas.get(j).getPartidos().get(k).getEquipos()[1].getNombre().equals(eq2)) {

                    partido = rondas.get(j).getPartidos().get(k);

                    return partido;
                }
            }
        }
        if (partido == null) {
            throw new Exception("Error en el archivo de pronósticos, el partido " + eq1 + " vs " + eq2 + " no existe en las rondas");
        }
        return partido;
    }

    private static String asignarResultado(String[] datos) throws Exception {
        int index = Arrays.asList(datos).indexOf("X");
        switch (index) {
            case 2:
                return "1";
            case 3:
                return "EMPATE";
            case 4:
                return "2";
            case -1:
                throw new Exception("Falta información de resultado en pronóstico");

            default:
                throw new Exception("Error al leer el pronóstico");
        }

    }
}
