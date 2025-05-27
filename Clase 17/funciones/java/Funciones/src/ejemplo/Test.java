package ejemplo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        // defino un objeto de la clase Scanner para leer
        // los valores ingresados por teclado
        Scanner lector = new Scanner(System.in);
        

        // ingreso por teclado de los valores a sumar
        System.out.println("Ingrese el primer valor a sumar: ");
        double valor1 = lector.nextDouble();
        System.out.println("Ingrese el segundo valor a sumar: ");
        double valor2 = lector.nextDouble();

        // invoco el metodo sumar de la clase Test
        // forma 1
        // sumar(valor1, valor2);

        // forma 2
        double resultado = sumar(valor1, valor2);
        System.out.println("El resultado de la suma es: " + resultado);

    }// fin metodo main

    
    //forma 1
	//defino metodo sumar que no dvuelve valor sino q muestra la suma
    // public static void sumar(double a, double b) {
    //     System.out.println("n1 + n2 = " + (a + b));
    // }
    
    //forma 2
	// defino un metodo sumar que recibe dos decimales y retorna la suma
    public static double sumar(double a, double b) {
        return (a + b);
    }
}// fin de la clase Test
