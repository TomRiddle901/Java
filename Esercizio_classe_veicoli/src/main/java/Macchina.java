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

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public double getConsumoCentoChilometri() {
        return consumoCentoChilometri;
    }
}
