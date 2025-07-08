public class App {
    public static void main(String[] args) throws Exception {
        //creo un auto y un auto de carrera
        Auto a = new Auto("Toyota", 0);
        AutoCarrera ac = new AutoCarrera("Ferrari", 0, "titanio");

        //comportamiento
        a.acelerar();
        ac.acelerar();

        //imprimo el estado de los objetos
        System.out.println(a);
        System.out.println(ac);
    }
}
