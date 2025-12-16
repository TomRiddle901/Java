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
    private Libro libriPrestati;
    private Socio socio;
    private boolean riconsegna;
    
    // Costruttori
    public Prestiti(){
        this.dataInizio = null;
        this.dataFine = null;
        this.libriPrestati = null;
        this.socio = null;
        this.riconsegna = false;
    }
    
    // Metodi
    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public void setLibriPrestati(Libro libriPrestati) {
        this.libriPrestati = libriPrestati;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void setRiconsegna(boolean riconsegna) {
        this.riconsegna = riconsegna;
    }
    
}
