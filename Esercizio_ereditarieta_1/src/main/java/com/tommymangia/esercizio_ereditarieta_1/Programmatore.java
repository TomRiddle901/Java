/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_ereditarieta_1;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Programmatore extends Dipendente{
    // Attributi
    private String[] linguaggiProgrammazione;
    
    // Costruttore
    public Programmatore(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBaseAssunzione) {
        super(codice, nome, cognome, dataAssunzione, stipendioBaseAssunzione);
        linguaggiProgrammazione = new String[20];
    }
    
    // Metodi
    public boolean aggiungiLinguaggioProgrammazione(String linguaggio){
        int i = 0;
        
        while(i < 20 && linguaggiProgrammazione != null){
            i++;
        }
        
        if (i < 20){
            linguaggiProgrammazione[i] = linguaggio;
            return true;
        } else{
            return false;
        }
    }
    
    public double calcolaStipendio(){
        double stipendio = stipendioBaseAssunzione;
        int anniServizio = LocalDate.now().getYear() - dataAssunzione.getYear();
        int blocchiAnni = 0;
        
        if (LocalDate.now().getMonthValue() < dataAssunzione.getMonthValue() || 
                (LocalDate.now().getMonthValue() == dataAssunzione.getMonthValue() && 
                    LocalDate.now().getDayOfMonth() < dataAssunzione.getDayOfMonth())){
            anniServizio--;
        }
        
        blocchiAnni = anniServizio / 5;
        
        stipendio += stipendioBaseAssunzione * 0.01 * blocchiAnni;
        
        return stipendio;
    }
}