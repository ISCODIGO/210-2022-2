package cap.pkg5;

/**
 *
 * @author unah
 */
public class SaltosEnBucle {
    public static void main(String[] args) {        
        int j = 0;
        while (true) {
            j++;
            
            if (j % 7 == 0) {
                System.out.println("Divisibles por 7");
                // El continue impide ejecutar lo que esta abajo: imprimir el numero
                continue;  
            }

            if (j % 60 == 0) {                
                System.out.println("Divisibles por 60");
                // El break hace que el bucle finalice.
                break;
            }
            
            System.out.println(j);            
        }
        System.out.println("Final del bucle");
    }
}
