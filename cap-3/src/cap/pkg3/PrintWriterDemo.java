package cap.pkg3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author unah
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        final String ruta = "src/files/printwriter.txt";
        PrintWriter pw = new PrintWriter(ruta);
        int x = 10;
        int y = 20;
        pw.printf("%d + %d = %d", x, y, x + y);
        pw.close();
        
        pw = new PrintWriter(ruta);
        x = 4;
        y = 5;
        pw.printf("%d + %d = %d", x, y, x + y);
        System.out.printf("%d + %d = %d", x, y, x + y);
        pw.close();
    }
}
