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
    boolean descuentoFijo = false;
    boolean descuentoPorcentajeTope = false;

    
    public void mostrarProductos(){
        for (ItemCarrito item : items) {
            if(item!=null){
                System.out.println(item.producto.nombre + " "+ item.cantidad + " "+ item.costoFinal(0));
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

        
        // Descuento desc = new Descuento(descuento);
        // total = desc.aplicaDescuento(total);

        return total;
    }

    public float precioFinalCarrito(){
        float bruto = carritoSinDescuento(0);

        switch (tipoDescuento()){
            case "Descuento Fijo":
                DescuentoFijo descFijo = new DescuentoFijo(10);
                return descFijo.aplicaDescuentoFijo(bruto);

            case "Descuento porcentual con tope":
                DescuentoPorcentajeConTope descPorcTope = new DescuentoPorcentajeConTope();
                return descPorcTope.aplicaDescuentoConTope(bruto);
            
            case "Descuento porcentual":
                Descuento desc = new Descuento(10);
                return desc.aplicaDescuento(bruto);

            default:
                return bruto;
        }

        // if(descuentoFijo){
        //     DescuentoFijo desc = new DescuentoFijo(10);
        //     return desc.aplicaDescuentoFijo(bruto);
        // }else{
        //     Descuento desc = new Descuento(10);
        //     return desc.aplicaDescuento(bruto);
        // }
    }
    
    public Carrito(ItemCarrito [] items){
        this.items = items;
    }

    
}