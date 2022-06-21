package scanner;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class StringToInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Podriamos obtener de un String un numero?
        System.out.print("Escriba un numero entero: ");
        String posibleNumero = scan.nextLine(); // No es relevante a menos que se deseen capturar varios numeros
        int numero = Integer.parseInt(posibleNumero);
        System.out.println(numero);
    }
}
