/**
 * Clase CicloFor Clase que imprime todos los números primos entre 0 y 1000
 * 
 * @author Melissa Fernández
 * @version 1.0
 */

public class CicloFor {
    /**
     * Método principal donde se ejecutan los ciclos for para determinar cuáles son
     * los números primos de 0 a 1000
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Contador para saber cuántos números primos hay de 0 a 1000
        int contador = 0;
        // Ciclo for que toma el número que queremos verificar. El número
        // va de 2 a 999 e incrementa de 1 en 1
        for (int numero = 2; numero < 1000; numero++) {
            // esPrimo: booleano que inicia con true
            boolean esPrimo = true;
            // Ciclo for para tomar a los posibles divisores
            for (int divisor = 2; divisor <= numero / 2; divisor++) {
                // Condicional para ver si el número tiene divisores
                if (numero % divisor == 0) {
                    esPrimo = false; // Si el número tiene algún divisor, esPrimo cambia a false
                }
            }
            // Condicional que verifica si esPrimo se mantiene en true
            if (esPrimo) {
                System.out.print(numero + " "); // Si esPrimo se mantiene en tru, imprimir el número
                contador++;// Si el número es primo, el contador aumenta 1
            }
        }
        // Imprimir cuántos números primos hay de 0 a 1000 usando el contador
        System.out.println("\nHay " + contador + " números primos entre el 0 y el 1000.");
    }
}