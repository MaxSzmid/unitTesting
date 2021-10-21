package clases;

public class Encargado extends Empleado implements Informes{
    private String area;


    public Encargado(String nombre, int edad, int numeroEmpleado, String cargo, Double salario, String area) {
        super(nombre, edad, numeroEmpleado, cargo, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void generarInforme(String tipo,String texto) {
        System.out.println(" Tipo de informe: " + tipo + "\n" + "Contenido: " + texto);
    }

    @Override
    public void generarIncrementoSalarial(Empleado empleado, double incremento) {
            double nuevoSalario = Informes.incrementoBase + incremento + empleado.getSalario();
            empleado.setSalario(nuevoSalario);
    }


}
