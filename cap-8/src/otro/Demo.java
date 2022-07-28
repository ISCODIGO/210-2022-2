package otro;

import cap.pkg8.Circulo;

/**
 *
 * @author unah
 */
public class Demo {
    public static void main(String[] args) {
        Circulo c = new Circulo(0, 0, 10);
        System.out.printf("Area: %.2f unidades cuadradas%n", c.area());
        System.out.printf("Perimetro: %.2f unidades%n", c.perimetro());
    }
}
