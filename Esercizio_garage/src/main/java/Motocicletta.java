public class Motocicletta extends Veicolo{
    private static double tariffaOraria = 1;

    public Motocicletta(String targa,String veicoloRiservato){
        super(targa, veicoloRiservato);
    }

    public double getTariffaOraria(){
        return tariffaOraria;
    }
}