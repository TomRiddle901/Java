import java.time.LocalDateTime;

public class Giornata {
    private LocalDateTime dataGiornata;
    private double importoTotale;

    public Giornata(LocalDateTime dataGiornata, double importoTotale){
        this.dataGiornata = dataGiornata;
        this.importoTotale = importoTotale;
    }

    public LocalDateTime getDataGiornata(){
        return dataGiornata;
    }

    public double getImportoTotale(){
        return importoTotale;
    }

    public void setImportoTotale(double importo){
        importoTotale += importo;
    }
}
