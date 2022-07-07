package cap.pkg3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class ScannerFileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        final String ruta = "src/files/numeros.txt";
        Scanner scanner = new Scanner(new FileReader(ruta));
        System.out.println("Hay un siguiente entero? " + scanner.hasNextInt());
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(n1 + n2 + n3);
    }
}
