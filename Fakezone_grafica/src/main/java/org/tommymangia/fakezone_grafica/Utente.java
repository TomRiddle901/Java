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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getPassword() {
        return password;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public char getSesso() {
        return sesso;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    
    
    
    @Override
    public String toString() {
        return "Dati utente: " + "\n nome: " + nome + "\n cognome: " + cognome + "\n codice fiscale: " + codiceFiscale + "n" + "\n sesso: " + sesso + "\n la password e': " + password + "\n email: " + email + "\n indirizzo di casa: " + indirizzo + "\n data di nascita: " + dataNascita + "\n numero di tel: " + numeroTel;
    }
}
