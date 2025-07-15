package interfaces;

public class Gerente implements Empleado{
    // Atributos
    private int sueldoBase;
    private int antiguedad;

    // Constructores
    public Gerente() {}
    
    public Gerente(int sueldoBase, int antiguedad) {
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }


    // Getters y Setters
    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    // Implementación del método de la interface Empleado
    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo del gerente: " + (sueldoBase + (sueldoBase * antiguedad * 0.05)));
        
    }

    @Override
    public String toString() {
        return "Gerente [sueldoBase=" + sueldoBase + ", antiguedad=" + antiguedad + "]";
    }

    

}
