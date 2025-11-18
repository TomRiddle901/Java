/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_due_classi_collegate;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author tommaso
 */
public class Studente {
    // Attributi
    int matricola;
    String nome;
    String cognome;
    LocalDate dataNascita;
    char sesso;
    static double costoOffertaFormativa;
    Valutazione[] valutazioni;
    
    // Costruttori
    public Studente(){
        matricola = 0;
        nome = "NomeDefault";
        cognome = "CognomeDefault";
        sesso = 'F';
        dataNascita = LocalDate.of(2025, 11, 18);
        valutazioni = new Valutazione[100];
    }
    
    public Studente(int matricola, String nome, String cognome, LocalDate dataNascita, char sesso){
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.valutazioni = new Valutazione[100];
    }
    
    public Studente(Studente s){
        this.matricola = s.matricola;
        this.nome = s.nome;
        this.cognome = s.cognome;
        this.dataNascita = s.dataNascita;
        this.sesso = s.sesso;
        this.valutazioni = s.valutazioni.clone();
    }
}
