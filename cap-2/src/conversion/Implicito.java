/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

/**
 *
 * @author unah
 */
public class Implicito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean valorBoolean;
        byte valorByte;
        short valorShort;
        char valorChar;
        int valorInt;
        long valorLong;
        float valorFloat;
        double valorDouble;
        
        // Vamos a revisar las conversiones implicitas
        valorInt = 10;
        
        // Los booleanos no se pueden transformar directamente a numeros y viceversa
        //valorBoolean = valorInt;  // Se descarta por tipos incompatibles
        
        // En estos casos es porque son tipos de datos con menor tamano que int
        //valorByte = valorInt;  
        //valorShort = valorInt;
        //valorChar = valorInt;
        
        valorLong = valorInt;  // Este si es posible debido a que los tamanos coresponden
        // Con flotantes pasan
        valorFloat = valorInt;
        valorDouble = valorInt;
        
        // Hay un caso especial donde 2 tipos del mismo tamano
        valorChar = 'a';
        // short tiene la mitad de valores negativos mientras que char son todos positivos
        // significa que no son compatibles a pesar de tener ambos 16 bits
        // valorShort = valorChar;
        
        valorInt = valorChar; // En este caso es posible colocar un caracter como numero
        
        // Hay otro caso interesante
        valorFloat = valorLong; // float tiene 32 bits pero long 64
        
        // finalmente estan los flotantes
        //valorFloat = valorDouble;  // no es posible ya que float tiene 32 bits y double 64
        valorDouble = valorFloat;

        // Probar casos especificos del tipo char: todos son explicitos
        valorByte = 10;
        valorShort = 10;
        valorChar = (char) valorByte;
        valorChar = (char) valorShort;
        valorByte = (byte) valorChar;
        valorShort = (short) valorChar;
        
        
    }
    
}
