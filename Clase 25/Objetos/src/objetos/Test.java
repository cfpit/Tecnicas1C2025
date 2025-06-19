package objetos;

public class Test {
    public static void main(String[] args) throws Exception {
        // Crear un objeto de tipo Auto
        //Auto() es el metodo constructor de la clase
        //el constructor permite crear un objeto de esta clase
        //new Auto() es el objeto q se guarda en la variable a1
        //la variable a1 es de tipo Auto, o sea, admite un solo objeto de la clase Auto a la vez
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto("Ford", "Focus", 18000);
        
        
        // Asignar valores a los atributos del objeto
        //(inicializar el objeto, o sea, darle un estado inicial)
        a1.marca = "Toyota";
        a1.modelo = "Corolla";
        a1.precio = 20000;
        
        //Comportamiento del objeto
        // Llamar al método informar para mostrar el estado del objeto
        a1.informar();
        System.out.println("---------------------");
        a2.informar();
        System.out.println("---------------------");
        a3.informar();
    }
}
