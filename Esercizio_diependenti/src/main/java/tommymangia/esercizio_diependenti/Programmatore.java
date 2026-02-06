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
public class Programmatore extends Dipendente{
    private ArrayList<String> linguaggi;
    
    public Programmatore(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBase){
        super(codice, nome, cognome, dataAssunzione, stipendioBase);
    }
    
    @Override
    public double calcolaStipendio(){
        
    }
}
