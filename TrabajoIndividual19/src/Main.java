import java.util.Scanner;
/**

 * Trabajo individual 19

 * @author: Bastián Luis Antonio Góngora Barrera

 * @version: 26/06/2023/

 *

 */
public class Main {

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        char[] caracteres = texto.toCharArray();

        System.out.println("\nLetras encontradas en la cadena:");

        int[] conteoLetras = new int[26];

        for (char c : caracteres) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                int index = c - 'a';
                conteoLetras[index]++;
                System.out.print(c);
            }
        }

        System.out.println("\n\nConteo de letras del abecedario:");

        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';
            System.out.print(c + ": " + conteoLetras[index]+"\t");
        }

        System.out.print("\n¿Desea ingresar otra cadena? (s/n): ");
        String opcion = scanner.nextLine();

        if (!opcion.equalsIgnoreCase("s")) {
            continuar = false;
        }
    }
 }
}
