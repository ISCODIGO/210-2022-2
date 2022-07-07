package cap.pkg3;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class ScannerStringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("ASCII stands");
   
        System.out.println("Ocurre la primera lectura");
        String palabra1 = scanner.next();
   
        System.out.println(palabra1);
        
        // Pregunto si hay un segundo token
        System.out.println("Hay un segundo token? " + scanner.hasNext());
        System.out.println("Hay un segundo token (entero)? " + scanner.hasNextInt());
        
        // Ocurre la segunda lectura
        System.out.println("Ocurre la segunda lectura");
        scanner.next();
       
        // Pregunto si hay un tercer token
        System.out.println("Hay un tercer token? " + scanner.hasNext());
        
    }
}
