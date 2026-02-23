import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;

public class Garage {
    private Posto[] posti;
    private ArrayList<Giornata> listaGiornate;

    public Garage(){
        this.posti = new Posto[100];
        this.listaGiornate = new ArrayList<>();
    }

    public void inserisciMacchina(String targa, String tipoDiVeicolo, int posto, boolean riservato, LocalTime ingresso){
        if (posti[posto] != null){
            posti[posto] = new Posto(riservato, ingresso);
            posti[posto].inserisciVeicolo(targa, tipoDiVeicolo);
        } else{
            System.out.println("Il posto selezionato è già occupato.");
            System.out.println("Verrai asseganto ad un altro posto automaticamente!");
            for (int i = 0; i < 100; i++){
                if (posti[i] != null){
                    posti[i] = new Posto(riservato, ingresso);
                    posti[i].inserisciVeicolo(targa, tipoDiVeicolo);
                }
            }
        }
    }

    public void rimuoviMacchina(String targa, int posto, LocalTime uscita){
        if (posti[posto] != null){
            System.out.println("Costo parcheggio: " + posti[posto].calcolaTariffaOraria(uscita));
            posti[posto] = null;
        }else{
            for(int i = 0; i < 100; i++){
                if (posti[i].ottieniTarga().equals(targa)){
                    System.out.println("Costo parcheggio: " + posti[i].calcolaTariffaOraria(uscita));
                    posti[i] = null;
                }
            }
        }
    }
}
