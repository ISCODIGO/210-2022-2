package scanner;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class NextChar {
    public static void main(String[] args) {
        // No existe el nextChar pero es posible obtener un char
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba una letra: ");
        String entrada = scan.next();
        char letra = entrada.charAt(0);
        System.out.println("\nLa primera letra es: " + letra);
    }
}
