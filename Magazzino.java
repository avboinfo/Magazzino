
import java.io.*;
import java.util.*;

class Magazzino {

    final int MAX = 1000;
    int count;
    String nome;
    Prodotto[] anag;
    
    public Magazzino( String nome ) {
        this.nome = nome;
        count = 0;
        anag = new Prodotto[MAX];
        loadFromFile( nome + ".csv" );
    }
    
    public void add( Prodotto p ) {
        if ( count<MAX ) anag[count++] = p;
    }

    private void loadFromFile( String filename ) {
        try {
            File f = new File( filename );
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while ( sc.hasNextLine() ) {
                String line = sc.nextLine();
                String[] ss = line.split(";");
                if (ss.length!=4) continue;
                add( new Prodotto( ss[0], ss[1], ss[2], Double.parseDouble(ss[3]) ) );
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
    }        
    
    
}