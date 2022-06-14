/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package incremento;

/**
 *
 * @author unah
 */
public class Incremento {
    public static void main(String[] args) {
        int x = 10;
        
        System.out.println("Post-incremento");
        System.out.println(x++);
        System.out.println(x);
        
        int y = 10;
        System.out.println("Pre-incremento");
        System.out.println(++y);
        System.out.println(y);
        
        float z = 10.5f;
        System.out.println(++z);
        
    }
}
