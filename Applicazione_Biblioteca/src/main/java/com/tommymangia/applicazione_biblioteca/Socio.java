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
    public Socio(){
        this.nTessera = 0;
        this.nome = "";
        this.cognome = "";
        this.dataNascita = null;
        this.sesso = '?';
        this.email = "";
        this.numeroTelefono = "";
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
        
        System.out.print("Sesso: ");
        input = in.nextLine().toUpperCase();
        
        if (!input.isEmpty()){
            this.sesso = input.charAt(0);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getnTessera() {
        return nTessera;
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

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    
}