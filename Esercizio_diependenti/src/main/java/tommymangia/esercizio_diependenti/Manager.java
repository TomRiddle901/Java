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
    
    public Manager(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBase){
        super(codice, nome, cognome, dataAssunzione, stipendioBase);
    }
    
    public double calcolaStipendio(){
        return 0;
    }
}
