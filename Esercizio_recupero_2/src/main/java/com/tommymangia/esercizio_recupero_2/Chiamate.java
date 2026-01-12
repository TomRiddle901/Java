/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_2;

import java.time.LocalTime;

/**
 *
 * @author tommaso
 */
public class Chiamate {
    // Attributi
    private String numeroTelefono;
    private LocalTime durata;
    
    // Construttori
    public Chiamate(String numeroChiamato, LocalTime durataChiamata){
        this.numeroTelefono = numeroChiamato;
        this.durata = durataChiamata;
    }
    
    public String getNumeroChiamato(){
        return numeroTelefono;
    }
    
    public LocalTime getDurata(){
        return durata;
    }
    
    public String toString(){
        return "|" + numeroTelefono + "      |  " + durata + "       |";
    }
}
