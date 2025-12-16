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
        libri = new Libro[1000];
        prestito = new Prestiti[10000];
        autori = new Autore[10000];
        soci = new Socio[10000];
    }
    
    public void addLibro(){
        Scanner in = new Scanner(System.in);
        int i = 0;
        
        while(i < 1000 && libri[i] != null){
            i++;
        }
        
        if (i < 1000 && libri[i] == null){
            System.out.print("Titolo del libro: ");
            libri[i].setTitolo(in.nextLine());
            System.out.print("\nISBN del libro");
            libri[i].setIsbn(in.nextLine());
            libri[i].setAutore();
            libri[i].setSala();
            System.out.print("\nScaffale: ");
            libri[i].setScaffale(Integer.parseInt(in.nextLine()));
            System.out.print("\nRipiano: ");
            libri[i].setRipiano(Integer.parseInt(in.nextLine()));
        } else{
            System.out.println("Libreria piena!");
        }
    }
}
