package interfaces;

public class Administrativo {
    // Atributos
    private int valor;
    private int horas;

    // Constructores
    public Administrativo() {}

    public Administrativo(int valor, int horas) {
        this.valor = valor;
        this.horas = horas;
    }

    // Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    // Implementación del método de la interface Empleado
    public void calcularSueldo() {
        System.out.println("Sueldo del administrativo: " + valor * horas);
    }

    @Override
    public String toString() {
        return "Administrativo [valor=" + valor + ", horas=" + horas + "]";
    }
}
