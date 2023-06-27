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
     String tx = scanner.nextLine();

     StringBuilder rs = new StringBuilder();

     for (int i = 0; i < tx.length(); i++) {
         char c = tx.charAt(i);

         if (Character.isLowerCase(c)) {
             rs.append(Character.toUpperCase(c));
         } else if (Character.isUpperCase(c)) {
             rs.append(Character.toLowerCase(c));
         } else if (Character.isWhitespace(c) || Character.isDigit(c)) {
             rs.append(c);
         }
     }

     System.out.println("El texcto Ingresado: " + tx +" / Resultado: "+ rs.toString());


         System.out.print("¿Desea ingresar otro texto? (s/n): ");
         String opcion = scanner.nextLine();

         if (!opcion.equalsIgnoreCase("s")) {
             continuar = false;
         }
   }
 }
}
