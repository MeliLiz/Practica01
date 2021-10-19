import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("***Condicionales*** \nDame el número 1: ");
        int num1 = scan.nextInt();
        System.out.print("Dame el número 2: ");
        int num2 = scan.nextInt();

        if (num1 >= num2) {
            System.out.println("El número con mayor valor es: " + num1);
        } else {
            System.out.println("El número con mayor valor es: " + num2);
        }
    }
}