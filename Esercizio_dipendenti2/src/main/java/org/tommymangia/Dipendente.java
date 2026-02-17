package org.tommymangia;

public abstract class Dipendente {
    protected String matricola;
    protected String nome;
    protected String cognome;
    protected double stipendioBase;

    public Dipendente(String matricola, String nome, String cognome, double stipendioBase) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.stipendioBase = stipendioBase;
    }
}
