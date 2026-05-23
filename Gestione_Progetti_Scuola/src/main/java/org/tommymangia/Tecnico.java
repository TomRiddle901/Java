package org.tommymangia;

import java.time.LocalDate;
import java.time.Period;

public class Tecnico extends Dipendente{
    private String area;
    private static float cstoOrario = 40;

    public Tecnico(String nome, String cognome, LocalDate dataNascita, char sesso, LocalDate dataAssunzione, int nOre, String area){
        super(nome, cognome, dataNascita, sesso, dataAssunzione, nOre);
        this.area = area;
    }

    @Override
    public float calcolaCosto(){

    }
}
