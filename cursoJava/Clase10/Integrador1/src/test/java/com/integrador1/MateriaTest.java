/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.integrador1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luciana
 */
public class MateriaTest {
    
    public MateriaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getNombre method, of class Materia.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Materia instance = new Materia();
        instance.setNombre("Analisis Matematico");
        String expResult = "Analisis Matematico";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class Materia.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Materia instance = new Materia();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCorrelativas method, of class Materia.
     */
    @Test
    public void testGetCorrelativasNull() {
        System.out.println("getCorrelativas");
        Materia instance = new Materia();
        List<Materia> expResult = new ArrayList<>();
        List<Materia> result = instance.getCorrelativas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCorrelativas method, of class Materia.
     */
    @Test
    public void testSetCorrelativas() {
        System.out.println("setCorrelativas");
        List<Materia> correlativas = null;
        Materia instance = new Materia();
        instance.setCorrelativas(correlativas);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of puedeCursar method, of class Materia.
     */
    @Test
    public void testPuedeCursar() {
        System.out.println("puedeCursar");
        Alumno alumno = new Alumno("Juan", new ArrayList<>());
        Materia instance = new Materia();
        boolean expResult = false;
        boolean result = instance.puedeCursar(alumno);
        assertEquals(expResult, result);

    }
    

    @Test
    public void testGetNombreMatematica() {
        Materia materia = new Materia("Matematica", new ArrayList<>());
        assertEquals("Matematica", materia.getNombre());
    }
    
    @Test
    public void testSetNombreHistoria() {
        Materia materia = new Materia();
        materia.setNombre("Historia");
        assertEquals("Historia", materia.getNombre());
    }
    
    @Test
    public void testGetCorrelativas() {
        Materia materia1 = new Materia("Matematica", new ArrayList<>());
        Materia materia2 = new Materia("Fisica", new ArrayList<>());
        List<Materia> correlativas = Arrays.asList(materia1, materia2);
        Materia materia = new Materia("Quimica", correlativas);
        assertEquals(correlativas, materia.getCorrelativas());
    }
    
    @Test
    public void testSetCorrelativas2() {
        Materia materia1 = new Materia("Matematica", new ArrayList<>());
        Materia materia2 = new Materia("Fisica", new ArrayList<>());
        List<Materia> correlativas = Arrays.asList(materia1, materia2);
        Materia materia = new Materia("Quimica", new ArrayList<>());
        materia.setCorrelativas(correlativas);
        assertEquals(correlativas, materia.getCorrelativas());
    }
    
    @Test
    public void testPuedeCursar2() {
        Materia materia1 = new Materia("Matematica", new ArrayList<>());
        Materia materia2 = new Materia("Fisica", new ArrayList<>());
        Materia materia3 = new Materia("Quimica", Arrays.asList(materia1, materia2));

        ArrayList<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(materia1);
        materiasAprobadas.add(materia2);
        
        Alumno alumno1 = new Alumno("Juan", null);
        alumno1.setMateriasAprobadas(materiasAprobadas);
        assertTrue(materia3.puedeCursar(alumno1));
        
        materiasAprobadas.remove(1);
        Alumno alumno2 = new Alumno("Pedro", null);
        alumno2.setMateriasAprobadas(materiasAprobadas);
        assertFalse(materia3.puedeCursar(alumno2));
    }
}
