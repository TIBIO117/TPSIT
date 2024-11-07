public class StatisticheNumeri {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nessun numero fornito.");
            return;
        }

        float somma = 0;
        float massimo = Float.NEGATIVE_INFINITY;
        float minimo = Float.POSITIVE_INFINITY;

       
        for (String arg : args) {
            float numero = Float.parseFloat(arg); 
            
            somma += numero;

            if (numero > massimo) {
                massimo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }
        
        float media = somma / args.length;

        System.out.println("Somma dei numeri: " + somma);
        System.out.println("Media aritmetica: " + media);
        System.out.println("Numero massimo: " + massimo);
        System.out.println("Numero minimo: " + minimo);
    }
}
