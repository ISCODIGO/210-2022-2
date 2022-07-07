/*

Dada una nota (calificacion) decidir una salida especifica
0 -         No se presento
1 - 29      Abandono
30 - 64     Reprobacion
65 - 100    Aprobacion

 */
package cap.pkg4;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class CalificacionesSwitch {

    public static void main(String[] args) {
        // Como lo hariamos usando switch
        System.out.println("Escriba la nota:");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        int reducido = nota / 10;

        System.out.println("Nota final: " + nota);

        int residuo = nota % 10;
        
        if (reducido == 0 && residuo > 0) {
            reducido = 1;
        }

        if (reducido == 6 && residuo > 4) {
            reducido = 7;
        }

        switch (reducido) {
            case 0 -> System.out.println("No se presento");
            case 1, 2 -> System.out.println("Abandono");
            case 3, 4, 5, 6 -> System.out.println("Reprobo");
            case 7, 8, 9, 10 -> System.out.println("Aprobo");
            default -> System.out.println("Opcion invalida");
        }
    }
}
