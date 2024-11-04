import java.util.Scanner;

public class LunghezzaStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String input = scanner.nextLine();

        int lunghezza = input.length();
        System.out.println("La lunghezza della stringa è: " + lunghezza);
        
        scanner.close();
    }
}
