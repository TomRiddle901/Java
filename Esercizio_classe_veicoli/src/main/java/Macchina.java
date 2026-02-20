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
}
