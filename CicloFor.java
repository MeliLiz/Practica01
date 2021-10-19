public class CicloFor {
    public static void main(String[] args) {
        int contador = 0;
        for (int numero = 2; numero < 1000; numero++) {
            boolean esPrimo = true;
            for (int divisor = 2; divisor <= numero / 2; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }
        }
        System.out.println("\nHay " + contador + " números primos entre el 0 y el 1000.");
    }
}