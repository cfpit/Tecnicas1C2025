public class App {
    public static void main(String[] args) throws Exception {
        //creo un objeto de la clase Avion
        Avion a = new Avion("ABC-123", 0);
        Bici b = new Bici(0, "26 pulgadas");

        //comportamiento de los objetos
        a.despegar();
        a.volar();
        // a.aterrizar();

        b.pedalear();

        //imprimo el estado de los objetos
        System.out.println("Avion: "+a);
        System.out.println("---------------");
        System.out.println("Bicicleta: "+b);
    }
}
