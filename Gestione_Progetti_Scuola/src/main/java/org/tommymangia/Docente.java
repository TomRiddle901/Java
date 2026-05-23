package org.tommymangia;

import java.time.LocalDate;

public class Docente extends Dipendente{
    private String materia;
    private static float costoOrario = 60;

    public Docente(String nome, String cognome, LocalDate dataNascita, char sesso, LocalDate dataAssunzione, int nOre, String materia){
        super(nome, cognome, dataNascita, sesso, dataAssunzione, nOre);
        this.materia = materia;
    }

    @Override
    public float calcolaCosto(){
        float costo = 0;
        costo = nOre * costoOrario;
        return costo;
    }
}
