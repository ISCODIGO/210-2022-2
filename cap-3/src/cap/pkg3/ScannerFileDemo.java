package cap.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class ScannerFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        final String ruta = "src/files/numeros.txt";
        Scanner scanner = new Scanner(new File(ruta));
        System.out.println("Hay un siguiente entero? " + scanner.hasNextInt());
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        System.out.println(n1 + n2 + n3);
    }
}
