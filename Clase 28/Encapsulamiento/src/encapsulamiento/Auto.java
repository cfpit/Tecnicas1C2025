package encapsulamiento;

public class Auto {
    // atributos
    public String marca;
    public String modelo;
    private int velocidad;

    // constructores
    public Auto() {
    }

    public Auto(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // getters y setters
    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        //regla de negocio: la velocidad no puede ser negativa
        //ni superar los 130 km/h
        if (velocidad >= 0 && velocidad <= 130) {
            this.velocidad = velocidad;
        } else  {
            System.out.println("velocidad no válida");
        }
    }


    // métodos
    public void acelerar() {
        this.velocidad += 10;
    }

    public void acelerar(int km) {
        this.velocidad += km;
    }

    public void frenar() {
        this.velocidad -= 5;
    }

    public void frenar(int km) {
        this.velocidad -= km;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
    }

    

}
