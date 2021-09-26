package test;

import clases.Persona;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {

    Persona persona;

    @Before
    public void beforePersona() {
        System.out.println("antes");
        persona = new Persona("Juan", 23);
    }


    @Test
    public void testPersona() {
        System.out.println("testPersona");
        Assert.assertEquals("Juan", persona.getNombre());
    }

    @Test
    public void testEdad() {
        System.out.println("testEdad");
        Assert.assertEquals(23, persona.getEdad());
    }

    @Test
    public void testSumarEdad() {
        System.out.println("testSumarEdad");
        int edad = 7;

        int resultado = persona.sumarEdad(edad);
        Assert.assertEquals(30, resultado);
        Assert.assertEquals(30, persona.getEdad());
        Assert.assertEquals(1, persona.getHistorialEdad().size());

    }

    @Test
    public void testSumarEdadNegativa() {
        System.out.println("testSumarEdadNegativa");
        int edad = -7;

        int resultado = persona.sumarEdad(edad);
        Assert.assertEquals(16, resultado);
        Assert.assertEquals(16, persona.getEdad());
        Assert.assertEquals(1, persona.getHistorialEdad().size());

    }

    @Test
    public void testMultiplicar() {
        System.out.println("testMultiplicar");
        float edad = 3.99f;

        double resultado = persona.multiplicarEdad(edad);
        Assert.assertEquals(91.77, resultado, 0.1);
        //Assert.assertEquals(91.77, resultado, 0.000001);
        Assert.assertEquals(23, persona.getEdad());
        Assert.assertEquals(1, persona.getHistorialEdad().size());

    }

    @Test
    public void testDividir() {
        System.out.println("testSumarEdad");
        int edad = 2;

        float resultado = persona.dividirEdad(edad);
        Assert.assertEquals(11.5, resultado, 0.1);
        Assert.assertEquals(23, persona.getEdad());
        Assert.assertEquals(1, persona.getHistorialEdad().size());

    }

    @After
    public void afterPersona() {
        System.out.println("despues");
    }

}
