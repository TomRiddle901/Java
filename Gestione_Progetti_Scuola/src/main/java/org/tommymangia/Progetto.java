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
        dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente dip){
        int nDocenti = 0;
        boolean presenzaTecnico = false;

        for (int i = 0; i < dipendenti.size(); i++){
            if (dipendenti.get(i) instanceof Docente){
                nDocenti++;
            }

            if (dipendenti.get(i) instanceof Tecnico){
                presenzaTecnico = true;
            }
        }

        if (dip instanceof Docente && nDocenti >= 5){
            System.out.println("Numero massimo di docenti raggiunto!");
            return;
        }

        if (dip instanceof Tecnico && presenzaTecnico){
            System.out.println("Tecnico già presente!");
            return;
        }

        dipendenti.add(dip);
    }

    public float costoTotale(){
        float costoTotale = 0;

        for (int i = 0; i < dipendenti.size(); i++){
            costoTotale += dipendenti.get(i).calcolaCosto();
        }

        return costoTotale;
    }

    public boolean setFine(LocalDate dataFine){
        if (dataFine.isBefore(dataInizio)){
            return false;
        }

        this.dataFine = dataFine;

        return true;
    }
}
