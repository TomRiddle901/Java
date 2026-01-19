/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.esercizio_recupero_ricettario;

import java.util.Scanner;
import java.time.LocalTime;

/**
 *
 * @author tommaso
 */
public class Esercizio_recupero_ricettario {
    
    private Ricetta ricette[];

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    private int menu(){
        Scanner in = new Scanner(System.in);
        int scelta;
        
        System.out.println("Menu");
        System.out.println("1) Inserisci Ricetta");
        System.out.println("2) Elenco allergeni di una ricetta");
        System.out.println("3) Aggiungi immagine alla ricetta");
        System.out.println("4) Crea pagina HTML");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
        scelta = in.nextInt();
        
        return scelta;
    }
}
