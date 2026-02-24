import java.util.Scanner;
import java.time.LocalDateTime;

public class MainProgram {

    private static Garage garage = new Garage();

    public static void main(String[] args){
        int scelta = 0;

        do{
            scelta = menu();

            switch (scelta){
                case 1:
                    ingresso();
                    break;
                case 2:
                    uscita();
                    break;
                case 3:
                    infoGiornata();
                    break;
                case 0:
                    System.out.println("Uscita dal programma in corso...");
                    break;
                default:
                    System.out.println("Opzione non valida!");
                    break;
            }
        }while (scelta != 0);
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
        Scanner in = new Scanner(System.in);
        int posto;
        String targa, tipoDiVeicolo, tipoVeicoloRiservato, isRiservato, postoCheck;
        boolean riservato = false;

        System.out.print("Targa: ");
        targa = in.nextLine();
        System.out.print("Tipo di veicolo (A: Auto, M: Motocicletta, F: Furgone): ");
        tipoDiVeicolo = in.nextLine();
        System.out.print("Posto riservato? (Si/No)");
        isRiservato = in.nextLine();

        if (isRiservato.equals("Si") || isRiservato.equals("si")){
            riservato = true;
            System.out.print("Tipo veicolo riservato (Ambulanza, Polizia, ...): ");
            tipoVeicoloRiservato = in.nextLine();
        }else if (isRiservato.equals("No") || isRiservato.equals("no")){
            riservato = false;
            tipoVeicoloRiservato = null;
        }else {
            System.out.println("Non valido, il posto non sarà riservato");
            riservato = false;
            tipoVeicoloRiservato = null;
        }

        System.out.println(garage.getPostiLiberi());
        System.out.print("Scegli un posto libero (vuoto per selezione automatica): ");
        postoCheck = in.nextLine();

        if (postoCheck.equals("")){
            System.out.println("Assegnazione automatica selezionata!");
            posto = -1;
        }else{
            posto = Integer.parseInt(postoCheck);
        }

        garage.inserisciMacchina(targa, tipoDiVeicolo, tipoVeicoloRiservato, posto, riservato, LocalDateTime.now());

        System.out.println("Ingresso aggiunto correttamente!");
    }

    private static void uscita(){
        Scanner in = new Scanner(System.in);
        int posto = -1;
        String targa = "", checkPosto;

        System.out.println("Posto (vuoto se si vuole usare la targa del veicolo): ");
        checkPosto = in.nextLine();

        if (checkPosto.equals("")){
            System.out.println("Targa: ");
            targa = in.nextLine();
        }else{
            posto = Integer.parseInt(checkPosto);
        }

        garage.rimuoviMacchina(targa, posto, LocalDateTime.now());
    }

    private static void infoGiornata(){

    }
}