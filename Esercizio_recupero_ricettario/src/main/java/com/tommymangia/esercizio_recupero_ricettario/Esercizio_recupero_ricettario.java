/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.esercizio_recupero_ricettario;

import java.util.Scanner;
import java.time.LocalTime;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tommaso
 */
public class Esercizio_recupero_ricettario {
    
    private static Ricetta ricette[];

    public static void main(String[] args) {
        int scelta;
        
        ricette = new Ricetta[100];
        
        do{
            scelta = menu();
            
            switch (scelta) {
                case 1:
                    aggiungiRicetta();
                    break;
                case 2:
                    ottieniAllergeni();
                    break;
                case 3:
                    inserisciImmagine();
                    break;
                case 4:
                    generaHtml();
                    break;
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
                    break;
            }
        } while(scelta != 0);
    }
    
    private static int menu(){
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
    
    private static void aggiungiRicetta(){
        Scanner in = new Scanner(System.in);
        String nomeRicetta, descrizionePreparazione, nomeIngrediente, allergeneIngrediente, unitaMisura,scelta;
        LocalTime tempoPreparazione;
        float quantitaIngrediente;
        int i = 0;
        
        System.out.print("Nome ricetta: ");
        nomeRicetta = in.nextLine();
        System.out.print("Tempo di preparazione (hh:mm:ss): ");
        tempoPreparazione = LocalTime.parse(in.nextLine());
        System.out.println("Descrizione preparazione:");
        descrizionePreparazione = in.nextLine();
        
        while (i < 100 && ricette[i] != null){
            i++;
        }
        
        if (i < 100){
            ricette[i] = new Ricetta(nomeRicetta, tempoPreparazione, descrizionePreparazione);
        }
        
        do{
            System.out.print("Nome ingrediente: ");
            nomeIngrediente = in.nextLine();
            System.out.print("Quantità ingrediente: ");
            quantitaIngrediente = in.nextFloat();
            in.nextLine();
            System.out.print("Unità di misura (g, L, Kg, mL): ");
            unitaMisura = in.nextLine();
            System.out.print("Allergene: ");
            allergeneIngrediente = in.nextLine();
            
            ricette[i].setIngredienti(nomeIngrediente, quantitaIngrediente, unitaMisura, allergeneIngrediente);
            
            System.out.println("Aggiungere un altro ingrediente?");
            System.out.print("Scelta (y/n): ");
            scelta = in.nextLine();
        }while(scelta.equals("y"));
    }
    
    private static void ottieniAllergeni(){
        Scanner in = new Scanner(System.in);
        int i = 0, j = -1;
        String scelta;
        
        System.out.print("Nome ricetta: ");
        scelta = in.nextLine();
        
        while (i < 100 && ricette[i] != null){
            if (scelta.equals(ricette[i].getNomeRicetta())){
                j = i;
            }
            i++;
        }
        
        if (scelta.equals(ricette[j].getNomeRicetta())){
            System.out.println("Lista degli allergeni:");
            System.out.println(ricette[j].getAllergeni());
        }else{
            System.out.println("Ricetta non trovata!");
        }
    }
    
    private static void inserisciImmagine(){
        Scanner in = new Scanner(System.in);
        String percorsoImmagine, scelta;
        
        do{
            int i = 0, j = -1;
            System.out.print("Nome ricetta: ");
            scelta = in.nextLine();
                
            while (i < 100 && ricette[i] != null){
                if (scelta.equals(ricette[i].getNomeRicetta())){
                    j = i;
                }
                i++;
            }
            
            if (j == -1){
                System.out.println("Ricetta non trovata!");
                continue; // Salta tutto il ciclo
            }
            
            System.out.print("Percorso immagine (/assets/image.jpg): ");
            percorsoImmagine = in.nextLine();
            
            ricette[j].setImmagine(percorsoImmagine);
            
            System.out.println("Vuoi aggiungere un altra immagine?");
            System.out.print("Scelta (y/n): ");
            scelta = in.nextLine();
        }while(scelta.equalsIgnoreCase("y"));
    }
    
    private static void generaHtml(){
        int i = 0;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"))){
            
            StringBuilder html = new StringBuilder();
            
            html.append("<!DOCTYPE html>\n")
                .append("<html lang=\"it\">\n")
                .append("   <head>\n")
                .append("       <meta charset=\"UTF-8\">\n")
                .append("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n")
                .append("       <title>Ricettario</title>\n")
                .append("       <link rel=\"stylesheet\" href=\"style.css\">\n")
                .append("   </head>\n")
                .append("   <body>\n")
                .append("       <h1>Ricettario</h1>\n")
                .append("       <p>Qui vedrai tutte le ricette inserite nel programma Java</p>\n")
                .append("       <div class=\"ricettario\">\n");

            while (i < 100 && ricette[i] != null){
                html.append("           <div class=\"ricetta-content\">\n")
                    .append(ricette[i].toString())
                    .append("           </div>\n");
                i++;
            }
            
            html.append("      </div>\n")
                .append("   </body>\n")
                .append("</html>");
            
            writer.write(html.toString());
        } catch (IOException ex) {
            System.err.println("Errore! " + ex.getMessage());
        }
    }
}