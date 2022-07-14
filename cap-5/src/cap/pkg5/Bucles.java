/*
Generar los numeros del 1 al 100

bucles -> repeticion -> un conjunto de instrucciones se ejecutan muchas veces
*/
package cap.pkg5;

/**
 *
 * @author unah
 */
public class Bucles {
    public static void main(String[] args) {
        // for: cuando sabemos el valor inicial y el final
        // for (inicializacion; condicion (boolean); pasos)
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        // while: repetir hasta que la condicion sea false
        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }
        
        // do-while: repetir hasta que la condicion sea false. Pero si la 
        // condicion es false al inicio al menos una vez ejecutara el bucle
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while(k <= 100);
    }
}
