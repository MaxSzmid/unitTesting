package test;

import clases.Empleado;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmpleadosTest {

    Empleado empleado = new Empleado("Matias", 35, 1,  "Desarrollador");

    @Before
    public void beforeTest(){
        System.out.println("Ejectuando beforeTest");
        //empleado.
    }

    @Test
    public void testNombre(){
        System.out.println("testEmpleado");
        Assert.assertEquals("Matias", empleado.getNombre());
    }

    @Test
    public void testEdad(){
        System.out.println("testEdad");
        Assert.assertEquals( 35, empleado.getEdad());
    }

    @Test
    public void testNumero(){
        System.out.println("testNumero");
        Assert.assertEquals( 1, empleado.getNumeroEmpleado());
    }

    @Test
    public void testCargo(){
        System.out.println("testCargo");
        Assert.assertEquals("Desarrollador", empleado.getCargo());
    }

    @After
    public void afterTest(){
        System.out.println("Termino el test");
    }

}
