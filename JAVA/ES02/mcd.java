import java.util.Scanner;

public class mcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();


        int mcd = calcolaMCD(numero1, numero2);

        
        System.out.println("Il Massimo Comune Divisore di " + numero1 + " e " + numero2 + " è: " + mcd);

        // Chiudi lo scanner
        scanner.close();
    }

    
    private static int calcolaMCD(int a, int b) {
        
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a; 
    }
}
