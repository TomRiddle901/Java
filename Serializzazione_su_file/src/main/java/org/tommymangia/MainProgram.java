package org.tommymangia;

// Libraries
import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;

public class MainProgram {

    // Arraylist di punti
    public static ArrayList<Punto> punti = new ArrayList<>();

    static void main(String[] args){
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
                    importaPunti();
                    break;
                default:
                    System.out.println("Scelta non valida!");
                    break;
            } while (scelta != 0);
        }
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
            System.out.println("Nome: " + punti.get(i).toString());
        }
    }
}
