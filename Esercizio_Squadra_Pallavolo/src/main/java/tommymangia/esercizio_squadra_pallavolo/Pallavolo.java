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
    private int[] punteggi;
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
        punteggi = new int[22];
        this.partiteGiocate = 0;
        
        for (int i = 0; i < 22; i++){
            punteggi[i] = -1;
        }
    }
    
    public Pallavolo(Pallavolo p){
        this.nomeSquadra = p.nomeSquadra;
        this.partitaIva = p.partitaIva;
        this.punteggi = p.punteggi.clone();
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
    
    public void inserisciRisultato(int setVinti, int setPersi){
        
    }
    
    public String toString(){
        return "";
    }
}
