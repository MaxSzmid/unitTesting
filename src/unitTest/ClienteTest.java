package unitTest;

import clases.Cliente;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void createNewCliente() {
        Cliente cliente = new Cliente("Nicolas", 25, 1, "RESP INSC");
        assertEquals(25, cliente.getEdad());
    }
}
