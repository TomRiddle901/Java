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
            System.out.print("ISBN del libro: ");
            libri[i].setIsbn(in.nextLine());
            libri[i].setAutore();
            System.out.print("Copie del libro: ");
            libri[i].setProgressivo(Integer.parseInt(in.nextLine()));
            libri[i].setSala();
            System.out.print("Scaffale: ");
            libri[i].setScaffale(Integer.parseInt(in.nextLine()));
            System.out.print("Ripiano: ");
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
            System.out.print("Nome: ");
            soci[i].setNome(in.nextLine());
            System.out.print("Cognome: ");
            soci[i].setCognome(in.nextLine());
            System.out.print("Data di nascita (formato: AAAA-MM-GG): ");
            soci[i].setDataNascita(LocalDate.parse(in.nextLine()));
            soci[i].setSesso();
            System.out.print("Email: ");
            soci[i].setEmail(in.nextLine());
            System.out.println("Numero di telefono: ");
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
                System.out.print("Data inizio (AAAA-MM-GG): ");
                prestito[i].setDataInizio(LocalDate.parse(in.nextLine()));
                System.out.print("Data fine (AAAA-MM-GG): ");
                prestito[i].setDataFine(LocalDate.parse(in.nextLine()));
                
                // Ricerca e inserimento libro
                System.out.print("ISBN libro: ");
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
            System.out.print("ISBN libro: ");
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
    
    public void pulisciPrestiti(){
        LocalDate limite = LocalDate.now().minusYears(3);
        System.out.println("Eliminazione dei prestiti scaduti...");
        
        for (int i = 0; i < 10000 && prestito[i] != null; i++){
            if (prestito[i].getDataFine().isBefore(limite) &&
                    prestito[i].isRiconsegna()){
                
                prestito[i] = null;
            }
        }
    }
    
    public void scaduti(){
        System.out.println("Lista prestiti scaduti da più di 1 settimana: ");
        
        for (int i = 0; i < 10000 && prestito[i] != null; i++){
            if (prestito[i].getDataFine().isBefore(LocalDate.now().minusWeeks(3)) &&
                    !prestito[i].isRiconsegna()){
                System.out.println("ID Socio: " + prestito[i].getSocio().getnTessera());
                System.out.println("Nome: " + prestito[i].getSocio().getNome());
                System.out.println("Cognome: " + prestito[i].getSocio().getCognome());
                System.out.println("Numero di telefono: " + prestito[i].getSocio().getNumeroTelefono());
                System.out.println("Email: " + prestito[i].getSocio().getEmail());
                System.out.println("ISBN Libro: " + prestito[i].getLibriPrestati().getIsbn());
                System.out.println("Titolo: " + prestito[i].getLibriPrestati().getTitolo());
                System.out.println("Data inizio prestito: " + prestito[i].getDataInizio());
                System.out.println("Data fine prestito: " + prestito[i].getDataFine());
            }
        }
    }
    
    public void visualizzaPrestiti(){
        int c = 0;
        for (int i = 0; i < 10000 && prestito[i] != null; i++){
            c++;
        }
        
        Prestiti[] temp = new Prestiti[c];
        for (int i = 0; i < c; i++){
            temp[i] = prestito[i];
        }
        
        for (int i = 0; i < c; i++){
            for (int j = 0; j < c - i - 1; j++){
                if (temp[j].getDataInizio().isAfter(temp[j + 1].getDataInizio())){
                    Prestiti t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                }
            }
        }
        
        for (int i = 0; i < 10000 && temp[i] != null; i++){
            System.out.println("ID socio: " + temp[i].getSocio().getnTessera());
            System.out.println("Nome: " + temp[i].getSocio().getNome());
            System.out.println("Cognome: " + temp[i].getSocio().getCognome());
            System.out.println("ISBN libro: " + temp[i].getLibriPrestati().getIsbn());
            System.out.println("Titolo libro: " + temp[i].getLibriPrestati().getTitolo());
            System.out.println("Data inizio prestito: " + temp[i].getDataInizio());
            System.out.println("Data fine prestito: " + temp[i].getDataFine());
            if (temp[i].isRiconsegna()){
                System.out.println("Riconsegnato");                
            } else{
                System.out.println("Da restituire");
            }
        }
    }
}