/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicoClaseEmpleado;

/**
 *
 * @author luciana
 */
 class Empleado {
    // cantidad de epleados debe aumentar en uno cada vez que se crea un empleado
    // cantidad de empleados debe ser un atributo de clase

    public static int cantidadDeEmpleados= 1;
    int cantidadEmpleados;
    
    String nombre;
    int DNI;
    
    public Empleado(){
        cantidadEmpleados = Empleado.cantidadDeEmpleados++;

    }
    
    public Empleado(String nombre,int DNI){
        cantidadEmpleados = Empleado.cantidadDeEmpleados++; 
        this.nombre= nombre;
        this.DNI = DNI;

    }
}
