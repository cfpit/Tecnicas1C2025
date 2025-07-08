public class Avion extends Vehiculo {
    //atributos
    private String vuelo;

    //constructores
    public Avion() {
        //invoco al constructor de la clase padre Vehiculo
        super();
    }

    public Avion(String vuelo) {
        this.vuelo = vuelo;
    }

    public Avion(String vuelo, int velocidad) {
        // invoco al constructor parametrizado de la clase padre Vehiculo
        super(velocidad);

        this.vuelo = vuelo;
    }

    //getters y setters
    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    //metodos
    public void despegar() {
        System.out.println("El avión está despegando.");
        acelerar(300); 
    }
    
    public void volar() {
        System.out.println("El avión está volando.");
        velocidad = 800;
    }

    public void aterrizar() {
        System.out.println("El avión está aterrizando.");
        velocidad = 300;
    }

    @Override
    public String toString() {
        return "vuelo=" + vuelo + super.toString();
    }


}
