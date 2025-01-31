/*Crea una classe base Forma con i seguenti attributi e metodi:
Attributi: nome (una stringa che descrive il tipo di forma, ad esempio "Cerchio", "Rettangolo").
Metodi:
calcolaArea(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
calcolaPerimetro(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
descrizione(): stampa il nome della forma. */

class Forma {
        
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public String Descrizione() {
        System.out.println("forma: "+ nome);
        return null;
    }
}
