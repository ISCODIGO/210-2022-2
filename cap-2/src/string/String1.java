/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string;

/**
 *
 * @author unah
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String son inmutables
        String s = "hola mundo";
        
        // Estas dos instrucciones NO son equivalentes
        //s = "";  // cadena vacia
        //s = null;  // cadena nula
        
        System.out.println(s.length());
        
        String s1 = "hola";
        String s2 = "mundo";
        
        s1 = s1 + s2;
        System.out.println(s1);
        
        String s3 = "mundo";
        
        System.out.println("El resultado es: " + (10 + 1));
        
        String numero = "" + 10;
         
    }
    
}

/*

I   P -> Parentesis
II  E -> Exponente
---
III M -> Multiplicacion
III D -> Division
---
IV  A -> Adicion
IV  S -> Sustraccion


*/