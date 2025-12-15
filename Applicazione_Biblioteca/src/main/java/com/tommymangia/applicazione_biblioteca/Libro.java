/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.applicazione_biblioteca;

/**
 *
 * @author tommaso
 */
public class Libro {
    // Attributi
    private String isbn;
    private int progressivo;
    private Autore[] autori;
    private String titolo;
    private char sala; 
    private int scaffale;
    private int ripiano;
    
    // Costruttori
    public Libro(String isbn, Autore[] autori, String titolo, char sala, int scaffale, int ripiano){
        this.isbn = isbn;
        this.autori = autori;     
        this.titolo = titolo; 
        this.sala = sala;
        this.scaffale = scaffale;
        this.ripiano = ripiano;
    }
}