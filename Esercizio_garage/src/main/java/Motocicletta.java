public class Motocicletta extends Veicolo{
    protected static double tariffaOraria = 1;

    public Motocicletta(String targa){
        super(targa);
    }

    public static double getTariffaOraria(){
        return tariffaOraria;
    }
}