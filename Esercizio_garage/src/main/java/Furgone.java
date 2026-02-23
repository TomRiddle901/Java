public class Furgone extends Veicolo{
    private static double tariffaOraria = 2;

    public Furgone(String targa){
        super(targa);
    }

    public double getTariffaOraria(){
        return tariffaOraria;
    }
}