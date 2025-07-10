public abstract class Vehiculo {
    // Atributos
    protected int velocidad;

    // Constructores
    public Vehiculo() {
        this.velocidad = 0; // Inicializa la velocidad a 0 por defecto
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    // Métodos getter y setter
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    // Métodos abstractos
    //poseen firma pero no cuerpo(no implementación)
    // Las clases que hereden de Vehiculo DEBEN implementar el cuerpo de estos métodos
    public abstract void acelerar();

    public abstract void frenar();

    // Método toString
    // Devuelve una representación en cadena del objeto Vehiculo
    @Override
    public String toString() {
        return "velocidad = " + velocidad;
    }
    
}
