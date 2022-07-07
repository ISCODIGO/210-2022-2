package cap.pkg3;

import java.util.Scanner;

/**
 *
 * @author unah
 */
public class CalculadoraV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SUMA DE NUMEROS");
        System.out.print("Escriba el primer valor: ");
        String s1 = entrada.nextLine();
        double valor1 = Double.parseDouble(s1);
        System.out.print("Escriba el segundo valor: ");
        double valor2 = Double.parseDouble(entrada.nextLine());
        
        System.out.println("\nEl resultado es: " + (valor1 + valor2));
        
    }
}
