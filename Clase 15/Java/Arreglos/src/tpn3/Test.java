package tpn3;
public class Test {
    public static void main(String[] args) throws Exception {
        // Dado el vector [10, 20, 5, 15, 30, 20]
        // a-	Informar el vector de la forma: "Índice: X, Valor: Y"
        // b-	Totalizar el vector e informar el total
        // c-	Informar el mayor número
        // d-	Informar cuántas veces aparece el número 20
        // e-	Utilizar un unico for para resolver los incisos a, b, c y d
        
        int [] vector = {10, 20, 5, 15, 30, 20};  
        int total = 0;
        int mayor = vector[0];
        int contador20 = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + vector[i]);

            //totalizo el vector
            total = total + vector[i];// total += vector[i];

            //obtengo el maximo
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            
            //obtengo apariciones del 20
            if (vector[i] == 20) {
                contador20++;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Mayor: " + mayor);
        System.out.println("Apariciones del nro. 20: " + contador20);

    }
}
