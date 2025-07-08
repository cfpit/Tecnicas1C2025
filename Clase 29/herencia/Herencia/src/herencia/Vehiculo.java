public class Vehiculo {
    //atributos
    protected int velocidad;

    //constructores
    public Vehiculo() {}

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

    //metodos
    public void acelerar(int km) {
        this.velocidad += km;
    }

    @Override
    public String toString() {
        return " velocidad=" + velocidad;
    }

}
