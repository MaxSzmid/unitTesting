package clases;

import java.util.LinkedList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<String> historialEdad = new LinkedList<String>();


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public List<String> getHistorialEdad() {
        return historialEdad;
    }

    public void setHistorialEdad(List<String> historialEdad) {
        this.historialEdad = historialEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void imprimirHistorialEdad() {
        System.out.println(this.historialEdad);
        for (String historial : this.historialEdad) {
            System.out.println(historial);
        }
    }

    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int sumarEdad(int sumar){
        this.edad += sumar;
        this.historialEdad.add(String.format("Suma: Edad Actual %d, Edad anterior %d, Edad sumada: %d", this.edad, (this.edad - edad), sumar));
        return this.edad;
    }

    public float dividirEdad(float dividir){
        this.historialEdad.add(String.format("Division: Edad Actual %d, Edad anterior %f, Edad dividida: %f", this.edad, (this.edad * dividir), dividir));
        return this.edad / dividir;
    }

    public float multiplicarEdad(float multiplicar) {
        System.out.println(this.edad + "  "+ (float)this.edad / multiplicar + "  "+multiplicar);
        this.historialEdad.add(String.format("Multiplicacion: Edad Actual %d, Edad anterior %f, Edad mulpiplicada: %f", this.edad, (this.edad / multiplicar), multiplicar));
        return this.edad * multiplicar;

    }
}
