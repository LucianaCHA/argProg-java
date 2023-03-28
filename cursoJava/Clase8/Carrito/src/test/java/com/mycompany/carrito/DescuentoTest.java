/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

 /*DELTA  es una constante que representa la tolerancia entre el expect  el resultado recibido, es particularente util trabjando con flotantesporque el redodeo puede acarrear error. 
 AYUDAMEMORIA
 declarado como privado para que solo sea conoceida por la clase en la que se declaro
    static porque es una constante
    final porque no se puede modificar
    */

package com.mycompany.carrito;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luciana
 */
public class DescuentoTest {

    private static final float DELTA = 0.01f;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    @Test
    public void testAplicaDescuento() {
        System.out.println("testAplicaDescuento");
        Descuento descuento = new Descuento(10);
        float importeBruto = 100;
        float importeNeto = descuento.aplicaDescuento(importeBruto);
        assertEquals(90, importeNeto, DELTA); 
    }
    
    @Test
    public void testAplicaDescuentoCero() {
        Descuento descuento = new Descuento(0); 
        float importeBruto = 100;
        float importeNeto = descuento.aplicaDescuento(importeBruto);
        assertEquals(100, importeNeto, DELTA); 
    }
    
    @Test
    public void testAplicaDescuentoCien() {
        Descuento descuento = new Descuento(100); 
        float importeBruto = 100;
        float importeNeto = descuento.aplicaDescuento(importeBruto);
        assertEquals(0, importeNeto, DELTA);
    }
    
    @Test
    public void testAplicaDescuentoNegativo() {
        Descuento descuento = new Descuento(-10); 
        float importeBruto = 100;
        float importeNeto = descuento.aplicaDescuento(importeBruto);
        assertEquals(110, importeNeto, DELTA); 
    }
    
    @Test
    public void testAplicaDescuentoDecimal() {
        Descuento descuento = new Descuento(7.5f);
        float importeBruto = 80.5f;
        float importeNeto = descuento.aplicaDescuento(importeBruto);
        assertEquals(74.46, importeNeto, DELTA); 
    }
}