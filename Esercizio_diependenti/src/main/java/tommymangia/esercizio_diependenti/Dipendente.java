/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_diependenti;

import java.time.LocalDate;

/**
 *
 * @author Tommaso
 */
public class Dipendente {
    protected String codice;
    protected String nome;
    protected String cognome;
    protected LocalDate dataAssunzione;
    protected double stipendioBase;
    
    public Dipendente(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBase){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.dataAssunzione = dataAssunzione;
        this.stipendioBase = stipendioBase;
    }
}
