package cap.pkg8;

/**
 *
 * @author unah
 */
public class MainClock {
    public static void main(String[] args) {
        Clock c = new Clock(90, 10, 60);  // 00:00:00
        Clock r = new Clock();  // 00:00:00
        
        System.out.println("c -> " + c);
        
        System.out.println("c==r:" + (c==r));
        System.out.println("c.equals(r):" + (c.equals(r)));
        
        // copia superficial <- son el mismo objeto
        System.out.println("Copia superficial");
        Clock s = c;  // 0, 0, 0
        
        System.out.println("c==s:" + (c==s));
        s.setHora(5);  // 5, 0, 0
        
        System.out.println(c);
        System.out.println(s);
        
        
        
        // Esta es una copia profunda ya que no hay referencias compartidas
        System.out.println("Constructor por copia");
        Clock t = new Clock(c); // 5, 0, 0
        t.setMinutos(45);  // 5, 45, 0
        
        System.out.println(c);
        System.out.println(t);
        System.out.println("c.equals(t): " + (c.equals(t)));
        
        Clock u = new Clock();
        
        System.out.println("Cuantas instancias se crearon por medio de un constructor: " + Clock.instancias);
        
        
    }
}
