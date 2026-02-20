public class Moto extends Veicolo{
    private double consumoCentoChilometri;

    public Moto(String marca, String modello, double consumoCentoChilometri){
        super(marca, modello);
        this.consumoCentoChilometri = consumoCentoChilometri;
    }

    public double calcolaConsumo(double km){
        double consumo;

        consumo = km / consumoCentoChilometri;

        return consumo;
    }

    @Override
    public String info(){
        return "Consumo per cento chilometri: " + consumoCentoChilometri + " L";
    }
}