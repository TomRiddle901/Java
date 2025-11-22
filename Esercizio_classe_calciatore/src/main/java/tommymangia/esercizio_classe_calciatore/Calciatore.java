/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_classe_calciatore;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Calciatore {
    // Attributi
    String nome;
    String cognome;
    LocalDate dataNascita;
    char ruolo;
    String nazionalita;
    String[] stagioni;
    int[] gol;
    
    // Costruttori
    public Calciatore(){
        nome = "";
        cognome = "";
        dataNascita = LocalDate.now();
        ruolo = 'P';
        nazionalita = "";
        stagioni = new String[10];
        gol = new int[10];
    }
    
    public Calciatore(String nome, String congome, LocalDate dataNascita, char ruolo, String nazionalita){
        this.nome = nome;
        this.cognome = congome;
        this.dataNascita = dataNascita;
        this.ruolo = ruolo;
        this.nazionalita = nazionalita;
        this.stagioni = new String[10];
        this.gol = new int[10];
    }
    
    public Calciatore(Calciatore c){
        this.nome = c.nome;
        this.cognome = c.cognome;
        this.dataNascita = c.dataNascita;
        this.ruolo = c.ruolo;
        this.nazionalita = c.nazionalita;
        this.stagioni = c.stagioni.clone();
        this.gol = c.gol.clone();
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

    public char getRuolo() {
        return ruolo;
    }

    public String getNazionalita() {
        return nazionalita;
    }
    
    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setRuolo(char ruolo) {
        this.ruolo = ruolo;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }
    
}
