package clases;

public class Operario extends Empleado{
    private String puesto;

    public Operario(String nombre, int edad, int numeroEmpleado, String cargo, Double salario, String puesto) {
        super(nombre, edad, numeroEmpleado, cargo, salario);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Operarios{" +
                "puesto='" + puesto + '\'' +
                '}';
    }
}
