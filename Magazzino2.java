
import java.util.*;
import java.io.*;

class Magazzino2 {

    final int MAX = 1000;
    // int count;
    String nome;
    ArrayList<Prodotto> anag;
    
    public Magazzino2( String nome ) {
        this.nome = nome;
        // count = 0;
        anag = new ArrayList<>();
        loadFromFile( nome + ".csv" );
    }
    
    /*
    public void add( Prodotto p ) {
        if ( count<MAX ) anag[count++] = p;
    }
    */

    private void loadFromFile( String filename ) {
        try {
            File f = new File( filename );
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while ( sc.hasNextLine() ) {
                String line = sc.nextLine();
                String[] ss = line.split(";");
                if (ss.length!=4) continue;
                anag.add( new Prodotto( ss[0], ss[1], ss[2], Double.parseDouble(ss[3]) ) );
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
    }        
    
    public String toString() {
        String s = "Anagrafica del magazzino " + nome + "\n";
        for (int i=0; i<anag.size(); i++) {
            s += anag.get(i) + "\n";
        }
        return s;
    }
    
}