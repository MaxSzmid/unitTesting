package clases;

public class Empleado extends Persona {

    private int numeroEmpleado = 0;
    private String cargo;
    private Double salario;

    public Empleado(String nombre, int edad, int numeroEmpleado, String cargo, Double salario) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
