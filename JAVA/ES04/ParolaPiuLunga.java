import java.util.Scanner;

public class ParolaPiuLunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();

        String[] parole = frase.split(" ");
        String parolaPiuLunga = "";

        for (String parola : parole) {
            if (parola.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = parola;
            }
        }

        System.out.println("La parola più lunga è: " + parolaPiuLunga);
        scanner.close();
    }
}
