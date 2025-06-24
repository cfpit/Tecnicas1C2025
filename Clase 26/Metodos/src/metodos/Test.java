package metodos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        //creo un objeto de la clase Scanner para leer datos desde la consola
        Scanner lector = new Scanner(System.in);

        // Crear un objeto de de la clase CajaDeAhorro usando el constructor por defecto
        CajaDeAhorro caja1 = new CajaDeAhorro();
        CajaDeAhorro caja2 = new CajaDeAhorro(500.0, "EUR");
        
        //inicializar el estado del objeto
        caja1.saldo = 1000.0;
        caja1.moneda = "USD";

        // comportamiento de los objetos
        // Llamar al metodo informarSaldo para imprimir el saldo
        caja1.informarSaldo(); // Imprime: El saldo es: 1000.0 USD
        System.out.println("-----------------");
        caja2.informarSaldo(); // Imprime: El saldo es: 500.0 EUR

        System.out.println("-----------------");
        System.out.println("Deposito en caja1:");
        // Solicitar al usuario que ingrese un monto a depositar
        System.out.print("Ingrese el monto a depositar: ");
        //guardar el monto ingresado por teclado en una variable
        double monto = lector.nextDouble();
        // Llamar al metodo depositar para agregar el monto al saldo
        caja1.depositar(monto); // Imprime: Se ha depositado: [monto] USD
        // Informar el nuevo saldo
        caja1.informarSaldo(); // Imprime: El saldo es: [nuevo saldo] USD

        System.out.println("-----------------");
        System.out.println("Extraccion en caja1:");
        // Solicitar al usuario que ingrese un monto a extraer
        System.out.print("Ingrese el monto a extraer: ");
        //guardar el monto ingresado por teclado en una variable
        double montoExtraccion = lector.nextDouble();
        // Llamar al metodo extraer para intentar retirar el monto del saldo
        String resultado = caja1.extraer(montoExtraccion);
        // Imprimir el resultado de la extraccion
        System.out.println(resultado); // Imprime: Se ha retirado: [monto]
        // Informar el nuevo saldo
        caja1.informarSaldo(); // Imprime: El saldo es: [nuevo saldo] USD

        
    }
}
