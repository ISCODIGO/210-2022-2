package scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Escriba una frase (termina con ENTER): ");
        String frase = scan.nextLine();
        
        // Podria obtener las palabras de una frase?
        String[] palabras = frase.split(" ");
        System.out.println("Palabras: " + Arrays.toString(palabras));
        
        // Podria obtener los caracteres de una frase?
        char[] caracteres = frase.toCharArray();
        System.out.println("Caracteres: " + Arrays.toString(caracteres));
    }
}
