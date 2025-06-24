package metodos;

public class CajaDeAhorro {
    
    // atributos
    public double saldo;
    public String moneda;
    
    // constructor vacio o por defecto
    public CajaDeAhorro() {}

    
    // constructor parametrizado
    //este constructor sobrecarga al primero con 1 parametro
    public CajaDeAhorro(double saldo) {
        this.saldo = saldo;
    }

    // constructor parametrizado
    //este constructor sobrecarga al primero con 2 parametros
    public CajaDeAhorro(double saldo, String moneda) {
        this.saldo = saldo;
        this.moneda = moneda;
    }

    //metodos
    // metodo para informar el saldo
    // este metodo no recibe parametros y no devuelve nada
    // imprime el saldo y la moneda en la consola
    // es un metodo procedimiento porque no devuelve valores 
    public void informarSaldo() {
        System.out.println("El saldo es: " + this.saldo + " " + this.moneda);
    }

    // metodo para depositar dinero
    // este metodo recibe un parametro de tipo double(monto) y no devuelve nada
    //(metodo procedimiento)
    public void depositar(double monto) {
            this.saldo += monto;
            System.out.println("Se ha depositado: " + monto + " " + this.moneda);
    }

    // metodo para retirar dinero
    // este metodo recibe un parametro de tipo double(monto) y devuelve "OK" si se pudo retirar o "Saldo insuficiente" si no se pudo retirar
    //es un metodo funcion porque devuelve un valor de tipo cadena(String)
    public String extraer(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            return "Se ha retirado: " + monto + " " + this.moneda;
        } else {
            return "Saldo insuficiente";
        }
    }

    

}
