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
        String marca, modello, tipoCarburante, scelta;
        int numeroPosti;
        double consumoCentoChilometri;

        System.out.print("Marca: ");
        marca = in.nextLine();
        System.out.print("Modello: ");
        modello = in.nextLine();
        System.out.print("Auto (A) o Moto (M): ");
        scelta = in.nextLine();

        if (scelta.equals("A") || scelta.equals("a")){
            System.out.print("Numero posti: ");
            in.nextLine();
            numeroPosti = in.nextInt();
            System.out.print("Tipo di carburante: ");
            tipoCarburante = in.nextLine();
            System.out.print("Consumo per cento chilometri: ");
            consumoCentoChilometri = in.nextDouble();

            listaVeicoli.add(new Macchina(marca, modello, numeroPosti, tipoCarburante, consumoCentoChilometri));

            System.out.println("Automobile aggiunta con successo!");
        }else if (scelta.equals("M") || scelta.equals("m")){
            System.out.print("Consumo per cento chilometri: ");
            consumoCentoChilometri = in.nextDouble();

            listaVeicoli.add(new Moto(marca, modello, consumoCentoChilometri));

            System.out.println("Moto aggiunta con successo!");
        }else{
            System.out.println("Impossibile aggiungere veicolo!");
            System.out.println("Scelta non valida o errore sconosciuto");
        }
    }

    public static void calcolaConsumoCentoChilometri(){
        Scanner in =  new Scanner(System.in);
        String marcaDaCercare, modelloDaCercare;
        double chilometri;
        Veicolo veic = null;

        System.out.println("Calcolo del consumo");
        System.out.print("Marca: ");
        marcaDaCercare = in.nextLine();
        System.out.print("Modello: ");
        modelloDaCercare = in.nextLine();
        System.out.print("Chilometri: ");
        chilometri = in.nextDouble();

        for (int i = 0; i < listaVeicoli.size(); i++){
            if (listaVeicoli.get(i).getMarca().equals(marcaDaCercare)){
                if (listaVeicoli.get(i).getModello().equals(modelloDaCercare)){
                    veic = listaVeicoli.get(i);
                }
            }
        }

        if (veic != null){
            System.out.println("Litri consumati per " + chilometri + "km: " + veic.calcolaConsumo(chilometri) + "L");
        }else{
            System.out.println("Veicolo non trovato!");
        }
    }

    public static void infoVeicolo(){

    }
}