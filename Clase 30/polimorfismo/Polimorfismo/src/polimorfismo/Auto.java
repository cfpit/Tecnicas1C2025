public class Auto {
    //atributos
    private String marca;
    protected int velocidad;

    //constructores
    public Auto() {}

    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodos
    public void acelerar() {
        this.velocidad += 10;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", velocidad=" + velocidad + "]";
    }

}
