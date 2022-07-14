package cap.pkg5;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class MenuDemo {

    /*   
    BOT
    1. Preguntar por el nombre del usuario
    2. Preguntar por el curso del usuario
    3. Saludar    
    4. Despedirse
    5. Salir      
    
    for: rango / while: condicion-evaluacion previa / do-while: condicion-evaluacion posterior
     */

    static Scanner scanner;
    static String nombre;
    static String curso;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nBOT");
            System.out.println("1. Preguntar por el nombre del usuario");
            System.out.println("2. Preguntar por el curso del usuario");
            System.out.println("3. Saludar");
            System.out.println("4. Despedirse");
            System.out.println("5. Salir");
            System.out.print("Escriba una opcion (1 al 5): ");
            opcion = scanner.nextLine();
            System.out.println("\n");

            switch (opcion) {
                case "1" -> preguntarNombre();
                case "2" -> preguntarCurso();
                case "3" -> saludar();
                case "4" -> despedir();
                case "5" -> {
                    System.out.println("Saliendo del menu...");
                }
                default -> {
                    System.out.println("La opcion no es valida");
                }
            }
        } while (!opcion.equals("5"));
    }

    public static void preguntarNombre() {
        System.out.print("\nEscriba su nombre: ");
        nombre = scanner.nextLine();
    }

    public static void preguntarCurso() {
        System.out.print("\nEscriba el curso: ");
        curso = scanner.nextLine();
    }
    
    public static void saludar() {
        if (nombre != null) {
            System.out.printf("Hola %s, saludos%n", nombre);
        }
        
        if (curso != null) {
            System.out.println("Espero la pases bien en tu curso de " + curso);
        }
    }
    
    public static void despedir() {
        System.out.println("Nos vemos pronto...");
    }
}
