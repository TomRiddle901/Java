/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.poligono_con_classe_punto;

import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    public static void main(String[] args) {
        int scelta;
        
        do{
            scelta = menu();
            
            switch(scelta){
                case 1:
                    creaPoligono();
                    break;
                case 2:
                    System.out.println("Funzione non implementata!");
                case 3:
                    System.out.println("Funzione non implementata");
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                default:
                    System.out.println("Scelta non valida!");
            }
        } while(scelta != 0);
    }
    
    public static int menu(){
        int scelta;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Poligono!");
        System.out.println("1) Crea Poligono");
        System.out.println("2) Perimetro del Poligono");
        System.out.println("3) Area del Poligono");
        System.out.println("0) Esci");
        System.out.print("Scelta: ");
        
        try{
            scelta = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException ex) {
            System.err.println("Errore: " + ex.getMessage());
        }
        
        return scelta;
    }
    
    public static void creaPoligono(){
        Scanner in = new Scanner(System.in);
        String lato;
        int latoI;
        double x, y;
        
        try{
            System.out.print("Inserisci il numero dei lati: ");
            lato = in.nextLine();
            latoI = Integer.parseInt(lato);
            
            if (latoI < 3){
                throw new IllegalArgumentException("Un poligono deve avere 3 o più lati!");
            }
            
            Punto[] aP = new Punto[latoI];
            
            for (int i = 0; i < latoI; i++){
                System.out.print("Inserisci la coordinata X del " + (i + 1) + " punto: ");
                lato = in.nextLine();
                x = Double.parseDouble(lato);
                
                System.out.print("Inserisci la coordinata Y del " + (i + 1) + " punto: ");
                lato = in.nextLine();
                y = Double.parseDouble(lato);
                
                aP[i] = new Punto(x, y);
            }
            
            Poligono pol = new Poligono(latoI, aP);
        } catch (NumberFormatException ex) {
            System.err.println("Errore: Devi inserire un numero valido!");
            System.err.println("Più info: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.err.println("Errore: " + ex.getMessage());
        }
    }
}