/**

 * Trabajo individual 25

 * @author: Bastián Luis Antonio Góngora Barrera

 * @version: 26/06/2023/

 *

 */
public class Main {
    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Juanito", "Gonzalez", "12345678-9", "+123456789", 30);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(trabajador1.toString());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Retorna nombre y apellido.");
        System.out.println("Nombre completo: " + trabajador1.nombreCompleto());
        System.out.println("Retorna todo lo que esta antes del guion y del dígito verificador.");
        System.out.println("Parte del RUT: " + trabajador1.descomponerRut());
    }
}
