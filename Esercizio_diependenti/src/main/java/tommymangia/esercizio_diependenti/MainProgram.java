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

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int menu(){
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
}
