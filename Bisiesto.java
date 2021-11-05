import java.util.Scanner;//importamos la clase Scanner

/**
 * Clase Bisiesto Clase que calcula si un año ingresado por el usuario es
 * bisiesto.
 * 
 * @author Melissa Fernández
 * @version 1.0
 */

public class Bisiesto {
    /**
     * Método principal que utiliza condicionales para calcular si el año es
     * bisiesto o no.
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Scanner para leer el año ingresado por el usuario
        Scanner scan = new Scanner(System.in);
        // Indicar al usuario que ingrese el año
        System.out.print("***Bisiesto***\nIngresa el año del que deseas saber si es bisiesto o no: ");
        // Guardar el año ingresado por el usuario
        int año = scan.nextInt();

        // Si el año es bisiesto imprimir que es bisiesto
        // Si no lo es imprimir que no es bisiesto

        // Un año que es divisible entre 100 es un año bisiesto solo si también es
        // divisible entre 400.

        // Condicional para saber si el año es divisible entre 4
        if (año % 4 == 0) {
            // Condicional para saber si el año es divisible entre 100
            if (año % 100 == 0) {
                // Condicional para saber si el año es divisible entre 400
                if (año % 400 == 0) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else { // Si no es divisible entre 400
                    System.out.println("El año " + año + " no es bisiesto.");
                }
            } else { // Si no es divisible entre 100
                System.out.println("El año " + año + " es bisiesto.");
            }
        } else { // Si no es divisible entre 4
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}
