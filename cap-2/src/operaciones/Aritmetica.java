/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author unah
 */
public class Aritmetica {
    public static void main(String[] args) {
        int x = 100;
        int y = 3;
        
        System.out.println( (float)x / y );
        System.out.println( x / (double)y );
        
        float c = (float)x / y;
        System.out.println(c + 0.000002f);
        
        double d = (double)x / y;
        System.out.println(d + 0.000002);
        
        System.out.println(0.000008f + 0.000002f);
        
        System.out.println( 3 + 2 * 4 / 2 );
        
        char caracter = 'ȃ';
        System.out.println((int)caracter);
        
        
        char caracter2 = 65;
        System.out.println(caracter2);
        
        
        
    }
}

/*

<------------------|-----------------|---------->
                33.333332       33.333336

*/