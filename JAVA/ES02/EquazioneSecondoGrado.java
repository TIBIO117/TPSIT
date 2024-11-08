public class EquazioneSecondoGrado {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Errore: devi fornire tre argomenti (a, b, c) per l'equazione di secondo grado.");
            return;
        }

        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Calcolo del discriminante (delta)
        int delta = b * b - 4 * a * c;

       
        if (delta > 0) {
            // Due soluzioni reali e distinte
            int x1 = (-b + (int) Math.sqrt(delta)) / (2 * a);
            int x2 = (-b - (int) Math.sqrt(delta)) / (2 * a);
            System.out.println("Le soluzioni sono reali e distinte:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Una sola soluzione reale
            int x = -b / (2 * a);
            System.out.println("La soluzione è reale e doppia:");
            System.out.println("x = " + x);
        } else {
            
            System.out.println("Non ci sono soluzioni reali.");
        }
    }
}
