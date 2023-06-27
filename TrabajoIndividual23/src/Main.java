import java.util.Scanner;
/**

 * Trabajo individual 23

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

     StringBuilder resultado = new StringBuilder();

     for (int i = 0; i < texto.length(); i++) {
         char c = texto.charAt(i);

         if (Character.isLowerCase(c)) {
             resultado.append(Character.toUpperCase(c));
         } else if (Character.isUpperCase(c)) {
             resultado.append(Character.toLowerCase(c));
         } else if (Character.isWhitespace(c) || Character.isDigit(c)) {
             resultado.append(c);
         }
     }

     System.out.println("El texcto Ingresado: " + texto +" / Resultado: "+ resultado.toString());


         System.out.print("¿Desea ingresar otro texto? (s/n): ");
         String opcion = scanner.nextLine();

         if (!opcion.equalsIgnoreCase("s")) {
             continuar = false;
         }
   }
 }
}
