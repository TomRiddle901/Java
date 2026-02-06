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
        String codice, nome, cognome, tipo;
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
        System.out.print("Manager o Programmatore: ");
        tipo = in.nextLine();
        
        if (tipo.equals("Manager")){
            dipendenti.add(new Manager(codice, nome, cognome, dataAssunzione, stipendioBase));
        }else if (tipo.equals("Programmatore")){
            dipendenti.add(new Programmatore(codice, nome, cognome, dataAssunzione, stipendioBase));
        }else{
            System.out.println("Opzione non valida!");
        }
        System.out.println("Dipendente aggiunto!");
    }
    
    private static void assegnaManager(){
        Scanner in = new Scanner(System.in);
        String codiceProgrammatore, codiceManager;
        Manager man = null;
        Programmatore prog = null;
        
        System.out.print("Codice manager: ");
        codiceManager = in.nextLine();
        
        for (int i = 0; i < dipendenti.size(); i++){
            if (dipendenti.get(i).getCodice().equals(codiceManager)){
                man = (Manager) dipendenti.get(i);
            }
        }
        
        System.out.print("Codice programmatore: ");
        codiceProgrammatore = in.nextLine();
        
        for (int i = 0; i < dipendenti.size(); i++){
            if (dipendenti.get(i).getCodice().equals(codiceProgrammatore)){
                prog = (Programmatore) dipendenti.get(i);
            }
        }
        
        if (man != null && prog != null){
            man.aggiungiProgrammatore(prog);
            System.out.println("Programmatore asssegnato con successo!");
        }else{
            System.out.println("Nessun programmatore/manager trovato!");
        }
    }
    
    private static void modificaPercentualiContributo(){
        System.out.println("Non implementato!");
    }
    
    private static void calcolaStipendio(){
        Scanner in = new Scanner(System.in);
        String codice;
        Dipendente dip = null;
        
        System.out.print("Codice: ");
        codice = in.nextLine();
        
        for (int i = 0; i < dipendenti.size(); i++){
            if (dipendenti.get(i).getCodice().equals(codice)){
                dip = dipendenti.get(i);
            }
        }
        
        if (dip != null){
            System.out.println("Stipendio attuale di " + dip.getNome() + " " + dip.getCognome());
            System.out.println("Codice: " + dip.getCodice() + "\nData assunzione: " + dip.getDataAssunzione());
            System.out.println("Stipendio base: " + dip.getStipendioBase());
            System.out.println("Stipendio attuale: " + dip.calcolaStipendio());
        }else{
            System.out.println("Dipendente non trovato!");
        }
    }
}