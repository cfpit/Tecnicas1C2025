package encapsulamiento;

public class Test {
    public static void main(String[] args) throws Exception {
        // Crear un objeto de la clase Auto
        Auto a1 = new Auto();

        //inicializo el estado del objeto
        a1.marca = "Toyota";
        a1.modelo = "Corolla";
        // a1.velocidad = 500000;//no se puede acceder a un atributo privado de otra clase
        
        // Usar el setter para establecer la velocidad
        // a1.setVelocidad(500000); // No cumple con regla de negocio
        a1.setVelocidad(110); 
        // Usar el método getter para obtener la velocidad
        System.out.println("Velocidad inicial: " + a1.getVelocidad() + " km/h");

        // Mostrar el estado del objeto
        System.out.println(a1);
    }
}
