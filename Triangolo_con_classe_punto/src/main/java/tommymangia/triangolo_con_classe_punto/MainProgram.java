/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.triangolo_con_classe_punto;

import java.util.Scanner;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    private static Triangolo t = new Triangolo();
    
    public static void main(String[] args) {
        int scelta;
        
        do{
            scelta = visualizzaMenu();
            
            switch(scelta){
                case 1:
                    creaTriangolo();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opzione non consentita!");
            }
        } while (scelta != 0);
    }
    
    public static int visualizzaMenu(){
        int scelta;
        Scanner in = new Scanner(System.in);
        System.out.println("1) Crea Triagolo");
        System.out.println("2) Visualizza Area");
        System.out.println("3) Visualizza Perimetro");
        System.out.println("4) Trasla");
        System.out.println("5) Informazioni");
        System.out.println("0) Uscita");
        System.out.print("Scelta: ");
        try{
            scelta = Integer.parseInt(in.nextLine());
        } catch(NumberFormatException e){
            return -1;
        }
        return scelta;
    }
    
    public static void creaTriangolo(){
        Scanner in = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3;
        boolean valid = true;
        try{
            System.out.print("Inserire coordinata X del vertice A: ");
            x1 = Double.parseDouble(in.nextLine());
            System.out.print("Inserire coordinata Y del vertice A: ");
            y1 = Double.parseDouble(in.nextLine());
            
            System.out.print("Inserire coordinata X del vertice B: ");
            x2 = Double.parseDouble(in.nextLine());
            System.out.print("Inserire coordinata Y del vertice B: ");
            y2 = Double.parseDouble(in.nextLine());
            
            System.out.print("Inserire coordinata X del vertice C: ");
            x3 = Double.parseDouble(in.nextLine());
            System.out.print("Inserire coordinata Y del vertice C: ");
            y3 = Double.parseDouble(in.nextLine());
            
            try{
                t = new Triangolo(new Punto(x1, y1), new Punto(x2, y2), new Punto(x3, y3));
            } catch (IllegalArgumentException ex) {
                System.err.println("Non puoi costrutire un Triangolo con 3 punti che giaciono nella stessa retta");
            }
        } catch (NumberFormatException e){
        }
    }
}