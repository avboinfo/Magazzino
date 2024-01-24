

class Prodotto {
    
    String codice, descrizione, um;
    double prezzo;
    double giacenza;
    
    public Prodotto( String codice, String descrizione, String um, double prezzo ) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.um = um;
        this.prezzo = prezzo;
        giacenza = 0;
    }
    
    public void setGiacenza( double giacenza ) {
        this.giacenza = giacenza;
    }
 
    public String toString() {
        return "Sono " + descrizione + " e costo " + prezzo + " euro al " + um;
    }   
    
    
    
}