/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_ricettario;
import java.time.LocalTime;

/**
 *
 * @author tommaso
 */
public class Ricetta {
    // Attributi
    private String nomeRicetta;
    private LocalTime tempoPreparazione;
    private String descrizionePreparazione;
    private Ingrediente[] ingredienti;
    private String pathImmagine;
    
    // Costruttore
    public Ricetta(String nome, LocalTime tempoPreparazione){
        this.nomeRicetta = nome;
        this.tempoPreparazione = tempoPreparazione;
        ingredienti = new Ingrediente[64];
        pathImmagine = null;
        descrizionePreparazione = null;
    }
}
