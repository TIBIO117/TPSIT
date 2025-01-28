class Veicolo {
    private String marca= "Fiat";
    private String modello="Cinquecento";

    public void stampaDettagli(){
        System.out.println("la marca è: "+ marca);
        System.out.println("il modello è: "+ modello);
    }
    
} 
public class VeicoloMain {
    public static void main(String[]args) {
        Veicolo oggetto = new Veicolo();
        oggetto.stampaDettagli();
    }
}