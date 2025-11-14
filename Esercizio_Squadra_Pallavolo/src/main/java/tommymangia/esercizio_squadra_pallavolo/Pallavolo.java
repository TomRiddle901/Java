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
    
    // Costruttori
    public Pallavolo(){
        this.nomeSquadra = "SquadraDefault";
        this.partitaIva = "IVA";
        this.partiteGiocate = 0;
    }
    
    public Pallavolo(String nome, String iva){
        this.nomeSquadra = nome;
        this.partitaIva = iva;
        punteggi = new int[20];
        this.partiteGiocate = 0;
    }
    
    public Pallavolo(Pallavolo p){
        this.nomeSquadra = p.nomeSquadra;
        this.partitaIva = p.partitaIva;
        this.punteggi = p.punteggi.clone();
        this.partiteGiocate = p.partiteGiocate;
    }
}
