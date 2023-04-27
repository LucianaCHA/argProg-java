/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajofinal;

/**
 *
 * @author luciana
 */
public class Pronostico {

    private String apuesta;
    private Partido partido;

    public Pronostico() {
    }

    public Pronostico(String apuesta, int partidoId) {
        this.apuesta = apuesta;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getApuesta() {
        return apuesta;
    }

    public void setApuesta(String apuesta) {
        this.apuesta = apuesta;
    }

    public ResultadoEnum resultado() {

        switch (this.apuesta) {
            case "1":
                return ResultadoEnum.GANA1;
            case "2":
                return ResultadoEnum.GANA2;
            case "EMPATE":
                return ResultadoEnum.EMPATE;
            default:
                throw new AssertionError("Resultado no válido");
        }

    }

}
