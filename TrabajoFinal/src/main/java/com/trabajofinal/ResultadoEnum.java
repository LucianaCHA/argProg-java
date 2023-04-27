/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajofinal;

/**
 *
 * @author luciana
 */
public enum ResultadoEnum {
    GANA1,
    EMPATE,
    GANA2;

    public static ResultadoEnum getResultado(Equipo[] equipos) {
        if (equipos[0].getGoles() > equipos[1].getGoles()) {
            return ResultadoEnum.GANA1;
        } else if (equipos[0].getGoles() < equipos[1].getGoles()) {
            return ResultadoEnum.GANA2;
        } else {
            return ResultadoEnum.EMPATE;
        }
    }
}
