public class Moto extends Veicolo{
    private double consumoCentoChilometri;

    public Moto(String marca, String modello, double consumoCentoChilometri){
        super(marca, modello);
        this.consumoCentoChilometri = consumoCentoChilometri;
    }
}