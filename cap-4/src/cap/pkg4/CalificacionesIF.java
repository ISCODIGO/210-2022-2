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
public class CalificacionesIF {

    public static void main(String[] args) {
        // Como lo hariamos usando switch
        System.out.println("Escriba la nota:");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        
        if (nota == 0) {
            System.out.println("No se presento");
        } else if (nota >= 1 && nota <= 29) {
            System.out.println("Abandono");
        } else if (nota >= 30 && nota <= 64) {
            System.out.println("Reprobado");
        } else if (nota >= 65) {
            System.out.println("Aprobado");
        }
    }
}
