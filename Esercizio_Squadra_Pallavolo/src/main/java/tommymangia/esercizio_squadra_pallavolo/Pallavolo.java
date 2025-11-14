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
    
    // Costruttori
    public Pallavolo(){
        this.nomeSquadra = "SquadraDefault";
        this.partitaIva = "IVA";
    }
    
    public Pallavolo(String nome, String iva){
        this.nomeSquadra = nome;
        this.partitaIva = iva;
        risultati = new int[22];
        
        for (int i = 0; i < 22; i++){
            risultati[i] = -1;
        }
    }
    
    public Pallavolo(Pallavolo p){
        this.nomeSquadra = p.nomeSquadra;
        this.partitaIva = p.partitaIva;
        this.risultati = p.risultati.clone();
    }
    
    // Metodi
  
    // Getter
    public String getNomeSquadra() {
        return this.nomeSquadra;
    }

    public String getPartitaIva() {
        return this.partitaIva;
    }
   
    public int getPunteggioTotale(){
        int punteggiTotali = 0;
        
        for (int i = 0; i < 22; i++){
            if (risultati[i] != -1){
                punteggiTotali += risultati[i];
            }
        }
        return punteggiTotali;
    }
    
    public int getPartitePerse(){
        int partitePerse = 0;
        
        for (int i = 0; i < 22; i++){
            if (risultati[i] != -1){
                if (risultati[i] == 0 || risultati[i] == 1){
                    partitePerse++;
                }
            }
        }
        return partitePerse;
    }
    
    public int getPartiteGiocate(){
        int partiteGiocate = 0;
        
        for (int i = 0; i < 22; i++){
            if (risultati[i] != -1){
                partiteGiocate++;
            }
        }
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
        if (scorriPosizioni() != -1){
            if (setVinti > setPersi && setVinti + setPersi == 5){
                risultati[scorriPosizioni()] = 2;
                System.out.println("Punteggi aggiornati!");
            } else if (setVinti < setPersi && setVinti + setPersi == 5){
                risultati[scorriPosizioni()] = 1;
                System.out.println("Punteggi aggiornati!");
            } else if (setVinti > setPersi){
                risultati[scorriPosizioni()] = 3;
                System.out.println("Punteggi aggiornati!");
            } else if (setVinti < setPersi){
                risultati[scorriPosizioni()] = 0;
                System.out.println("Punteggi aggiornati!");
            } else {
                System.out.println("Limite punteggi raggiunto!");
            }
        }
    }
    
    public String toString(){
        String stampa;
        int partiteVinte = 0;
        int partitePerse = 0;
        
        stampa = "Nome Squadra: " + nomeSquadra + "\nPartita Iva: " + partitaIva + "\nRisultati:\n";
        
        for (int i = 0; i < 22; i++){
            if (risultati[i] != -1){
                stampa += risultati[i] + "\n";  
                if (risultati[i] == 0 || risultati[i] == 1){
                    partitePerse ++;
                } else{
                    partiteVinte++;
                }
            }
        }
        return stampa + "Partite Vinte: " + partiteVinte + "\nPartite Perse: " + partitePerse;
    }
    
    private int scorriPosizioni(){
        for (int i = 0; i < 22; i++){
            if (risultati[i] == -1){
                return i;
            }
        }
        
        return -1;
    }
}