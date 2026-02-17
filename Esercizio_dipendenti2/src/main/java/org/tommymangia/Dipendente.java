package org.tommymangia;

public class Dipendente {
    protected String matricola;
    protected String nome;
    protected String cognome;
    protected double stipendioBase;

    public Dipendente(String matricola, String nome, String cognome, double stipendioBase){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.stipendioBase = stipendioBase;
    }
}
