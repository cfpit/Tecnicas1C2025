public class Bici extends Vehiculo {
    // atributos
    private String rodado;

    // constructores
    public Bici() {
        super();
    }
    
    public Bici(int velocidad, String rodado) {
        super(velocidad);
        this.rodado = rodado;
    }

    // getters y setters
    public String getRodado() {
        return rodado;
    }
    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    // metodos
    public void pedalear() {
        System.out.println("La bicicleta está pedaleando.");
        acelerar(10);
    }

    @Override
    public String toString() {
        return "Rodado=" + this.rodado + super.toString();
    }

}
