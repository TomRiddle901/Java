/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_2;

import java.time.LocalTime;

/**
 *
 * @author tommaso
 */
public class Sim {
    // Attributi
    private String nome;
    private String cognome;
    private String numeroTelefono;
    private Chiamate[] listaTelefonate;
    private float credito;
    
    // Costruttori
    public Sim(String nome, String cognome, String numeroTelefono, float credito) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        listaTelefonate = new Chiamate[100];
    }
    
    public boolean inserisciTelefonata(String numeroChiamato, LocalTime durataChiamata){
        int i = 0;
        
        while (i < 100 && listaTelefonate[i] != null){
            i++;
        }
        
        if (i < 100){
            listaTelefonate[i] = new Chiamate(numeroChiamato, durataChiamata);
            return true;
        } else{
            return false;
        }
        
    }
    
    public String toString(){
        String output;
        
        output = "Nome utente: " + nome + "\nCognome utente: " + cognome + "\nNumero di telefono: " + numeroTelefono +
                 "\nCredito: €" + credito + "\nLista chiamate effettuate:" + "\nNumero di telefono     Durata chiamata";
        
        for (int i = 0; i < 100; i++){
            if (listaTelefonate[i] != null){
                output += "\n" + listaTelefonate[i].toString();
            }
        }
        
        return output;
    }
    
    public LocalTime tempoConversazioneTotale(){
        int i = 0;
        LocalTime durataTotale = LocalTime.of(0, 0, 0);
        
        while (listaTelefonate[i] != null && i < 100){
            durataTotale = durataTotale.plusSeconds(listaTelefonate[i].getDurata().getSecond());
            durataTotale = durataTotale.plusMinutes(listaTelefonate[i].getDurata().getMinute());
            durataTotale = durataTotale.plusHours(listaTelefonate[i].getDurata().getHour());
            i++;
        }

        return durataTotale;
    }
    
    public LocalTime tempoConversazioneUtente(String numero){
        LocalTime durata = LocalTime.of(0, 0, 0);
        int i = 0;
        
        while (listaTelefonate[i] != null && i < 100){
            if (listaTelefonate[i].getNumeroChiamato().equals(numero)){
                durata = durata.plusSeconds(listaTelefonate[i].getDurata().getSecond());
                durata = durata.plusMinutes(listaTelefonate[i].getDurata().getMinute());
                durata = durata.plusHours(listaTelefonate[i].getDurata().getHour());
            }
            
            i++;
        }
        
        return durata;
    }
}