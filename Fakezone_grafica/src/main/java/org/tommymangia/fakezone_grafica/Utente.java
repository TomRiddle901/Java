/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tommymangia.fakezone_grafica;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Utente {
    private String password;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private char sesso; 
    private String codiceFiscale;
    private String email;
    private String indirizzo;
    private String numeroTel;

    public Utente(String password, String nome, String cognome, LocalDate dataNascita, char sesso, String codiceFiscale, String email, String indirizzo, String numeroTel) {
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.codiceFiscale = codiceFiscale;
        this.email = email;
        this.indirizzo = indirizzo;
        this.numeroTel = numeroTel;
    }
    
    
}
