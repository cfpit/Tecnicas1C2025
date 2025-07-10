public class Bici extends Vehiculo {
    private String rodado;

    // Constructores
    public Bici() {
        super(); // Llama al constructor de la clase padre Vehiculo
    }
    public Bici(int velocidad, String rodado) {
        super(velocidad); 
        this.rodado = rodado; 
    }
    // Métodos getter y setter
    public String getRodado() {
        return rodado;
    }
    public void setRodado(String rodado) {
        this.rodado = rodado;
    }
    // Implementación de los métodos abstractos
    @Override
    public void acelerar() {
        velocidad += 10; 
    }
    @Override
    public void frenar() {
        velocidad -= 5; 
    }

    // Método toString
    @Override
    public String toString() {
        return "Rodado = " + this.rodado + super.toString();
    }
}
