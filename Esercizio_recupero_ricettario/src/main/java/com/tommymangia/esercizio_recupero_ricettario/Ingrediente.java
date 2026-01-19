/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_ricettario;

/**
 *
 * @author tommaso
 */
public class Ingrediente {
    // Attributi
    private String nome;
    private float quantita;
    private char unitaMisura;
    private String allergene;
    
    // Costruttore
    public Ingrediente(String nome, float quantita, char unitaMisura, String allergene){
        this.nome = nome;
        this.quantita = quantita;
        this.unitaMisura = unitaMisura;
        this.allergene = allergene;
    }
}
