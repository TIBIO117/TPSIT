/**
Creare la classe Frazione. 
Implementare i metodi sottrai, moltiplica e dividi. 
Compilare e testare 

 */

 public class frazione {
    // Attributi
    private int numeratore;
    private int denominatore;
    

    public frazione(int num, int den) {
        numeratore = num;
        denominatore = den;
    }
    
    // Metodi
    public int getNumeratore() {
        return numeratore;
    }
    
    public int getDenominatore() {
        return denominatore;
    }
    
    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }
    
    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }
    
    public frazione somma(frazione f) {
        int num = numeratore * f.denominatore + f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new frazione(num, den);
    }
      
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    
    public static void main(String[] args) {
        frazione f1 = new frazione(1, 2);
        frazione f2 = new frazione(1, 3);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f1 + f2 = " + f1.somma(f2));
    }
}