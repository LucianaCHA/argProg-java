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
            System.out.println("Descuento fijo");
            return "Descuento Fijo";
        }else{
            if(descuentoPorcentajeTope){
                System.out.println("Descuento porcentual con tope");
                return "Descuento porcentual con tope";
            }else{
                System.out.println("Descuento porcentual");
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
        float bruto = carritoSinDescuento(interes);
        String tipoDescuento = tipoDescuento();

        switch (tipoDescuento) {
            case "Descuento Fijo":
                System.out.println("Descuento fijo");
                DescuentoFijo descFijo = new DescuentoFijo(descuento);
                return descFijo.aplicaDescuentoFijo(bruto);
            case "Descuento porcentual con tope":
                System.out.println("Descuento porcentual con tope");
                DescuentoPorcentajeConTope descPorcTope = new DescuentoPorcentajeConTope();
                return descPorcTope.aplicaDescuentoConTope(bruto);
            case "Descuento porcentual":
                System.out.println("Descuento porcentual");
                Descuento desc = new Descuento(descuento);
                return desc.aplicaDescuento(bruto);
            default:
                return bruto;
        }
    }
    
    public Carrito(ItemCarrito [] items, int descuento, int interes, boolean descuentoFijo, boolean descuentoPorcentajeTope){
        this.items = items;
        this.descuentoFijo = descuentoFijo;
        this.descuentoPorcentajeTope = descuentoPorcentajeTope;
        this.descuento = descuento;
        this.interes = interes;
    }

    
}