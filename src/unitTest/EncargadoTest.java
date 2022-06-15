package unitTest;

import clases.Encargado;
import org.junit.*;

import static org.junit.Assert.*;

public class EncargadoTest {
    static Encargado encargado;

    @BeforeClass
    public static void beforeClass() {

        encargado = new Encargado("Miriam", 20, 3, "Encargada de finanzas",
                500.00, "Administracion");
    }

    @Before
    public void before() {
        encargado.getHistorialEdad().clear();
        encargado.setEdad(20);

    }

    @Test
    public void informeTest() {
        String texto = encargado.generarInforme("Administrativo", "Administrando");
        assertEquals("Tipo de informe: Administrativo Contenido: Administrando", texto);
    }

    @Test
    public void sumarEdadTest() {
        encargado.sumarEdad(1);
        assertEquals(20, encargado.getEdad());
        assertEquals(1, encargado.getHistorialEdad().size());

    }

    @Test
    public void sumarEdad2Test() {
        encargado.sumarEdad(-1);
        assertEquals(20, encargado.getEdad());
        assertEquals(1, encargado.getHistorialEdad().size());

    }
    @Test
    public void multiplicarEdadTest(){
        float resultado = encargado.multiplicarEdad(1.96F);
        assertEquals(39.2F, resultado, 0.0);
        assertTrue(encargado.getHistorialEdad().get(encargado.getHistorialEdad().size()-1).startsWith("Multiplicacion"));
    }

    @Test
    public void copiaObjetoAssert(){
        Encargado encargado2 = encargado;
        encargado.setEdad(33);
        assertSame(encargado, encargado2);
    }

    @After
    public void after() {

    }


    @AfterClass
    public static void afterClass() {

    }
}
