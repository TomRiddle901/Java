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

    public static void main(String[] args) {
        int scelta;
        
        do{
            scelta = visualizzaMenu();
            
            switch(scelta){
                case 1:
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
            System.out.println("Opzione non consentita!");
            return -1;
        }
        return scelta;
    }
}
