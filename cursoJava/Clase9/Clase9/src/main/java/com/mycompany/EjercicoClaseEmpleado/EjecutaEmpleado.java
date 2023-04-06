/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicoClaseEmpleado;

/**
 *
 * @author luciana
 */
public class EjecutaEmpleado {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan",2215631);
    
        Empleado empleado2 = new Empleado("Pedro",422331);

        Empleado empleado3 = new Empleado("Nina",550531);
        
        System.out.println("Nro de empleados: "+ empleado1.cantidadEmpleados);
        System.out.println("Nro de empleados: "+ empleado2.cantidadEmpleados);
        System.out.println("Nro de empleados: "+ empleado3.cantidadEmpleados);
        
    } 
    


}
