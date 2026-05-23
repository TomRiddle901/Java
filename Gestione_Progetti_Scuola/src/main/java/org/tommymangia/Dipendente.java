package org.tommymangia;

import java.time.LocalDate;

public abstract class Dipendente {
    protected String nome;
    protected String cognome;
    protected LocalDate dataNascita;
    protected char sesso;
    protected LocalDate dataAssunzione;
    protected int nOre;

    public Dipendente(String nome, String cognome, LocalDate dataNascita, char sesso, LocalDate dataAssunzione, int nOre){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.dataAssunzione = dataAssunzione;
        this.nOre = nOre;
    }
}
