/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.integrador1;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luciana
 */
public class InscripcionTest {
    
    public InscripcionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of setAlumno method, of class Inscripcion.
     */
    @Test
    public void testSetAlumno() {
        System.out.println("setAlumno");
        Alumno alumno = null;
        Inscripcion instance = new Inscripcion();
        instance.setAlumno(alumno);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAlumno method, of class Inscripcion.
     */
    @Test
    public void testGetAlumno() {
        System.out.println("getAlumno");
        Inscripcion instance = new Inscripcion();
        Alumno expResult = null;
        Alumno result = instance.getAlumno();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMateria method, of class Inscripcion.
     */
    @Test
    public void testSetMateria() {
        System.out.println("setMateria");
        Materia materia = null;
        Inscripcion instance = new Inscripcion();
        instance.setMateria(materia);

    }

    /**
     * Test of getMateria method, of class Inscripcion.
     */
    @Test
    public void testGetMateria() {
        System.out.println("getMateria");
        Inscripcion instance = new Inscripcion();
        Materia expResult = null;
        Materia result = instance.getMateria();
        assertEquals(expResult, result);

    }

    /**
     * Test of aprobada method, of class Inscripcion.
     */
    @Test
    public void testAprobadaFalse() {
        System.out.println("aprobada");
        Inscripcion instance = new Inscripcion();
        var alumno = new Alumno("Luciana",   new ArrayList<>());
        alumno.getMateriasAprobadas();
        instance.setAlumno(alumno);
    
        Materia materia = new Materia("Matematica 2", new ArrayList<>());
        ArrayList<Materia> correlativas = new ArrayList<>();
        correlativas.add(new Materia("Matematica 1",  null));
        materia.setCorrelativas(correlativas);
        
        instance.setMateria(materia);
    
        boolean expResult = false;
        boolean result = instance.aprobada();
        assertEquals(expResult, result);
    }

/**
 * Test of aprobada method, of class Inscripcion.
 */
@Test
public void testAprobadaTrue() {    
    System.out.println("aprobada");
    Materia mates1 = new Materia("Matematica 1",  null);
    Materia mates2 =  new Materia("Matematica 2", new ArrayList<>());

    ArrayList<Materia> correlativas = new ArrayList<>();
    correlativas.add(mates1);

    mates2.setCorrelativas(correlativas);

    Inscripcion instance = new Inscripcion();
    Alumno alumno = new Alumno("Luciana",   new ArrayList<>());
    
    alumno.getMateriasAprobadas().add(mates1);
    instance.setAlumno(alumno);
    instance.setMateria(mates2);

    boolean expResult = true;
    boolean result = instance.aprobada();
    assertEquals(expResult, result);

}
    
}
