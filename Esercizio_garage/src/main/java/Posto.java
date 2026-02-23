import java.time.LocalTime;
import java.time.Duration;

public class Posto {
    private boolean riservato;
    private LocalTime inizioSosta;
    private Veicolo veicolo;

    public Posto(boolean riservato, LocalTime inizioSosta) {
        this.riservato = riservato;
        this.inizioSosta = inizioSosta;
        this.veicolo = null;
    }

    public void inserisciVeicolo(String targa, String tipo) {
        if (tipo.equals("A") || tipo.equals("a")) {
            veicolo = new Macchina(targa);
        } else if (tipo.equals("M") || tipo.equals("m")) {
            veicolo = new Motocicletta(targa);
        } else if (tipo.equals("F") || tipo.equals("f")) {
            veicolo = new Furgone(targa);
        } else {
            System.out.println("Veicolo inesistente!");
        }
    }

    public double calcolaTariffaOraria(LocalTime fineSosta) {
        double tariffaTotale = 0;
        Duration oreSosta = null;

        oreSosta = Duration.between(inizioSosta, fineSosta);

        tariffaTotale = veicolo.getTariffaOraria() * oreSosta.toHours();

        return tariffaTotale;
    }

    public String ottieniTarga(){
        return veicolo.getTarga();
    }
}