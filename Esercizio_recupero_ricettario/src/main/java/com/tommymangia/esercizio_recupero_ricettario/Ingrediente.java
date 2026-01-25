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
    private String unitaMisura;
    private String allergene;
    
    // Costruttore
    public Ingrediente(String nome, float quantita, String unitaMisura, String allergene){
        this.nome = nome;
        this.quantita = quantita;
        this.unitaMisura = unitaMisura;
        this.allergene = allergene;
    }
    
    // Metodi
    public String getNome(){
        return nome;
    }
    
    public float getQuantita(){
        return quantita;
    }
    
    public String getUnitaMisura(){
        return unitaMisura;
    }
    
    public String getAllergene(){
        return allergene;
    }
    
    public String getIngrediente(){
        return "\n          <br>Nome: " + nome + "\n          <br>Quantità: " + quantita + unitaMisura + "\n          <br>Allergene: " + allergene;
    }
}
