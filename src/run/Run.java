package run;

import clases.Cliente;
import clases.Empleado;
import clases.Persona;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<Persona> array = new ArrayList<Persona>();
        Empleado empleado = new Empleado("Nicolas", 26,1, "Gerente");
        Empleado empleado2 = new Empleado("Angela", 38, 2,"Operaria");
        Cliente cliente = new Cliente("Marcelo", 33, 1,"Responsable inscripto");

        array.add(empleado);
        array.add(cliente);
        array.add(empleado2);


//        for (Persona personitas:array) {
//            System.out.println(personitas.toString());
//        }
        empleado.sumarEdad(12);
        empleado.imprimirHistorialEdad();
    }
}
