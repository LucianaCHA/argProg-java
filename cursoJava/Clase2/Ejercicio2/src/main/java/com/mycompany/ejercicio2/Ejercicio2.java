/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        float precioUnitario = 3500;
        String inputNum = JOptionPane.showInputDialog("Ingrese cantidad de camisas: ");
        
        int cantidad = Integer.parseInt(inputNum);
        float total = precioUnitario * cantidad;
        
        float descuento;
        
        if(cantidad >= 3 ){
            descuento = 0.80f;
        }else{
            descuento = 0.90f;
        }        
        
        float totalDescuento = descuento * total;
        
        System.out.println("Total sin descuento $" + total + "\nTotal con descuento $" + totalDescuento);
    }
}
