public class Macchina extends Veicolo{
    private static double tariffaOraria = 1.5;

    public Macchina(String targa, String veicoloRiservato){
        super(targa, veicoloRiservato);
    }

    public double getTariffaOraria(){
        return tariffaOraria;
    }
}