/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap.pkg4;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class Cap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        System.out.println("Un solo camino");
        // Un solo camino
        if (x > 5) {
            System.out.println("x es mayor que 5");
        }
        
        System.out.println("Bifurcacion...");
        // Bifurcacion
        if (x > 5) {
            System.out.println("x es mayor que 5");
        } else {
            System.out.println("x es menor o igual que 5");
        }
        
    }
    
}
