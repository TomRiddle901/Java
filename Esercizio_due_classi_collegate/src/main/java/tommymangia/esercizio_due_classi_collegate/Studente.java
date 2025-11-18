/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_due_classi_collegate;

import java.time.LocalDate;

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
    
    // Inserimento voto
    public boolean inserisciValutazione(Valutazione v){
        int c = 0;
        
        while (c < 100 && this.valutazioni[c] != null){
            c++;
        }
        
        if (c != 100){
            valutazioni[c] = v;
            return true;
        } else {
            return false;
        }
    }
    
    // Calcolo media generale
    public double mediaGenerale(){
        int c = 0;
        double sVoti = 0;
        
        while (c < 100 && this.valutazioni[c] != null){
            sVoti += this.valutazioni[c].getPunteggio();
            c++;
        }
        
        if (sVoti != 0){
            return sVoti / c;
        } else {
            return 0;
        }
    }
    
    // Media per materia
    public String mediaMateria(String cercaMateria){
        int nVotiS = 0, nVotiO = 0, nVotiP = 0, c = 0;
        double sVotiS = 0, sVotiO = 0, sVotiP = 0;
        
        while (c < 100 && this.valutazioni[c] != null){
            if (cercaMateria.equals(valutazioni[c].getMateria())){
                switch(valutazioni[c].getTipo()){
                    case 'P':
                        nVotiP++;
                        sVotiP += valutazioni[c].getPunteggio();
                    case 'O':
                        nVotiO++;
                        sVotiO += valutazioni[c].getPunteggio();
                    case 'S':
                        nVotiS++;
                        sVotiS += valutazioni[c].getPunteggio();
                }
            }
            c++;
        }
        
        if (sVotiO != 0 && sVotiP != 0 && sVotiS != 0){
            return "Media per la materia: " + cercaMateria
                    + "\nAlunno: " + getNome() + " " + getCognome()
                    + "\nMedia voti Orali: " + sVotiO / nVotiO
                    + "\nMedia voti Pratici: " + sVotiP / nVotiP
                    + "\nMedia voti Scritti: " + sVotiS / sVotiS;
        } else {
            return "Nessun voto inserito!";
        }
    }
}