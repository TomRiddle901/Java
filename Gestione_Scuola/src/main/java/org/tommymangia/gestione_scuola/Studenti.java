/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tommymangia.gestione_scuola;

/**
 *
 * @author tommaso
 */
public class Studenti {
    private String nome;
    private String cognome;
    private int annoClasse;
    private String sezioneClasse;
    private String matricola;

    public Studenti(String nome, String cognome, int annoClasse, String sezioneClasse, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoClasse = annoClasse;
        this.sezioneClasse = sezioneClasse;
        this.matricola = matricola;
    }
    
}
