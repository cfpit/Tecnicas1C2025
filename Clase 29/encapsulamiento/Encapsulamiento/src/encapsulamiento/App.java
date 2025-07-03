package encapsulamiento;
public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Auto usando el constructor parametrizado
        Auto a = new Auto("Honda", 120);
        
        //le damos un comportamiento al auto
        a.acelerar(); // Acelera 10 km/h
        a.acelerar(15);//no deja acelerar porque la velocidad supera los 130 km/h

        // Mostrar estado del auto
        System.out.println(a);
    
    }
}
