/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.esercizio_diependenti;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Tommaso
 */
public class MainProgram {

    private static ArrayList<Dipendente> dipendenti = new ArrayList<>();
    
    public static void main(String[] args) {
        int scelta;
        
        do{
            scelta = menu();
            
            switch (scelta) {
                case 1:
                    aggiungiDipendente();
                    break;
                case 2:
                    assegnaManager();
                    break;
                case 3:
                    modificaPercentualiContributo();
                    break;
                case 4:
                    calcolaStipendio();
                    break;
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                default:
                    System.out.println("Scelta non valida!");
            }
            
        }while(scelta != 0);
    }
    
    public static int menu(){
        int scelta;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Menù");
        System.out.println("1) Aggiungi dipendente");
        System.out.println("2) Assegna un manager ad un programmatore");
        System.out.println("3) Modifica percentuali ed il contributo");
        System.out.println("4) Calcola stipendio di un dipendente");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
        
        scelta = in.nextInt();
        
        return scelta;
    }
    
    private static void aggiungiDipendente(){
        String codice, nome, cognome;
        LocalDate dataAssunzione;
        double stipendioBase;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Codice: ");
        codice = in.nextLine();
        System.out.print("Nome: ");
        nome = in.nextLine();
        System.out.print("Cognome: ");
        cognome = in.nextLine();
        System.out.print("Data assunzione (GG/MM/AAAA): ");
        dataAssunzione = LocalDate.parse(in.nextLine());
        System.out.print("Stipendio iniziale: ");
        stipendioBase = in.nextDouble();
        System.out.println("Non implementato!");
    }
    
    private static void assegnaManager(){
        System.out.println("Non implementato!");
    }
    
    private static void modificaPercentualiContributo(){
        System.out.println("Non implementato!");
    }
    
    private static void calcolaStipendio(){
        System.out.println("Non implementato!");
    }
}