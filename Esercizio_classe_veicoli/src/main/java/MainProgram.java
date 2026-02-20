import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    private static ArrayList<Veicolo> listaVeicoli = new ArrayList<>();

    public static void main(String[] args){

    }

    private static int menu(){
        int scelta;

        System.out.println("Menù");
        System.out.println("1) Aggiungi un veicolo");
        System.out.println("2) Calcola consumo per 100Km");
        System.out.println("3) Stampa informazioni veicolo");
        System.out.println("0) Esci");
    }
}