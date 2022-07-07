package cap.pkg3;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author unah
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        final String ruta = "src/files/append.txt";
        
        // Este permite agregar texto
        FileWriter fw = new FileWriter(ruta, true);
        fw.write("hola mundo\n");
        fw.write("Esta la clase de Programacion II");
        fw.close();
        
        
        // Este sobreescribe el archivo
        FileWriter fw2 = new FileWriter(ruta, false);
        fw2.write("Este lo agrego el append=false");
        fw2.close();
    }
}
