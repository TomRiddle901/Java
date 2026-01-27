/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_ereditarieta_1;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Programmatore extends Dipendente{
    // Attributi
    private String[] lunguaggiProgrammazione;
    
    // Costruttore
    public Programmatore(String codice, String nome, String cognome, LocalDate dataAssunzione, double stipendioBaseAssunzione) {
        super(codice, nome, cognome, dataAssunzione, stipendioBaseAssunzione);
    }
    
}