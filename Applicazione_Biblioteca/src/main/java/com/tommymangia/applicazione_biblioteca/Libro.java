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
    public Libro(){
        this.isbn = "";
        this.autori = new Autore[10];     
        this.titolo = ""; 
        this.sala = '?';
        this.scaffale = 0;
        this.ripiano = 0;
    }
    
    // Metodi
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setProgressivo(int progressivo) {
        this.progressivo = progressivo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setSala() {
        Scanner in = new Scanner(System.in);
        String input;
       
        System.out.print("\nSala: ");
        input = in.nextLine().toUpperCase();
        
        if (!input.isEmpty()){
            this.sala = input.charAt(0);
        } else{
            System.out.println("Sala non valida!");
        }
    }

    public void setScaffale(int scaffale) {
        this.scaffale = scaffale;
    }

    public void setRipiano(int ripiano) {
        this.ripiano = ripiano;
    }
    
    public void setAutore(){
        Scanner in = new Scanner(System.in);
        String input;
        int i = 0;
        
        do{        
            if (i < 1000 && autori[i] == null){
                autori[i] = new Autore();
                
                System.out.print("Nome Autore: ");
                autori[i].setNome(in.nextLine());
                System.out.print("\nCognome autore: ");
                autori[i].setCognome(in.nextLine());
                System.out.print("\nData di nascita dell'autore (formato: AAAA-MM-GG): ");
                autori[i].setDataNascita(LocalDate.parse(in.nextLine()));
                System.out.println("\nInserisci la data di morte (0 per vivo, formato: AAAA-MM-GG): ");
                if (!in.nextLine().equals("0")){
                    autori[i].setDataMorte(LocalDate.parse(in.nextLine()));
                }
                System.out.print("\nInserisci sesso (M/F): ");
                input = in.nextLine().toUpperCase();
            
                if (input.equals("M") || input.equals("F")){                
                    if (!input.isEmpty()){
                        autori[i].setSesso(input.charAt(0));
                    } else{
                        System.out.println("Devi inserire il sesso!");
                    }
                }
            }
        } while (i < 10000 && autori[i] != null);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }
}