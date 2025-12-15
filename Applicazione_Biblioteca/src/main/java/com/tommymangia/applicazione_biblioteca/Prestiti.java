/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.applicazione_biblioteca;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Prestiti {
    // Attributi
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Libro[] libriPrestati;
    private Socio socio;
    private boolean riconsegna;
    
    // Costruttori
    public Prestiti(LocalDate dataInizio, LocalDate dataFine, Libro[] libri,Socio socio, boolean riconsegna){
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.libriPrestati = libri;
        this.socio = socio;
        this.riconsegna = riconsegna;
    }
}
