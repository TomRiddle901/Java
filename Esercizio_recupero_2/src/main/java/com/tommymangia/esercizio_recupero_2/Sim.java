/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_2;

/**
 *
 * @author tommaso
 */
public class Sim {
    // Attributi
    private String nome;
    private String cognome;
    private String numeroTelefono;
    private String[] listaTelefonate;
    private float credito;
    
    // Costruttori
    public Sim(String nome, String cognome, String numeroTelefono, float credito) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        listaTelefonate = new String[100];
    }
    
    public boolean inserisciTelefonata(String numeroChiamato){
        int i = 0;
        
        while (i < 100 && listaTelefonate[i] != null){
            i++;
        }
        
        if (i < 100){
            listaTelefonate[i] = numeroChiamato;
            return true;
        } else{
            return false;
        }
    }
    
    public String toString(){
        String output;
        
        output = "Nome utente: " + nome + "\nCognome utente: " + cognome + "\nNumero di telefono: " + numeroTelefono +
                 "\nCredito: €" + credito + "\nLista chiamate effettuate:";
        
        for (int i = 0; i < 100; i++){
            if (listaTelefonate[i] != null){
                output += "\n" + listaTelefonate[i];
            }
        }
        
        return output;
    }
}
