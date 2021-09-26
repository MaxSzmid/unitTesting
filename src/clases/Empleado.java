package clases;

public class Empleado extends Persona {

    int numeroEmpleado = 0;
    String cargo;

    public Empleado(String nombre, int edad, int numeroEmpleado, String cargo) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", cargo='" + cargo + '\'' +
                '}';
    }


}
