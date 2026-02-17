package org.tommymangia;

public class Amministrativi extends Dipendente{
    private double bonusMensile;

    public Amministrativi(String matricola, String nome, String cognome, double stipendioBase, double bonusMensile){
        super(matricola, nome, cognome, stipendioBase);
        this.bonusMensile = bonusMensile;
    }
}