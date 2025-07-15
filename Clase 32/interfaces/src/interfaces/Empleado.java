package interfaces;

public interface Empleado {
    //la interface contiene un contrato
    //contrato: es un conjunto de metodos abstractos
    //que deben ser implementados por las clases que la implementen
    //el contrato indica que comportamiento debe tener la clase 
    //que implemente la interface pero no indica como se debe implementar
    //la interface no puede tener atributos, solo constantes


    // public String metodo1();
    // public void metodo2();
    // public int metodo3();

    public void calcularSueldo();
}
