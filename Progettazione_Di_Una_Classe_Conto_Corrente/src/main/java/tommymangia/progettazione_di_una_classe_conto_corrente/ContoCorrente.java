package tommymangia.progettazione_di_una_classe_conto_corrente;

import java.time.LocalDate;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private double saldo;
    private String[] movimenti;
    private LocalDate[] dateMovimenti;
    private int indiceMovimento;

    public ContoCorrente() {
        this("Mario", "Rossi", 6700.69);
    }

    
    public ContoCorrente(String nome, String cognome, double saldo) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
        this.movimenti = new String[10];
        this.dateMovimenti = new LocalDate[10];
        this.indiceMovimento = 0;
    }

    public ContoCorrente(ContoCorrente conto) {
        this.nome = conto.nome;
        this.cognome = conto.cognome;
        this.saldo = conto.saldo;
        this.indiceMovimento = conto.indiceMovimento;
        this.movimenti = new String[conto.movimenti.length];
        this.dateMovimenti = new LocalDate[conto.dateMovimenti.length];
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String[] getMovimenti() {
        return movimenti;
    }

    public int getIndiceMovimento() {
        return indiceMovimento;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMovimenti(String[] movimenti) {
        if (movimenti.length == this.movimenti.length) {
            this.movimenti = movimenti;
        }
    }

    public void setIndiceMovimento(int indiceMovimento) {
        if (indiceMovimento >= 0 && indiceMovimento < movimenti.length) {
            this.indiceMovimento = indiceMovimento;
        }
    }

    // Operazioni
    public void versa(double importo) {
        if (importo > 0) {
            saldo += importo;
            aggiungiMovimento("Versamento di: " + importo + "€");
        }
    }

    public boolean prelieva(double importo) {
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;
            aggiungiMovimento("Prelievo di: " + importo + "€");
            return true;
        }
        return false;
    }

    private void aggiungiMovimento(String movimento) {
        movimenti[indiceMovimento] = movimento;
        dateMovimenti[indiceMovimento] = LocalDate.now();
        indiceMovimento = (indiceMovimento + 1) % movimenti.length;
    }

    public void visualizzaMovimenti() {
        System.out.println("Ultimi movimenti:");
        boolean haMovimenti = false;
        for (int i = 0; i < movimenti.length; i++) {
            String movimento = movimenti[(indiceMovimento + i) % movimenti.length];
            LocalDate data = dateMovimenti[(indiceMovimento + i) % movimenti.length];
            if (movimento != null) {
                if (data != null){
                    System.out.println(data + " - " + movimento);
                    haMovimenti = true;
                } else{
                    System.out.println(data + " - " + "Nessun movimento");
                }
            }
        }
        if (!haMovimenti) {
            System.out.println("Nessun movimento registrato.");
        }
        System.out.println();
    }

    public void visualizzaDettagli() {
        System.out.println("Correntista: " + nome + " " + cognome);
        System.out.printf("Saldo attuale: %.2f€\n\n", saldo);
    }
    
    public String movimentiMesi(){
        LocalDate oggi = LocalDate.now();
        String response = "Lista movimenti: \n";
        
        for (int c = 0; c < 10; c++){
            if (dateMovimenti[c] != null && dateMovimenti[c].getYear() == oggi.getYear() && dateMovimenti[c].getMonth() == oggi.getMonth()){
                System.out.println();
            }
        }
        return "a";
    }
}