package cap.pkg3;

import java.util.Arrays;

/**
 *
 * @author unah
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hola mundo";
        String s2 = "hola mundo";
        String s3 = new String("hola mundo");
        
        // dos objetos tienen la misma direccion de memoria almacenada
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        // dos objetos tienen los mismos valores
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // Formas para dividir un String en sus caracteres
        // Metodo 1: charAt
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(s1.length() - 1));
        
        // Metodo 2: toCharArray
        char[] caracteres = s1.toCharArray();
        System.out.println(Arrays.toString(caracteres));
        
        // Metodo 3: substring
        System.out.println("substring primeras 3 letra = " + s1.substring(0, 3));
        System.out.println("substring ultima letra = " + s1.substring(s1.length()-1));
    }
}

