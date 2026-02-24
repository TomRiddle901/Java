import java.util.Scanner;
import java.time.LocalDateTime;

public class MainProgram {

    private static Garage garage = new Garage();

    public static void main(String[] args){

    }

    private static int menu(){
        int scelta = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1) Ingresso");
        System.out.println("2) Uscita");
        System.out.println("3) visualizza incassi di una giornata");
        System.out.print("Scelta: ");
        scelta = in.nextInt();

        return scelta;
    }

    private static void ingresso(){

    }

    private static void uscita(){

    }

    private static void infoGiornata(){

    }
}