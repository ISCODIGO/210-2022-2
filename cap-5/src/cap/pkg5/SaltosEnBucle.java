package cap.pkg5;

/**
 *
 * @author unah
 */
public class SaltosEnBucle {
    public static void main(String[] args) {        
        int j = 0;
        // Si j vale 42 que termine el bucle pero antes imprima FIN
        while (true) {
            j++;
            
            if (j % 7 == 0) {
                System.out.println("Divisibles por 7");
                continue;
            }

            if (j % 60 == 0) {                
                System.out.println("Divisibles por 60");
                break;
            }
            
            System.out.println(j);            
        }
        System.out.println("Final del bucle");
    }
}
