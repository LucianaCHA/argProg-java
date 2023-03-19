/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luciana
 */
public class Main {
    public static void main(String[] args) throws Exception{
        crearListaProducto();
    }

    public static String[] leerLista (String path)  throws Exception{

        InputStream file = new FileInputStream(path);
        String [] lista = new String [5];
        int i = 0;

        try (Scanner obj = new Scanner(file)) {
            while (obj.hasNextLine()) {
                String linea = obj.nextLine();
                lista[i] = linea;
                i++;
            }
        }
        return Arrays.copyOfRange(lista, 1, lista.length);
    }

    public static void crearListaProducto() throws Exception{

        String [] lista = leerLista("lista.txt");

        ItemCarrito[] listaDeProductos = new ItemCarrito[lista.length];

        Carrito carrito = new Carrito(listaDeProductos);

        for (int i =0 ; i<3; i++){
            String[] producto = lista[i].split(",");
            Producto prod = new Producto(producto[2], Float.parseFloat(producto[1]), Integer.parseInt(producto[3]));

                
            ItemCarrito item = new ItemCarrito(prod, Integer.parseInt(producto[0]));
            listaDeProductos[i] = item;      
            }       
            System.out.println("El total del carrito es: $" + carrito.totalCarrito(0, 0));
    }

}