public abstract class Veicolo {
    protected String marca;
    protected String modello;

    protected Veicolo(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    protected abstract double calcolaConsumo(double km);

    public String info(){
        return "Marca: " + marca + "Modello: " + modello + "\n";
    }
}
