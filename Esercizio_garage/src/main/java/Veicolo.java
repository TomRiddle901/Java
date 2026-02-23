public abstract class Veicolo {
    protected String targa;

    public Veicolo(String targa){
        this.targa = targa;
    }

    public abstract double getTariffaOraria();
}
