/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Ejercicio2c {
    public static void main(String[] args){
    int random = (int)(Math.random() * 150 + 1);
    float descuento = 15;
    
    String inputNum = JOptionPane.showInputDialog("Ingrese total de la compra: ");
    int total = Integer.parseInt(inputNum);
    
    if(random >= 74) descuento = 20;
    
        System.out.println("Nro de la suerte: " + random + "\nDescuento obtenido : "+ descuento + "\nTotal con descuento: " + total* ((100 -descuento)/100));
    }
}
