/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_diependenti;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Tommaso
 */
public class Manager extends Dipendente{
    private ArrayList<Programmatore> sviluppatore;
    private static double percentuale = 0.02;
    private static int contributo = 10;
    
    public Manager(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBase){
        super(codice, nome, cognome, dataAssunzione, stipendioBase);
        sviluppatore = new ArrayList<>();
    }
    
    @Override
    public double calcolaStipendio(){
        LocalDate annoAttuale = LocalDate.now();
        int anniAnzianita = annoAttuale.getYear() - dataAssunzione.getYear();
        int numeroProgrammatori = sviluppatore.size();
        double stipendio, percentualeAumento, bonusProgrammatori;
        int incrementoStipendio;
        
        if (annoAttuale.getDayOfYear() < dataAssunzione.getDayOfYear()){
            anniAnzianita--;
        }
        
        incrementoStipendio = anniAnzianita / 4;
        percentualeAumento = stipendioBase * percentuale * incrementoStipendio;
        bonusProgrammatori = numeroProgrammatori * contributo;
        
        stipendio = stipendioBase + percentualeAumento + bonusProgrammatori;
        
        return stipendio;
    }
    
    public void aggiungiProgrammatore(Programmatore programmatore){
        sviluppatore.add(programmatore);
    }
    
    public void setPercentuale(double nuovaPercentuale){
        percentuale = nuovaPercentuale;
    }
    
    public void setContributo(int nuovoContributo){
        contributo = nuovoContributo;
    }
}