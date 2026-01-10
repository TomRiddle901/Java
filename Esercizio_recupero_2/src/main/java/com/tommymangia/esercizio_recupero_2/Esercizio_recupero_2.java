/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.esercizio_recupero_2;

import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class Esercizio_recupero_2 {

    private static Sim sim;
    
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
        scelta = in.nextInt(); // Input viene trasformato in int senza fare parseInt()
        
        return scelta;
    }
    
    private static void aggiungiSim(){
        Scanner in = new Scanner(System.in);
        String nome, cognome, numeroTelefono;
        float credito;
        
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Cognome: ");
        cognome = in.nextLine();
        System.out.print("Numero di telefono: ");
        numeroTelefono = in.nextLine();
        System.out.print("Credito: ");
        credito = in.nextFloat(); // Input viene trasformato in float senza fare parseFloat()
        
        sim = new Sim(nome, cognome, numeroTelefono, credito);
    }
    
    private static void aggiungiChiamata(){
        Scanner in = new Scanner(System.in);
        String numeroTelefonoChiamato;
        
        System.out.print("Numero di telefono chiamato: ");
        numeroTelefonoChiamato = in.nextLine();
        
        if (sim.inserisciTelefonata(numeroTelefonoChiamato)){
            System.out.println("Telefonata aggiunta correttamente");
        } else{
            System.out.println("Errore: Impossibile aggiungere la telefonata");
        }
    }
    
    private static void visualizzaDettagli(){
        System.out.println("Dettagli SIM:");
        System.out.println(sim.toString());
    }
}
