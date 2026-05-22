package tommymangia.progettazione_di_una_classe_conto_corrente;

import java.time.LocalDate;

public class MainProgram {
    public static void main(String[] args) {
        // Creazione del primo conto
        ContoCorrente conto1 = new ContoCorrente("Mario", "Rossi", 20000.99);

        // Copia del conto
        ContoCorrente conto2 = new ContoCorrente(conto1);

        // Operazioni sul primo conto
        conto1.versa(200.23);
        conto1.prelieva(0.23);
        conto1.prelieva(300);

        ContoCorrente conto3 = new ContoCorrente(conto1);
        // Stampa dettagli e movimenti del primo conto
        System.out.println("Dettagli Conto 1:");
        conto1.visualizzaDettagli();
        conto1.visualizzaMovimenti();

        System.out.println("Dettagli Conto 2 (copia):");
        conto2.visualizzaDettagli();
        conto2.visualizzaMovimenti();
        
        System.out.println("Dettagli Conto 3 (copia):");
        conto3.visualizzaDettagli();
        conto3.visualizzaMovimenti();
    }
}