package arrays;

public class Test {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Dado el vector inflación [0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3,
         * 0.2, 0.9]
         * Cada ítem del vector representa la inflación de un mes de tal manera que el
         * primer ítem del vector que es 0.8 representa la inflación de Enero, y el
         * último ítem del vector que es 0.9 representa la inflación de diciembre.
         * 
         * Se pide:
         * a- Informar la inflación anual
         * b- Informar la inflación más baja, junto con el número de mes. Por ejemplo:
         * Mes 2 = 0.1
         * c- Informar la inflación más alta, junto con el número de mes. Por ejemplo:
         * Mes 12 = 0.9
         * d- Informar el promedio de inflación (inflación total / 12)
         * 
         */
        double[] infla = { 0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9 };
        double suma = 0;
        double menor = infla[0];
        double mayor = infla[0];
        int mesMenor = 0;
        int mesMayor = 0;

        for (int i = 0; i < infla.length; i++) {
            //totalizo el array
            suma = suma + infla[i];

            //obtengo el minimo junto con el mes
            if (infla[i] < menor) {
                menor = infla[i];
                mesMenor = i + 1; // + 1 porque el array empieza en 0
            }

            //obtengo el maximo junto con el mes
            if (infla[i] > mayor) {
                mayor = infla[i];
                mesMayor = i + 1; 
            }
        }

        //informo el resultado
        System.out.println("La inflacion anual es: " + suma);
        System.out.println("La inflacion mas baja es: " + menor + " del mes " + mesMenor);
        System.out.println("La inflacion mas alta es: " + mayor + " del mes " + mesMayor);
        System.out.println("El promedio de inflacion es: " + (suma / infla.length));
    }
}
