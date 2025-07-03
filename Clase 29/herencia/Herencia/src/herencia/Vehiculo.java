package herencia;

public class Vehiculo {
    private int velocidad;

    //constructor vacio
    public Vehiculo() {}

    //constructor con parametros
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    //getters y setters
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    // metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                '}';
    }
    

}
