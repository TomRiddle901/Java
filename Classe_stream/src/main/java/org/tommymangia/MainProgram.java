package org.tommymangia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProgram {

    public static ArrayList<Punto> punti = new ArrayList();

    public static void main(String[] args){
        int scelta;

        do{
            scelta = menu();

            switch (scelta){
                case 1:
                    aggiungiPunto();
                    break;
                case 2:
                    visualizzaPunti();
                    break;
                case 3:
                    punti.clear();
                    System.out.println("Punti rimossi con successo!");
                    break;
                case 4:
                    esportaPunti();
                    break;
                case 5:
                    // importaPunti();
                    System.out.println("Non implementato!");
                    break;
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while (scelta != 0);
      }

    private static int menu(){
        int scelta;
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Menu");
            System.out.println("1) Aggiungi un punto");
            System.out.println("2) Visualizza i punti");
            System.out.println("3) Elimina tutti i punti");
            System.out.println("4) Esporta su file");
            System.out.println("5) Importa da file");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();

            return scelta;
        }catch (InputMismatchException ex){
            System.err.println("Errore: " + ex.getMessage());
            System.err.println("Input non valido");
            return -1;
        }
    }

    private static void aggiungiPunto(){
        Scanner in = new Scanner(System.in);
        double x, y;
        String nome;

        try{
            System.out.print("X: ");
            x = in.nextDouble();
            System.out.print("Y: ");
            y = in.nextDouble();
            in.nextLine();
            System.out.print("Nome: ");
            nome = in.nextLine();
            punti.add(new Punto(x, y, nome));
        }catch (InputMismatchException ex){
            System.err.println("Errore: " + ex.getMessage());
            System.err.println("Input non valido");
        }

    }

    private static void visualizzaPunti(){
        for (int i = 0; i < punti.size(); i++){
            System.out.println(punti.get(i).toString());
        }
    }

    private static void esportaPunti(){
        try {
            FileWriter file = new FileWriter("punti.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            for (int i = 0; i < punti.size(); i++) {
                buffer.write(punti.get(i).toCSV());
                buffer.newLine();
            }
            buffer.close();
        }catch (IOException ex){
            System.err.println("Errore di input/output: " + ex.getMessage());
        }
    }
}