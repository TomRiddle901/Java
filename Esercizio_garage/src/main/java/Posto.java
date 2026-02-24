import java.time.LocalTime;
import java.time.Duration;

public class Posto {
    private boolean riservato = false;
    private LocalTime inizioSosta;
    private Veicolo veicolo;

    public Posto(boolean riservato, LocalTime inizioSosta) {
        this.riservato = riservato;
        this.inizioSosta = inizioSosta;
        this.veicolo = null;
    }

    public void inserisciVeicolo(String targa, String tipo, String tipoVeicoloRiservato) {
        if (riservato){
            if (tipo.equals("A") || tipo.equals("a")) {
                veicolo = new Macchina(targa, tipoVeicoloRiservato);
            } else if (tipo.equals("M") || tipo.equals("m")) {
                veicolo = new Motocicletta(targa, tipoVeicoloRiservato);
            } else if (tipo.equals("F") || tipo.equals("f")) {
                veicolo = new Furgone(targa, tipoVeicoloRiservato);
            } else {
                System.out.println("Veicolo inesistente!");
            }
        }else{
            if (tipo.equals("A") || tipo.equals("a")) {
                veicolo = new Macchina(targa, null);
            } else if (tipo.equals("M") || tipo.equals("m")) {
                veicolo = new Motocicletta(targa, null);
            } else if (tipo.equals("F") || tipo.equals("f")) {
                veicolo = new Furgone(targa, null);
            } else {
                System.out.println("Veicolo inesistente!");
            }
        }
    }

    public double calcolaTariffaOraria(LocalTime fineSosta) {
        double tariffaTotale = 0;
        Duration oreSosta = null;

        if (riservato){
            return 0;
        }

        oreSosta = Duration.between(inizioSosta, fineSosta);

        tariffaTotale = veicolo.getTariffaOraria() * oreSosta.toHours();

        return tariffaTotale;
    }

    public String ottieniTarga(){
        return veicolo.getTarga();
    }
}