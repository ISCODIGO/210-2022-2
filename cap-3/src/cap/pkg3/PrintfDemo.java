package cap.pkg3;

/**
 *
 * @author unah
 */
public class PrintfDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = Math.PI;
        
        
        System.out.println("El valor entero es: " + x + 
                " y el valor flotante es: " + y + 
                ".\nLa suma de estos es: " + (x+y));
        
        System.out.printf("El valor entero es: %d y el valor flotante es: %.2f%nLa suma de estos es: %e",
                x, y, x+y);
        
        
        
    }
}
