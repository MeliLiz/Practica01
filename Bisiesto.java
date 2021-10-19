import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("***Bisiesto***\nIngresa el año del que deseas saber si es bisiesto o no: ");
        int año = scan.nextInt();
        // un año que es divisible entre 100 es un año bisiesto solo si también es
        // divisible entre 400.
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else {
                    System.out.println("El año " + año + " no es bisiesto.");
                }
            } else {
                System.out.println("El año " + año + " es bisiesto.");
            }
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}