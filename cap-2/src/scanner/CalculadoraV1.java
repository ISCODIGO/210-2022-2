package scanner;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class CalculadoraV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SUMA DE NUMEROS");
        System.out.print("Escriba 2 enteros [separados por un espacio]: ");
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        
        System.out.println("\nEl resultado es: " + (valor1 + valor2));
        
    }
}
