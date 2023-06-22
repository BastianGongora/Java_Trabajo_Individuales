import java.util.Scanner;

public class ControlUsuario {
    public static void main(String[] args) {
        System.out.println("La contraseña es 123");
        String contraseña = "123";
        int contador=1;
        boolean contraseñaCorrecta = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        contraseña = leer.nextLine();
        if (contraseña.equals("123")) {
            System.out.println("La clave ingresada es correcta");
            contraseñaCorrecta = true;
        }else {

            while (contador < 3) {
                contador = contador + 1;
                System.out.println("Contraseña incorrecta");
                System.out.println("Intentos para ingresar la contraseña correcta:"+ (4 - contador));
                System.out.println("Ingrese su contraseña: ");
                contraseña = leer.nextLine();
                if (contraseña.equals("123")) {
                    System.out.println("La clave ingresada es correcta");
                    contraseñaCorrecta = true;
                    break;
                }
            }
            if (!contraseñaCorrecta) {
                System.out.println("Se acabaron los intentos para ingresar la contraseña correcta");
            }
        }
    }
}
