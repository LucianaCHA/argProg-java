/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.integrador1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luciana
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getMateriasAprobadas method, of class Alumno.
     */
    @Test
    public void testGetMateriasAprobadas() {
        System.out.println("getMateriasAprobadas");
        Alumno instance = new Alumno();
        List<Materia> expResult = null;
        List<Materia> result = instance.getMateriasAprobadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setMateriasAprobadas method, of class Alumno.
     */
    @Test
    public void testSetMateriasAprobadas() {
        System.out.println("setMateriasAprobadas");
        ArrayList<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(new Materia("Matematica", null));
        Alumno instance = new Alumno();
        instance.setMateriasAprobadas(materiasAprobadas);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

        assertEquals(materiasAprobadas, instance.getMateriasAprobadas());
    }

    /**
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = new Alumno();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Pedrito";
        Alumno instance = new Alumno();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
