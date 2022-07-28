package cap.pkg8;

/**
 *
 * @author unah
 */
public class ClaseDemo {

    @Override
    public String toString() {
        return "Esto es un objeto de ClaseDemo";
    }
    
    
    public static void main(String[] args) {
        // Este constructor es por defecto, porque no existe en nuestra clase
        ClaseDemo x = new ClaseDemo();
        System.out.println(x);
    }
}
