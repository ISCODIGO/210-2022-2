package pkg.principal;

import pkg.hn.edu.unah.Main;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class Principal {
    public static void main(String[] args) {
        // Un llamado a dos clases creadas por el usuario
        System.out.println(Main.PI);
        System.out.println(pkg.Main.EULER);
        
        Main.mensaje();
        
        // Clase de la Libreria Estandar de Java
        Scanner teclado = new Scanner(System.in);
        
        String mensaje = "Hola mundo";
        
        /*System.out.print("Escriba un entero:");
        int x = teclado.nextInt();
        System.out.println("El numero que escribio fue: " + x);*/
        
        System.out.print("Escriba una palabra: ");
        String palabra = teclado.next();
        System.out.println("\nLa palabra que escribio fue: " + palabra);
        
        System.out.print("Escriba otra palabra: ");
        String otraPalabra = teclado.next();
        System.out.println("\nLa otra palabra que escribio fue: " + otraPalabra);
    }
}
