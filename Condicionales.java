import java.util.Scanner; //importamos la clase Scanner

/**
 * Clase Condicionales Clase para determinar cuál de dos números es mayor
 * 
 * @author Melissa
 * @version 1.0
 */

public class Condicionales {
    /**
     * Método principal donde se ejecuta el condicional para determinar cuál número
     * es mayor
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Se utiliza un Scanner para que el usuario ingrese los dos números
        Scanner scan = new Scanner(System.in);
        // Indicar al usuario que ingrese el primer número
        System.out.print("***Condicionales*** \nDame el número 1: ");
        // Guardar el primer número que ingresa el usuario
        int num1 = scan.nextInt();
        // Indicar al usuario que ingrese el segundo número
        System.out.print("Dame el número 2: ");
        // Guardar el segundo número que ingresa el usuario
        int num2 = scan.nextInt();

        // Con el if else comparamos los números ingreados por el usuario
        // y se imprime el número mayor.
        if (num1 >= num2) {
            System.out.println("El número con mayor valor es: " + num1);
        } else {
            System.out.println("El número con mayor valor es: " + num2);
        }
    }
}
