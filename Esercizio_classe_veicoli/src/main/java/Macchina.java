public class Macchina extends Veicolo{
    private int numeroPosti;
    private String tipoCarburante;
    private double consumoCentoChilometri;

    public Macchina(String marca, String modello, int numeroPosti, String tipoCarburante, double consumoCentoChilometri){
        super(marca, modello);
        this.numeroPosti = numeroPosti;
        this.tipoCarburante = tipoCarburante;
        this.consumoCentoChilometri = consumoCentoChilometri;
    }

    public double calcolaConsumo(double km){
        double consumo;

        consumo = km / consumoCentoChilometri;

        return consumo;
    }

    @Override
    public String info(){
        return "Numero posti: " + numeroPosti + "Tipo di carburante: " + tipoCarburante + "Consumo per cento chilometri: " + consumoCentoChilometri + " L";
    }
}
