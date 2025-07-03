package herencia;

public class Avion extends Vehiculo {
    private String vuelo;
    private int capacidadPasajeros;

    // Constructor vacío
    public Avion() {}

    // Constructor con parámetros
    public Avion(int velocidad, String vuelo, int capacidadPasajeros) {
        super(velocidad);
        this.vuelo = vuelo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Avion{" +
                "vuelo='" + vuelo + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", velocidad=" + super.toString() +
                '}';
    }

}
