public class Moto extends Veicolo{
    private double consumoCentoChilometri;

    public Moto(String marca, String modello, double consumoCentoChilometri){
        super(marca, modello);
        this.consumoCentoChilometri = consumoCentoChilometri;
    }

    public double calcolaConsumo(double km){
        return 0;
    }

    public double getConsumoCentoChilometri() {
        return consumoCentoChilometri;
    }
}