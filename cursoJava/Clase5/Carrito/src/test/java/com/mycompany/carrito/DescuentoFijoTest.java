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
public class DescuentoFijoTest {
    
    public DescuentoFijoTest() {
    }

    /**
     * Test of aplicaDescuentoFijo method, of class DescuentoFijo.
     */
    @Test
    public void testAplicaDescuentoFijo() {
        System.out.println("aplicaDescuentoFijo");
        float importeBruto = 100;
        DescuentoFijo instance = new DescuentoFijo(1);
        float expResult = 99;
        float result = instance.aplicaDescuentoFijo(importeBruto);
        assertEquals(expResult, result, 0);

    }
    
    @Test
    public void testAplicaDescuentoFijoCero() {
        System.out.println("testAplicaDescuentoFijoCEro");
        float importeBruto = 100;
        DescuentoFijo instance = new DescuentoFijo(0);
        float expResult = 100;
        float result = instance.aplicaDescuentoFijo(importeBruto);
        assertEquals(expResult, result, 0);

    }
    
}
