import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "";

        while (frase.isEmpty()) {
            System.out.println("Ingrese una frase: ");
            frase = leer.nextLine();
        }

        int vocales = 0;
        int consonantes = 0;

        for (int n = 0; n < frase.length(); n++) {
            char c = frase.charAt(n);
            if (Character.isLetter(c)) {
                if (esVocal(c)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
