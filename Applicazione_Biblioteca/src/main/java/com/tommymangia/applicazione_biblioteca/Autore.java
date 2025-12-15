/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.applicazione_biblioteca;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Autore {
    // Attributi
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private LocalDate dataMorte;
    private char sesso;
    
    // Costruttori
    public Autore(String nome, String cognome, LocalDate dataNascita, LocalDate dataMorte, char sesso){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.dataMorte = dataMorte;
        this.sesso = sesso;
    }
    
    // Metodi
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setDataMorte(LocalDate dataMorte) {
        this.dataMorte = dataMorte;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }
    
}
