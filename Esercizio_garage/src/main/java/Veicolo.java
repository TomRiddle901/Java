public abstract class Veicolo {
    protected String targa;
    protected String veicoloRiservato;

    protected Veicolo(String targa, String veicoloRiservato){
        this.targa = targa;
    }

    public abstract double getTariffaOraria();

    public String getTarga(){
        return targa;
    }
}
