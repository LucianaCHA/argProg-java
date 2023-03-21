/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangulo;

/**
 *
 * @author luciana
 */
//public class Rectangulo {
//
//    float base;
//    float altura;
//    String color;
//    
//    public Rectangulo(){
//        
//    }
//        public void mostrarTodos(){
//        System.out.println("datos " + base  + "  " + altura +" "+ color);
//    }
//    
//    public Rectangulo (float base, float altura, String color){
//        this.base = base;
//        this.altura = altura;
//        this.color = color ;
//        
//
//    }
//    
//    
//    
//}

public class Empleado {
    public static int cantidad_de_empleados = 0;
    public String nombre;
    public final int DNI;

    public Empleado(int DNI) {
        this.DNI = DNI;
        cantidad_de_empleados++;
    }

    public Empleado(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        cantidad_de_empleados++;
    }
    
    public void mostrarAtrib(){
        System.out.println("DNI: "+DNI);
        System.out.println("Nombre: "+nombre);
    }
    
}

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(93549354);
        Empleado e2 = new Empleado("Maria", 3457492);
        Empleado e3 = new Empleado("Juan", 38987492);
        System.out.println("Se crearon "+Empleado.cantidad_de_empleados+" empleados");
        
    }
}