/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author unah
 */
public class NextDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba su primer nombre: ");
        String nombre = scan.next();
        
        // Es posible utilizar nextLine para limpiar tokens
        //scan.nextLine();
        System.out.println(Arrays.toString(scan.tokens().toArray()));
        
        System.out.print("Escriba su primer apellido: ");
        String apellido = scan.next();
        System.out.println("");
        
        System.out.println("Usted se llama... " + nombre + " " + apellido);
    }
}
