package org.tommymangia;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Dipendente> listaDipendenti = new ArrayList<>();

    public static void main(String[] args){
        Amministrativi amm = new Amministrativi("amm1", "Ammi", "Strativi", 2000, 10);
        Amministrativi ammDue = new Amministrativi("amm2", "Strativi", "Ammi", 1000, 10);
        Tecnici tec = new Tecnici("tec1", "Tec", "Nici", 1500.10);
        Tecnici tecDue = new Tecnici("tec2", "Nici", "Tec", 1000.15);

        listaDipendenti.add(amm);
        listaDipendenti.add(ammDue);
        listaDipendenti.add(tec);
        listaDipendenti.add(tecDue);

        System.out.println(amm.calcolaStipendio());
        System.out.println(ammDue.calcolaStipendio());
        System.out.println(tec.calcolaStipendio());
        System.out.println(tecDue.calcolaStipendio());
    }
}