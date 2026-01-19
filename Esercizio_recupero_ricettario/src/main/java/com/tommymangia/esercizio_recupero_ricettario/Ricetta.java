/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.esercizio_recupero_ricettario;
import java.time.LocalTime;

/**
 *
 * @author tommaso
 */
public class Ricetta {
    // Attributi
    private String nomeRicetta;
    private LocalTime tempoPreparazione;
    private String descrizionePreparazione;
    private Ingrediente[] ingredienti;
    private String[] pathImmagine;
    
    // Costruttore
    public Ricetta(String nome, LocalTime tempoPreparazione, String descrizionePreparazione){
        this.nomeRicetta = nome;
        this.tempoPreparazione = tempoPreparazione;
        ingredienti = new Ingrediente[64];
        this.descrizionePreparazione = descrizionePreparazione;
        this.pathImmagine = new String[10];
    }
    
    public void setIngredienti(String nomeIngrediente, float quantitaIngrediente, String unitaMisuraIngrediente, String allergene){
        int i = 0;
        
        while(i < 60 && ingredienti[i] != null){
            i++;
        }
        
        if (i < 60){
            ingredienti[i] = new Ingrediente(nomeIngrediente, quantitaIngrediente, unitaMisuraIngrediente, allergene);
        }
    }
    
    public void setImmagine(String percorsoImmagine){
        int i = 0;
        
        while (i < 10 && pathImmagine[i] != null){
            i++;
        }
        
        if (i < 10){
            pathImmagine[i] = percorsoImmagine;
        }
    }
    
    public String getNomeRicetta(){
        return nomeRicetta;
    }
    
    public String getAllergeni(){
        int i = 0;
        String allergeni = "";
        
        while (i < 64 && ingredienti[i] != null){
            allergeni += ingredienti[i].getNome() + ":\n";
            allergeni += ingredienti[i].getAllergene() + "\n";
            i++;
        }
        
        return allergeni;
    }
}