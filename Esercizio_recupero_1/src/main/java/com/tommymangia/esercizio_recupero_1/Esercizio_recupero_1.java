/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.esercizio_recupero_1;

import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class Esercizio_recupero_1 {

    private Sim sim;
    
    public static void main(String[] args){
        int scelta;
        
        do{
            scelta = menu();
            
            switch(scelta){
                case 1:
                    aggiungiSim();
                    break;
                case 2:
                    aggiungiChiamata();
                    break;
                case 3:
                    visualizzaDettagli();
                    break;
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                    break;
                default:
                    System.out.println("Errore: Scelta non valida!");
            }
        } while(scelta != 0);
    }
    
    private static int menu(){
        Scanner in = new Scanner(System.in);
        int scelta;
        
        System.out.println("+------Menù------+");
        System.out.println("1) Aggiungi SIM");
        System.out.println("2) Aggiungi chiamata");
        System.out.println("3) Visualizza dettagli SIM");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
        scelta = in.nextInt();
        
        return scelta;
    }
}
