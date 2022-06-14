/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author unah
 */
public class Literales {
    public static void main(String[] args) {
        byte valorByte;
        long valorLong;
        float valorFloat;
        
        // En el caso de los enteros es posible utilizar numeros dentro de los rangos
        valorByte = 60;
        //valorByte = 12000;  // este valor es superior al valor maximo 2^7 - 1
        // lo mismo pasa con los valores negativos
        valorByte = -60;
        //valorByte = -12000;
        
        // Los literales enteros son de tipo int. Lo que significa que no podemos usar literales superiores
        //valorLong = 4_000_000_000; // Puse _ como un separador de los digitos. Esto es posible en Java
        
        // Para usar literales mayores a los enteros usamos un sufijo (L)
        valorLong = 4_000_000_000L;
        
        // En el caso de los valores flotantes los literales son por defecto double
        //valorFloat = 3.14;  // No se puede convertir un double a float directamente
        // Usamos el sufijo F o f para convertir un literal a float
        valorFloat = 3.14f;
    }
}
