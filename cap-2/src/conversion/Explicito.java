/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author unah
 */
public class Explicito {
    public static void main(String[] args) {
        boolean valorBoolean;
        byte valorByte;
        short valorShort;
        char valorChar;
        int valorInt;
        long valorLong;
        float valorFloat;
        double valorDouble;

        
        valorDouble = 3.141592653;
        valorFloat = (float) valorDouble;
        
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
        
        valorInt = (int) valorFloat;
        System.out.println("int: " + valorInt);
        
        // El valor maximo de un Byte es:
        System.out.println("byte maximo: " + Byte.MAX_VALUE);
        valorByte = (byte) 128;
        
        System.out.println("byte (128 int): " + valorByte);
        
        valorByte = (byte) -129;
        System.out.println("byte (-129 int): " + valorByte);
        
        // El esquema general de conversion explicita es:
        // TIPO_A varTipoA = (TIPO_A) varTipoB;
        
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
