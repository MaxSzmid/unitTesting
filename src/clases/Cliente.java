package clases;

public class Cliente extends Persona {
    int numeroCliente = 0;
    String razonSocial;

    public Cliente(String nombre, int edad, int numeroCliente, String razonSocial) {
        super(nombre, edad);
        this.numeroCliente = numeroCliente;
        this.razonSocial = razonSocial;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
