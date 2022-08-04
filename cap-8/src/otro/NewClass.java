package otro;

import java.net.URL;

/**
 *
 * @author unah
 */
public class NewClass {
    public static void main(String[] args) {
        NewClass n = new NewClass();
        String t = n.getClass().getSimpleName();
        String s = NewClass.class.getSimpleName() + ".class";
        URL u = NewClass.class.getResource("Demo.java");
        System.out.println(u);
    }
}
