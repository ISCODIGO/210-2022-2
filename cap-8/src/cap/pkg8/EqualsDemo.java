package cap.pkg8;

/**
 *
 * @author unah
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String s = "hola";
        String t = new String("hola");
        
        
        System.out.println("Operador == => " + (s == t));
        System.out.println("Funcion equals => " + s.equals(t));
        
        System.out.println("t -> " + t);
        System.out.println("s -> " + s);
    }
}


/*

Stack
--------
201 = s:301
202 = t:302


Heap
--------
301 = "hola"
302 = "hola"




*/