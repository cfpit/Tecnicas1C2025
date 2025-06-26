package sobrecarga;

public class Auto {
    // atributos
    public String marca;
    public double precio;
    public int velocidad;

    // constructor por defecto
    public Auto() {}

    // constructor con parámetros
    public Auto(String marca, double precio, int velocidad) {
        this.marca = marca;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    //metodos
    //Para que haya sobrecarga de metodos debe existir métodos con el mismo nombre pero diferente número o tipo de parámetros
    // método para acelerar el auto sin sobrecarga
    public void acelerar() {
        this.velocidad += 10;
    }

    //metodo para acelerar el auto con sobrecarga
    public void acelerar(int km) {
        this.velocidad += km;
    }

    // método para acelerar el auto con sobrecarga con 2 parametros
    public void acelerar(int km, boolean turbo) {
        if (turbo) {
            this.velocidad += km * 2; // si está en modo turbo, duplica la velocidad
        } else {
            this.velocidad += km; // si no, solo suma la velocidad
        }
    }
    
    public void acelerar(boolean turbo, int km) {
        if (turbo) {
            this.velocidad += km * 2; // si está en modo turbo, duplica la velocidad
        } else {
            this.velocidad += km; // si no, solo suma la velocidad
        }
    }

    //metodo para frenar el auto sin sobrecarga
    public void frenar() {
        this.velocidad -= 10;
    }

    //metodo para frenar el auto con sobrecarga
    public void frenar(int km) {
        this.velocidad -= km;
    }   
    

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", precio=" + precio + ", velocidad=" + velocidad + "]";
    }

    

    


}


