public class App {
    public static void main(String[] args) throws Exception {
        //intento crear un objeto de tipo Vehiculo
        // Esto no se puede hacer porque Vehiculo es clase abstracta
        //Vehiculo v = new Vehiculo(); 

        // Crear un objeto de tipo Bici
        Bici b = new Bici(20, "26 pulgadas");
        b.acelerar(); // 20 --> 30
        System.out.println(b); 

        // Crear un objeto de tipo Avion
        Avion a = new Avion(300, "Vuelo 123");
        a.acelerar(); // 300 --> 400
        System.out.println(a); 

    }
}
