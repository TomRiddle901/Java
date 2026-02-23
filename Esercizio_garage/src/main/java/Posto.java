import java.time.LocalTime;

public class Posto {
    private boolean riservato;
    private LocalTime inizioSosta;

    public Posto(boolean riservato, LocalTime inizioSosta){
        this.riservato = riservato;
        this.inizioSosta = inizioSosta;
    }
}
