package org.tommymangia;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Progetto implements Serializable{
    private String nome;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private int avanzamento;
    private ArrayList<Dipendente> dipendenti;

    public Progetto(String nome, LocalDate dataInizio, LocalDate dataFine, int avanzamento){
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.avanzamento = avanzamento;
    }
}
