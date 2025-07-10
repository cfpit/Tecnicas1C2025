public class Avion extends Vehiculo {
    private String vuelo;

    // Constructores
    public Avion() {
        super(); // Llama al constructor de la clase padre Vehiculo
    }

    public Avion(int velocidad, String vuelo) {
        super(velocidad); 
        this.vuelo = vuelo; 
    }

    // Métodos getter y setter
    public String getVuelo() {
        return vuelo;
    }
    
    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    // Implementación de los métodos abstractos
    @Override
    public void acelerar() {
        velocidad += 100; 
    }

    @Override
    public void frenar() {
        velocidad -= 50;      
    }

    // Método toString
    @Override
    public String toString() {
        return "Vuelo = " + this.vuelo + super.toString();
    }
}
