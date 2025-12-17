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
        int i = 0, j = 0, k = 0, idSocio, posSocio = -1, posLibro = -1;
        String isbn;
        
        // Ricerca posizione libera per il prestito
        while (i < 10000 && prestito[i] != null){
            i++;
        }
        
        // Condizione esistenza posizione prestito
        if (i < 10000){
            // Ricerca socio
            System.out.print("ID Tessera: ");
            idSocio = Integer.parseInt(in.nextLine());
            
            while (j < 10000 && soci[j] != null){
                if (soci[j].getnTessera() == idSocio){
                    posSocio = j;
                }
                j++;
            }
            
            // Codizione esistenza socio
            if (posSocio != -1){
                // Creazione prestito
                prestito[i] = new Prestiti();
                
                // Inserimento socio
                prestito[i].setSocio(soci[posSocio]);
                
                // Inserimento date inizio/scadenza prestito
                System.out.print("\nData inizio (AAAA-MM-GG): ");
                prestito[i].setDataInizio(LocalDate.parse(in.nextLine()));
                System.out.print("\nData fine (AAAA-MM-GG): ");
                prestito[i].setDataFine(LocalDate.parse(in.nextLine()));
                
                // Ricerca e inserimento libro
                System.out.print("\nISBN libro: ");
                isbn = in.nextLine();
                
                while (k < 1000 && libri[k] != null){
                    if (libri[k].getIsbn().equals(isbn)){
                        posLibro = k;
                    }
                    k++;
                }
                
                if (posLibro != -1){
                    prestito[i].setLibriPrestati(libri[posLibro]);
                    
                    // Riconsegna false perché è consegna
                    prestito[i].setRiconsegna(false);
                    
                    System.out.println("Prestito aggiunto correttamente!");
                } else{
                    System.out.println("Libro inesistente!");
                }
            } else{
                System.out.println("Socio inesistente!");
            }
        } else{
            System.out.println("Limite massimo di prestiti raggiunto!");
        }
    }
    
    public void riconsegna(){
        Scanner in = new Scanner(System.in);
        int idSocio;
        String isbn;
        boolean socioTrovato = false, prestitoTrovato = false;
        
        // Ricerca socio
        System.out.print("ID socio: ");
        idSocio = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < 10000 && soci[i] != null; i++){
            if (soci[i].getnTessera() == idSocio){
                socioTrovato = true;
            }
        }
        
        // Solo se il socio esiste si va avanti
        if (socioTrovato){
            // Ricerca libro
            System.out.print("\nISBN libro: ");
            isbn = in.nextLine();
            
            for (int i = 0; i < 10000 && libri[i] != null; i++){
                if (prestito[i].getSocio().getnTessera() == idSocio &&
                    prestito[i].getLibriPrestati().getIsbn().equals(isbn) &&
                    !prestito[i].isRiconsegna()){
                    
                    prestito[i].setRiconsegna(true);
                    prestitoTrovato = true;
                }
            }
            
            if (prestitoTrovato){
                System.out.println("Riconsegna effettuata correttamente!");
            } else{
                System.out.println("Impossibile riconsegnare!");
            }
        } else{
            System.out.println("Socio non registrato!");
        }
    }
}