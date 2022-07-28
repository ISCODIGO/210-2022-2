package cap.pkg8;

/**
 *
 * @author unah
 */
public class MainCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo(10);
        c.setRadio(20);
        System.out.printf("Area: %.2f unidades cuadradas%n", c.area());
        System.out.printf("Perimetro: %.2f unidades%n", c.perimetro());
    }
}

/*

            objeto      package        otros(fuera del package)
public          x           x          x
private         x
protected       x           x
~               x           x


*/
