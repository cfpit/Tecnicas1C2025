package objetos;

public class Auto {
    //atributos
    public String marca;
    public String modelo;
    public int precio;

    //constructor por defecto
    //aunque no lo codifique, igualmente existe
    public Auto() {}

    //constructor con parametros
    public Auto(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    

    //metodo informar que muestra el estado del objeto
    public void informar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
    
}
