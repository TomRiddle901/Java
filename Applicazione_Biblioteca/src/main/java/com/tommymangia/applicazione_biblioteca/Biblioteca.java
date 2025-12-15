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
public class Biblioteca {
    // Attributi
    private String nome;
    private String indirizzo;
    private String website;
    private String email;
    private String telefono;
    private Socio[] soci;
    private Libro[] libri;
    private Prestiti[] prestito;
    private Autore[] autori;
    
    // Costruttori
    public Biblioteca(String nome, String indirizzo, String website, String email, String telefono){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.website = website;
        this.email = email;
        this.telefono = telefono;
    }
}
