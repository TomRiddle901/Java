import java.time.LocalDate;

public class Giornata {
    private LocalDate dataGiornata;
    private double importoTotale;

    public Giornata(LocalDate dataGiornata, double importoTotale){
        this.dataGiornata = dataGiornata;
        this.importoTotale = importoTotale;
    }
}
