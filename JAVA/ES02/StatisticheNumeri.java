public class StatisticheNumeri {
    public static void main(String[] args) {
        // Verifica che siano stati passati degli argomenti
        if (args.length == 0) {
            System.out.println("Nessun numero fornito.");
            return;
        }

        // Variabili per calcolare la somma, il massimo e il minimo
        float somma = 0;
        float massimo = Float.NEGATIVE_INFINITY;
        float minimo = Float.POSITIVE_INFINITY;

        // Itera su tutti gli argomenti passati da linea di comando
        for (String arg : args) {
            // Converte ogni argomento in un numero reale (float)
            float numero = Float.parseFloat(arg); // Supponiamo che gli argomenti siano sempre numeri validi

            // Somma del numero
            somma += numero;

            // Calcolo del massimo
            if (numero > massimo) {
                massimo = numero;
            }

            // Calcolo del minimo
            if (numero < minimo) {
                minimo = numero;
            }
        }

        // Calcola la media
        float media = somma / args.length;

        // Stampa i risultati
        System.out.println("Somma dei numeri: " + somma);
        System.out.println("Media aritmetica: " + media);
        System.out.println("Numero massimo: " + massimo);
        System.out.println("Numero minimo: " + minimo);
    }
}
