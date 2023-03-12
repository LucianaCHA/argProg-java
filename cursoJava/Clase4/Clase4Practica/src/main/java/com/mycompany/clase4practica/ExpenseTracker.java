/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4practica;

import javax.swing.JOptionPane;

/**
 *En un supermercado una clienta pone en su carrito los artículos que va tomando de los estantes.
 * La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, por lo que
 * cada vez que toma un artículo anota su precio junto con la cantidad de artículos iguales que 
 * ha tomado y determina cuánto dinero gastará en ese artículo; a esto, le suma lo que ira gastando
 * en los demás artículos, hasta que decide que ya tomó todo lo que necesitaba. 
 * Ayúdele a esta señora a obtener el total de sus compras.
 * @author luciana
 */
public class ExpenseTracker {
    public static void main(String[] args) {
        float total = 0;

        int option = JOptionPane.showConfirmDialog(null, "Agregar artículo?", "Lista de compras", JOptionPane.YES_NO_OPTION);

        while(option == JOptionPane.YES_OPTION){
            total += AddItem();
            option = JOptionPane.showConfirmDialog(null, "Agregar otro artículo?", "Lista de compras", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null, "El total de su compra es: $ " + total);
      }
    
    public static float AddItem (){
        String inputQuantity = JOptionPane.showInputDialog("Ingrese cantidad de articulos: ");
            int quantity = Integer.parseInt(inputQuantity);
            
            String inputPrice = JOptionPane.showInputDialog("Ingrese precio de articulos: ");
            float price = Integer.parseInt(inputPrice);
            
            return quantity * price;    
    }    
}
