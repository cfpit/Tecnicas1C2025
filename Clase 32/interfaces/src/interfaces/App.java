package interfaces; 

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Gerente
        Gerente g = new Gerente(2000000, 5);
        Administrativo a = new Administrativo(10000, 160);
        
        // Calcular el sueldo del gerente
        g.calcularSueldo();
        // Calcular el sueldo del administrativo
        a.calcularSueldo();
        
        // Imprimir información del gerente
        System.out.println(g.toString());
        // Imprimir información del administrativo
        System.out.println(a.toString());
        
        
    }
}
