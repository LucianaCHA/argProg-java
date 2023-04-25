/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrito;

import java.util.ArrayList;
/**
 *
 * @author luciana
//  */

public  class Carrito{

    ArrayList<ItemCarrito> items = new ArrayList<>();// esto así es mala practica hay que poner la interface 
    boolean descuentoFijo = false;
    boolean descuentoPorcentajeTope = false;
    int descuento = 0;
    int interes = 0;

    
    public void mostrarProductos(){
        for (ItemCarrito item : items) {
            if(item!=null){
                System.out.println(item.producto.nombre + " "+ item.cantidad + " "+ item.costoFinal(interes));
            }
        }
    }

    public String tipoDescuento(){
        if(descuentoFijo){
            return "Descuento Fijo";
        }else{
            if(descuentoPorcentajeTope){
                return "Descuento porcentual con tope";
            }else{
                return "Descuento porcentual";
            }
        }
    }

    public float carritoSinDescuento(int interes){
        float total = 0;
        for (ItemCarrito item : items) {
            if(item != null){
                total += item.costoFinal(interes);
            }
        }

        return total;
    }

    public float precioFinalCarrito() throws Exception{
        float bruto = carritoSinDescuento(interes);
        String tipoDescuento = tipoDescuento();

        switch (tipoDescuento) {
            case "Descuento Fijo":

            try {
                    System.out.println("Aplicando descuento fijo");
                    DescuentoFijo descFijo = new DescuentoFijo(descuento);
                    return descFijo.aplicaDescuentoFijo(bruto);
                    
                } catch (Exception e) {
                    throw new Exception("El descuento no debe superar el importe a pagar");
                }

            case "Descuento porcentual con tope":

            try {
                System.out.println("Aplicando descuento con tope");
                DescuentoPorcentajeConTope descPorcTope = new DescuentoPorcentajeConTope();
                System.err.println("Descuento porcentual con tope en Carrito"  + descuento + " " + bruto );
                return descPorcTope.aplicaDescuentoConTope(bruto, descuento);
                
            } catch (Exception e) {
                throw new Exception("El importe a pagar no puede ser cero ni negativo");
            }

                
            case "Descuento porcentual":

                Descuento descPorc = new Descuento(descuento);
                try {
                    System.out.println("Aplicando descuento porcentual en try");
                    return descPorc.aplicaDescuento(bruto);
                } catch (Exception e) {
                    throw new Exception("El importe a pagar no puede ser cero ni negativo");
                }
                
                default:
                return bruto;
        }
    }
    
    public Carrito(ArrayList<ItemCarrito> items, int descuento, int interes, boolean descuentoFijo, boolean descuentoPorcentajeTope){
        this.items = items;
        this.descuentoFijo = descuentoFijo;
        this.descuentoPorcentajeTope = descuentoPorcentajeTope;
        this.descuento = descuento;
        this.interes = interes;
    }

    
}