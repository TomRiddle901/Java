public abstract class Veicolo {
    protected String targa;

    protected Veicolo(String targa){
        this.targa = targa;
    }

    public abstract double getTariffaOraria();

    public String getTarga(){
        return targa;
    }
}
