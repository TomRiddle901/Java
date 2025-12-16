/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.applicazione_biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class Socio {
    // Attributi
    private int nTessera;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private char sesso;
    private String email;
    private String numeroTelefono;
    
    // Costruttori
    public Socio(int nTessera, String nome, String cognome, LocalDate dataNascita, char sesso, String email, String numeroTelefono){
        this.nTessera = nTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
    
    // Metodi
    public void setnTessera(int nTessera) {
        this.nTessera = nTessera;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setSesso() {
        Scanner in = new Scanner(System.in);
        String input;
        
        System.out.print("\nSesso: ");
        input = in.nextLine().toUpperCase();
        
        if (!input.isEmpty()){
            sesso = input.charAt(0);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}