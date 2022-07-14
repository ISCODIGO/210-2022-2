/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author unah
 */
public class TipoIF {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un numero:");
        int x = Integer.parseInt(reader.readLine());
        
        System.out.println("Leer una cadena:");
        String s = reader.readLine();
        
        System.out.println("Leer un caracter:");
        char c = (char)reader.read();
                
        
        System.out.println("c: " + c + " s: " + s);
        
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
        
        System.out.println("Varios caminos...");
        
        if (x == 5) {
            System.out.println("x es igual a 5");
        } else if (x > 5) {
            System.out.println("x es mayor que 5");
        } else {
            System.out.println("x es menor que 5");
        }
        
    }
    
}
