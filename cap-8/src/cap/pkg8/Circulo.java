
package cap.pkg8;

/**
 *
 * @author unah
 */
public class Circulo {
    /*
    ATRIBUTOS
    Java los atributos quedan ocultos -> private
    */
    
    // Este atributo pertenece a la clase ->  static
    private static int cantidad;
    
    // Estos atributos pertenecen al objeto -> no-static
    private double radio;
    // Punto de origen
    private int x;
    private int y;
    
    
    /*    
    FUNCIONES / METODOS / COMPORTAMIENTO    
    Normalmente tienen las siguientes operaciones:
        - Constructores: Construir objetos (atiende al evento de creacion)
        - Destructores: Destruir objetos (atiende al evento de destruccion)
        - Modificar atributos (SETTER)
        - Lectura de atributos (GETTER)
        - Iterar
    
    El nivel de ocultamiento (frecuente) -> public
    */
    
    // Constructor
    // 1. Se llama igual que la clase
    // 2. No tiene ningun tipo de retorno, ni siquiera void
    public Circulo(int x, int y, double radio) {
        // this -> referencia al propio objeto
        this.radio = radio;
        this.x = x;
        this.y = y;        
    }
    
    // Otro constructor: es una sobrecarga de funciones
    public Circulo(double radio) {
        this.radio = radio;
        this.x = 0;
        this.y = 0;
    }
    
    
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro() {
        return 2.0 * Math.PI * radio;
    }
    
    // setter / mutadores
    // 1. tipo void
    // 2. pide al menos un parametro
    // 3. inician con la frase [set]
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    // getter / selector
    // 1. tipo de retorno es el mismo que el tipo del atributo
    // 2. por lo general, no tienen parametros
    // 3. por lo general, deberia concluir con un return
    // 4. inician con la palabra [get]
    public double getRadio() {
        return radio;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
}
