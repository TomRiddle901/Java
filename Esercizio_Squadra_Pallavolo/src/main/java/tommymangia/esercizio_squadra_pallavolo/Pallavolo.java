/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_squadra_pallavolo;

/**
 *
 * @author tommaso
 */
public class Pallavolo {
    // Attributi
    private String nomeSquadra;
    private String partitaIva;
    private int[] risultati;
    private int partiteGiocate;
    private int partiteVinte;
    private int partitePerse;
    
    // Costruttori
    public Pallavolo(){
        this.nomeSquadra = "SquadraDefault";
        this.partitaIva = "IVA";
        this.partiteGiocate = 0;
    }
    
    public Pallavolo(String nome, String iva){
        this.nomeSquadra = nome;
        this.partitaIva = iva;
        risultati = new int[22];
        this.partiteGiocate = 0;
        
        for (int i = 0; i < 22; i++){
            risultati[i] = -1;
        }
    }
    
    public Pallavolo(Pallavolo p){
        this.nomeSquadra = p.nomeSquadra;
        this.partitaIva = p.partitaIva;
        this.risultati = p.risultati.clone();
        this.partiteGiocate = p.partiteGiocate;
    }
    
    // Metodi
  
    // Getter
    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public String getPartitaIva() {
        return partitaIva;
    }
   
    public int getPunteggioTotale(){
        return 0;
    }
    
    public int getPartitePerse(){
        return 0;
    }
    
    public int getPartiteGiocate(){
        return partiteGiocate;
    }
    
    // Setter

    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }
    
    public void inserisciRisultato(int setVinti, int setPersi, boolean tie){
        for (int i = 0; i < this.risultati.length; i++){
            if (risultati[i] != -1){
                if (setVinti > setPersi && tie){
                    risultati[i] = 2;
                    partiteVinte++;
                } else if (setVinti < setPersi && tie){
                    risultati[i] = 1;
                    partitePerse++;
                } else if (setVinti > setPersi) {
                    risultati[i] = 3;
                    partiteVinte++;
                } else if (setVinti < setPersi){
                    risultati[i] = 0;
                    partitePerse++;
                }
                System.out.println("Punteggi aggiornati!");
                partiteGiocate++;
            } else {
                System.out.println("Limite punteggi raggiunto!");
            }
        }
    }
    
    public String toString(){
        String stampa;
        stampa = "Nome Squadra: " + nomeSquadra + "\nPartita Iva: " + partitaIva + "\nRisultati:\n";
        
        for (int i = 0; i < partiteGiocate; i++){
            stampa += risultati[i] + "\n";
        }
        return stampa + "Partite Vinte: " + partiteVinte + " Partite Perse: " + partitePerse;
    }
}