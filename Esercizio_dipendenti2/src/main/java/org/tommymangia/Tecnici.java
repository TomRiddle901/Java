package org.tommymangia;

import java.time.LocalTime;

public class Tecnici extends Dipendente{
    private static double importoStraordinari = 10;
    private LocalTime oreStaordinari;

    public Tecnici(String matricola, String nome, String cognome, double stipendioBase){
        super(matricola, nome, cognome, stipendioBase);
    }

    public double calcolaStipendio(){
        return stipendioBase + importoStraordinari * oreStaordinari.getHour();
    }

    public static void aggiornaStraordinari(double nuovoImporto) {
        importoStraordinari = nuovoImporto;
    }
}
