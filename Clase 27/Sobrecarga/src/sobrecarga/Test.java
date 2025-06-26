package sobrecarga;
public class Test {
    public static void main(String[] args) throws Exception {
        // Crear un objeto de la clase Auto con el constructor por defecto
        Auto auto1 = new Auto();

        // inicializar el estado del auto1
        auto1.marca = "Toyota";
        auto1.precio = 20000.0;
        auto1.velocidad = 0;

        //comportamiento del auto1
        auto1.acelerar(); // 0 --> 10
        auto1.acelerar(20); // 10 --> 30
        auto1.acelerar(10, true); // 30 --> 50 (modo turbo)
        auto1.acelerar(15, false);// 50 --> 65 (sin turbo)
        auto1.frenar(); // 65 --> 55
        auto1.frenar(20); // 55 --> 35

        // Mostrar el estado del auto1
        // System.out.println("Auto1: " + auto1.toString());
        System.out.println("Auto1: " + auto1);
    }
}
