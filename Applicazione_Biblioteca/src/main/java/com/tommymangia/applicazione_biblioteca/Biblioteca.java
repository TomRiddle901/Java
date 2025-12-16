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
            libri[i] = new Libro();
            
            System.out.print("Titolo del libro: ");
            libri[i].setTitolo(in.nextLine());
            System.out.print("\nISBN del libro");
            libri[i].setIsbn(in.nextLine());
            libri[i].setAutore();
            System.out.print("\nCopie del libro: ");
            libri[i].setProgressivo(Integer.parseInt(in.nextLine()));
            libri[i].setSala();
            System.out.print("\nScaffale: ");
            libri[i].setScaffale(Integer.parseInt(in.nextLine()));
            System.out.print("\nRipiano: ");
            libri[i].setRipiano(Integer.parseInt(in.nextLine()));
        } else{
            System.out.println("Libreria piena!");
        }
    }
    
    public void addSocio(){
        Scanner in = new Scanner(System.in);
        int i = 0;
        
        while (i < 10000 && soci[i] != null){
            i++;
        }
        
        if (i < 10000 && soci[i] == null){
            soci[i] = new Socio();
            
            soci[i].setnTessera(i);
            System.out.println("Numero tessera: " + i);
            System.out.println("Nome: ");
            soci[i].setNome(in.nextLine());
            System.out.print("\nCognome: ");
            soci[i].setCognome(in.nextLine());
            System.out.print("\nData di nascita (formato: AAAA-MM-GG): ");
            soci[i].setDataNascita(LocalDate.parse(in.nextLine()));
            soci[i].setSesso();
            System.out.print("\nEmail: ");
            soci[i].setEmail(in.nextLine());
            System.out.println("\nNumero di telefono: ");
            soci[i].setNumeroTelefono(in.nextLine());
        }
    }
    
    public void nuovoPrestito(){
        Scanner in = new Scanner(System.in);
        int i = 0, j = 0, idSocio, posSocio = -1;
        
        while (i < 10000 && prestito[i] != null){
            i++;
        }
        
        if (i < 10000){
            System.out.print("ID Tessera: ");
            idSocio = Integer.parseInt(in.nextLine());
            
            while (j < 10000 && soci[j] != null){
                if (soci[j].getnTessera() == idSocio){
                    posSocio = j;
                }
                j++;
            }
        }
        
        if (posSocio != -1){
            prestito[i].
        }
    }
}