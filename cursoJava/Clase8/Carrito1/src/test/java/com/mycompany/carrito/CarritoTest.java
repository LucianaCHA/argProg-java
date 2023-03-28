/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.carrito;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luciana
 */
public class CarritoTest {
    
    public CarritoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of mostrarProductos method, of class Carrito.
     */
    @Test
    public void testMostrarProductos() {
        System.out.println("mostrarProductos");
        Carrito instance = null;
        instance.mostrarProductos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tipoDescuento method, of class Carrito.
     */
    @Test
    public void testTipoDescuento() {
        System.out.println("tipoDescuento");
        Carrito instance = null;
        String expResult = "";
        String result = instance.tipoDescuento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carritoSinDescuento method, of class Carrito.
     */
    @Test
    public void testCarritoSinDescuento() {
        System.out.println("carritoSinDescuento");
        int interes = 0;
        Carrito instance = null;
        float expResult = 0.0F;
        float result = instance.carritoSinDescuento(interes);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of precioFinalCarrito method, of class Carrito.
     */
    @Test
    public void testPrecioFinalCarrito() {
        System.out.println("precioFinalCarrito");
        Carrito instance = null;
        float expResult = 0.0F;
        float result = instance.precioFinalCarrito();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
