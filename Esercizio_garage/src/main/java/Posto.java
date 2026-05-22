import java.time.LocalDateTime;
import java.time.Duration;

public class Posto {
    private boolean riservato;
    private LocalDateTime inizioSosta;
    private Veicolo veicolo;

    public Posto(boolean riservato, LocalDateTime inizioSosta) {
        this.riservato = riservato;
        this.inizioSosta = inizioSosta;
        this.veicolo = null;
    }

    public void inserisciVeicolo(String targa, String tipo, String tipoVeicoloRiservato) {
        if (riservato){
            switch (tipo){
                case "A", "a":
                    veicolo = new Macchina(targa, tipoVeicoloRiservato);
                    break;
                case "M", "m":
                    veicolo = new Motocicletta(targa, tipoVeicoloRiservato);
                    break;
                case "F", "f":
                    veicolo = new Furgone(targa, tipoVeicoloRiservato);
                default:
                    System.out.println("Veicolo inesistente!");
            }
            /*if (tipo.equals("A") || tipo.equals("a")) {
                veicolo = new Macchina(targa, tipoVeicoloRiservato);
            } else if (tipo.equals("M") || tipo.equals("m")) {
                veicolo = new Motocicletta(targa, tipoVeicoloRiservato);
            } else if (tipo.equals("F") || tipo.equals("f")) {
                veicolo = new Furgone(targa, tipoVeicoloRiservato);
            } else {
                System.out.println("Veicolo inesistente!");
            }*/
        }else{
            switch (tipo){
                case "A", "a":
                    veicolo = new Macchina(targa, null);
                    break;
                case "M", "m":
                    veicolo = new Motocicletta(targa, null);
                    break;
                case "F", "f":
                    veicolo = new Furgone(targa, null);
                    break;
                default:
                    System.out.println("Veicolo inesistente!");
            }
            /*if (tipo.equals("A") || tipo.equals("a")) {
                veicolo = new Macchina(targa, null);
            } else if (tipo.equals("M") || tipo.equals("m")) {
                veicolo = new Motocicletta(targa, null);
            } else if (tipo.equals("F") || tipo.equals("f")) {
                veicolo = new Furgone(targa, null);
            } else {
                System.out.println("Veicolo inesistente!");
            }*/
        }
    }

    public double calcolaTariffaOraria(LocalDateTime fineSosta) {
        double tariffaTotale;
        Duration oreSosta;

        if (riservato){
            return 0;
        }

        oreSosta = Duration.between(inizioSosta, fineSosta);

        tariffaTotale = veicolo.getTariffaOraria() * oreSosta.toHours();

        if (tariffaTotale == 0){
            return veicolo.getTariffaOraria();
        }else{
            return tariffaTotale;
        }
    }

    public String ottieniTarga(){
        return veicolo.getTarga();
    }
}