import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Garage {
    private Posto[] posti;
    private ArrayList<Giornata> listaGiornate;

    public Garage(){
        this.posti = new Posto[100];
        this.listaGiornate = new ArrayList<>();
    }

    public void inserisciMacchina(String targa, String tipoDiVeicolo, String tipoDiVeicoloRiservato, int posto, boolean riservato, LocalDateTime ingresso){
        if (posto != -1 && posti[posto] == null){
            posti[posto] = new Posto(riservato, ingresso);
            posti[posto].inserisciVeicolo(targa, tipoDiVeicolo, tipoDiVeicoloRiservato);
        } else if (posto != -1 && posti[posto] != null){
            System.out.println("Il posto selezionato è già occupato.");
            System.out.println("Verrai asseganto ad un altro posto automaticamente!");
            for (int i = 0; i < 100; i++){
                if (posti[i] == null){
                    posti[i] = new Posto(riservato, ingresso);
                    posti[i].inserisciVeicolo(targa, tipoDiVeicolo, tipoDiVeicoloRiservato);
                }
            }
        }else if (posto == -1){
            for (int i = 0; i < 100; i++){
                if (posti[i] == null){
                    posti[i] = new Posto(riservato, ingresso);
                    posti[i].inserisciVeicolo(targa, tipoDiVeicolo, tipoDiVeicoloRiservato);
                }
            }
        }
    }

    public void rimuoviMacchina(String targa, int posto, LocalDateTime uscita){
        double tariffaDaPagare;
        if (posto != -1 && posti[posto] != null){
            tariffaDaPagare = posti[posto].calcolaTariffaOraria(uscita);
            System.out.println("Costo parcheggio: " + tariffaDaPagare);
            aggiungiGuadagnoGiornata(tariffaDaPagare, uscita.toLocalDate());
            posti[posto] = null;
        }else{
            for(int i = 0; i < 100; i++){
                if (posti[i].ottieniTarga().equals(targa)){
                    tariffaDaPagare = posti[i].calcolaTariffaOraria(uscita);
                    System.out.println("Costo parcheggio: " + tariffaDaPagare);
                    aggiungiGuadagnoGiornata(tariffaDaPagare, uscita.toLocalDate());
                    posti[i] = null;
                }
            }
        }
    }

    public double getGuadagnoGiornata(LocalDateTime dataGiornata){
        double importo = 0;
        for (int i = 0; i < listaGiornate.size(); i++){
            if (listaGiornate.get(i).getDataGiornata().equals(dataGiornata.toLocalDate())){
                importo = listaGiornate.get(i).getImportoTotale();
            }else{
                importo = -1;
            }
        }

        return importo;
    }

    public String getPostiLiberi(){
        String postiLiberi = "";
        for (int i = 0; i < posti.length; i++){
            if (posti[i] == null){
                postiLiberi += i + ", ";
            }
        }

        return postiLiberi;
    }

    private void aggiungiGuadagnoGiornata(double guadagnoPosto, LocalDate dataGuadagno){
        for (int i = 0; i < listaGiornate.size(); i++){
            if (listaGiornate.get(i).getDataGiornata().equals(dataGuadagno)){
                listaGiornate.get(i).setImportoTotale(guadagnoPosto);
            }else {
                listaGiornate.add(new Giornata(dataGuadagno, guadagnoPosto));
            }
        }
    }
}
