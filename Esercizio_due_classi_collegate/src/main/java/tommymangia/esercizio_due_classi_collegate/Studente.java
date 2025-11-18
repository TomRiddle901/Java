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
    private int matricola;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private char sesso;
    private static double costoOffertaFormativa;
    private Valutazione[] valutazioni;
    
    // Costruttori
    public Studente(){
        matricola = 0;
        nome = "NomeDefault";
        cognome = "CognomeDefault";
        sesso = 'F';
        dataNascita = LocalDate.of(2025, 11, 18);
        valutazioni = new Valutazione[100];
        costoOffertaFormativa = 10.99;
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
    
    // Metodi
    
    // Getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public char getSesso() {
        return sesso;
    }

    public int getMatricola() {
        return matricola;
    }
    
    // Setter
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }
}
