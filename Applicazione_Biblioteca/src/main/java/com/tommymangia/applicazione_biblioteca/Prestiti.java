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
    private String socio;
    private boolean riconsegna;
}
