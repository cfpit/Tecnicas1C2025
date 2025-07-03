package herencia;
public class App {
    public static void main(String[] args) throws Exception {
        //crear un vehiculo
        Vehiculo vehiculo = new Vehiculo(120);
        
        // Crear un objeto de la clase Avion
        Avion avion = new Avion(600, "Vuelo 123", 180);
        
        //imprimir el objeto Vehiculo
        System.out.println(vehiculo);
        
        // Imprimir el objeto Avion
        System.out.println(avion);
        
    }
}
