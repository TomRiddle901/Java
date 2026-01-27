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
public class Dipendente {
    // Attributi
    protected String codice;
    protected String nome;
    protected String cognome;
    protected LocalDate dataAssunzione;
    protected double stipendioBaseAssunzione;
    
    // Costruttori
    public Dipendente(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBaseAssunzione){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.dataAssunzione = dataAssunzione;
        this.stipendioBaseAssunzione = stipendioBaseAssunzione;
    }
}
