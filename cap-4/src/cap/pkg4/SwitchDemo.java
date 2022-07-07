package cap.pkg4;


import java.util.Scanner;
/**
 *
 * @author unah
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String entrada = scanner.nextLine();
        
        switch(entrada) 
        {
            case "hola":
                System.out.println("Es un saludo");
                break;
            case "adios":
                System.out.println("Es una despedida");
                break;
            default:
                System.out.println("Termino desconocido");
        }
    }
}
