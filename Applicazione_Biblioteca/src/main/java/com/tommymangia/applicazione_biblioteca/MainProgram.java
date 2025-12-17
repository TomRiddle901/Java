/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.applicazione_biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    private static Biblioteca b = new Biblioteca("Gianni", "Via Indirizzo 15/B", "www.giannilibrary.com", "giaani@library.com", "+39 1234567890");

    public static void main(String[] args) {
        
    }
    
    private static int menu(){
        int scelta;
        Scanner in = new Scanner(System.in);
        
        System.out.println("----- Menù -----\n");
        System.out.println("1) Aggiungi un libro");
        System.out.println("2) Aggiungi un socio");
        System.out.println("3) Nuovo prestito");
        System.out.println("4) Consegna prestito");
        System.out.println("5) Pulisci prestiti");
        System.out.println("6) Prestiti scaduti");
        System.out.println("7) Lista prestiti");
        System.out.println("0) Esci");
        System.out.println("------------------------");
        System.out.print("- Scelta: ");
        
        try{
            scelta = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ex) {
            System.err.println("Errore: " + ex.getMessage());
            return -1;
        }
        
        return scelta;
    }
}