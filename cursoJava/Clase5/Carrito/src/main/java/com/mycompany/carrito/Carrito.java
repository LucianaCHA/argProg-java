/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrito;

/**
 *
 * @author luciana
//  */

public  class Carrito{

    ItemCarrito [] items = new ItemCarrito[5];

    public void mostrarProductos(){
        for (ItemCarrito item : items) {
            if(item!=null){
                System.out.println(item.producto.nombre + " "+ item.cantidad + " "+ item.costoFinal(0));
            }
        }
    }

    public float totalCarrito(int interes, int descuento){
        float total = 0;
        for (ItemCarrito item : items) {
            if(item != null){
                total += item.costoFinal(interes);
            }
        }
        Descuento desc = new Descuento(descuento);
        total = desc.aplicaDescuento(total);

        return total;
    }
    
    public Carrito(ItemCarrito [] items){
        this.items = items;
    }

    
}