import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero1, numero2, resultado;
        String operador;
        boolean realizarOtraOperacion = true;

        while (realizarOtraOperacion) {
            System.out.println("Ingrese un numero");
            numero1 = leer.nextInt();

            System.out.println("Ingrese un operador:\n 1- Suma (+) \n 2- Resta (-)\n 3- Multiplicación (x)\n 4- División (:)\n 5- Módulo (%)");
            operador = leer.next();

            System.out.println("Ingrese otro numero");
            numero2 = leer.nextInt();

            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    System.out.println("La suma es: " + resultado);
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    System.out.println("La resta es: " + resultado);
                    break;
                case "x":
                    resultado = numero1 * numero2;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case ":":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("La división es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case "%":
                    if (numero2 != 0) {
                        resultado = numero1 % numero2;
                        System.out.println("El módulo es: " + resultado);
                    } else {
                        System.out.println("No puede ser 0");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println("¿Desea realizar otra operación? (S/N)");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("N")) {
                realizarOtraOperacion = false;
            }
        }
    }
}
