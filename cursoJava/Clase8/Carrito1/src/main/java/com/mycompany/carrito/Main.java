/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Main {

    public static void main(String[] args) throws Exception{
        //(int descuento, int porcentajeInteres, boolean  aplicaDescuentoFijo, boolean descuentoPorcentajeTope)
        int descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuento"));
        int porcentajeInteres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese interés por pago en cuotas"));
        boolean aplicaDescuentoFijo = Boolean.parseBoolean(JOptionPane.showConfirmDialog(null, "Aplica descuento fijo?") == 0 ? "true" : "false");
        boolean descuentoPorcentajeTope = Boolean.parseBoolean(JOptionPane.showConfirmDialog(null, "Aplica descuento porcentaje tope?") == 0 ? "true" : "false");

        crearListaProducto(descuento,porcentajeInteres, aplicaDescuentoFijo, descuentoPorcentajeTope);
    }

    public static ArrayList leerLista (String path)  throws Exception{

        InputStream file = new FileInputStream(path);
        ArrayList<String> lista = new ArrayList<>();
        int i = 0;

        try (Scanner obj = new Scanner(file)) {
            while (obj.hasNextLine()) {
                String linea = obj.nextLine();
                lista.add(linea);
                i++;
            }
        }

        return  new ArrayList(lista.subList(1, lista.size()));

    }

    public static void crearListaProducto(int descuento, int porcentajeInteres, boolean  aplicaDescuentoFijo, boolean descuentoPorcentajeTope) throws Exception{

        ArrayList lista = leerLista("lista.txt");
        ArrayList<ItemCarrito> listaDeProductos = new ArrayList<>();
        
        
        Carrito carrito = new Carrito(listaDeProductos, descuento, porcentajeInteres, aplicaDescuentoFijo, descuentoPorcentajeTope);
        
        for (int j =0 ; j< lista.size() ; j++){
            String[] producto = lista.get(j).toString().split(",");

            Producto prod = new  Producto(producto[2], Float.parseFloat(producto[1]), Integer.parseInt(producto[3]));

            ItemCarrito item = new ItemCarrito(prod, Integer.parseInt(producto[0]));

            listaDeProductos.add(item);

            System.out.println("producto" + listaDeProductos);
                
            // ItemCarrito item = new ItemCarrito(prod, Integer.parseInt(producto[0]));
            // lis0taDeProductos.add(item);      
            }



            try {
                float total = carrito.precioFinalCarrito();

                JOptionPane.showMessageDialog(null, "El total del carrito es: $" + total);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
            carrito.mostrarProductos();                 
        }

}