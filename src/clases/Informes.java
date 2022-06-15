package clases;

public interface Informes {
     String  generarInforme(String tipo, String texto);

     void generarIncrementoSalarial(Empleado empleado, double incremento);

    double incrementoBase = 50;
}
