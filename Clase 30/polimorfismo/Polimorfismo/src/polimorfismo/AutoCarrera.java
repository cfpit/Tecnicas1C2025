public class AutoCarrera extends Auto{
    //atributos
    private String tipoAleron;

    //constructores
    public AutoCarrera() {
        super();
    }

    public AutoCarrera(String marca, int velocidad, String tipoAleron) {
        super(marca, velocidad);
        this.tipoAleron = tipoAleron;
    }

    //getters y setters
    public String getTipoAleron() { 
        return tipoAleron; 
    }   

    public void setTipoAleron(String tipoAleron) { 
        this.tipoAleron = tipoAleron; 
    }

    //metodos
    @Override
    public String toString() {
        return "AutoCarrera [tipoAleron=" + tipoAleron + super.toString() + "]";
    }

    
    
    //aplico polimorfismo al metodo acelerar de la clase padre (Auto) 
    // para que el auto de carrera acelere 50 km/h en lugar de 10 km/h
    //en el polimorfismo la clase hija puede redefinir el cuerpo de un metodo 
    //de la clase padre
    @Override
    public void acelerar() {
        this.velocidad += 50; //acelera 50 km/h
    }
    

}
