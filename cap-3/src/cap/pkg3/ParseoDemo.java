package cap.pkg3;

/**
 *
 * @author unah
 */
public class ParseoDemo {
    public static void main(String[] args) {
        // primitivos -> primitivos: casting (explicita), coercion (implicita)
        // primitivo -> String: "" + primitivo, String.valueOf(primitivo)
        int x = 10;
        String s = String.valueOf(x);
        System.out.println(s);
        
        // String -> primitivo: parseo
        int y = Integer.parseInt(s);
        int z = Integer.valueOf(s); // String -> Integer -> int
        
        y++;
        z++;
        System.out.println(y);
        System.out.println(z);
        
        int a = (Integer) 10;
        
        // Un variable con un primitivo entero
        int b = 10;        
        
        // Objeto de un entero
        Integer i = 10;        
        
    }
}
