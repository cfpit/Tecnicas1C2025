package encapsulamiento;

public class Auto {
    //atributos
    private String marca;
    private int velocidad;

    //constructor por defecto
    public Auto() {}

    //constructor con parametros
    public Auto(String marca, int velocidad) {
        this.setMarca(marca);
        this.setVelocidad(velocidad);
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        //regla de negocio: la marca debe ser Toyota u Honda.
        if (marca.equalsIgnoreCase("Toyota") || marca.equalsIgnoreCase("Honda")) {
            this.marca = marca;
        } else {
            System.out.println("La marca debe ser Toyota o Honda");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        //regla de negocio: la velocidad debe estar entre 0 y 130 km/h.
        if (velocidad >= 0 && velocidad <= 130) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad debe estar entre 0 y 130 km/h");
        }
    }

    //metodos
    public void acelerar() {
        this.setVelocidad(velocidad + 10);
    }

    //metodo acelerar sobrecargado
    public void acelerar(int km) {
        this.setVelocidad(velocidad + km);
    }
    
    public void frenar() {
        this.setVelocidad(velocidad - 5);
    }

    //metodo frenar sobrecargado
    public void frenar(int km) {
        this.setVelocidad(velocidad - km);
    }
    

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", velocidad=" + velocidad + "]";
    }

    

    
    



}
