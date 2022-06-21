package scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class NextLineDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba una frase (termina con ENTER): ");
        String frase = scan.nextLine();
        
        System.out.println("\nLa frase es: " + frase);
        

        

    }
}
