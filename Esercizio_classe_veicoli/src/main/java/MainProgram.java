import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    private static ArrayList<Veicolo> listaVeicoli = new ArrayList<>();

    public static void main(String[] args){
        int scelta;

        do{
            scelta = menu();
            switch (scelta){
                case 1:
                    aggiungiVeicolo();
                    break;
                case 2:
                    calcolaConsumoCentoChilometri();
                    break;
                case 3:
                    infoVeicolo();
                    break;
                case 0:
                    System.out.println("UScita dal programma in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        } while(scelta != 0);
    }

    private static int menu(){
        int scelta;
        Scanner in = new Scanner(System.in);

        System.out.println("Menù");
        System.out.println("1) Aggiungi un veicolo");
        System.out.println("2) Calcola consumo per 100Km");
        System.out.println("3) Stampa informazioni veicolo");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
        scelta = in.nextInt();

        return scelta;
    }

    private static void aggiungiVeicolo(){
        Scanner in = new Scanner(System.in);
        Macchina mac = null;
        Moto mot = null;


    }
}