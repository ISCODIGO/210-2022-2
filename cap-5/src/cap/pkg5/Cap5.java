/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap.pkg5;

/**
 *
 * @author unah
 */
public class Cap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = sumar(2, 3);
        System.out.print("La suma es:");
        System.out.println(resultado);
        
        Cap5 objeto = new Cap5();
        int resultado2 = objeto.restar(1, 2);
        System.out.print("La resta es:");
        System.out.println(resultado2);
    }   
    
    // utilizando static para generar una funcion
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
}
