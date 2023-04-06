/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.carrito;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luciana
 */
public class DescuentoTest {
    private static final float DELTA = 0.01f;
    
    public DescuentoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of aplicaDescuento method, of class Descuento.
     */

    @Test
    public void testAplicaDescuento() throws Exception {
        System.out.println("aplicaDescuento");
        float importeBruto = 0.0F;
        Descuento instance = new Descuento(10);
        float expResult = 0.0F;
        float result = instance.aplicaDescuento(importeBruto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
