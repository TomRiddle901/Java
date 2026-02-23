public class Macchina extends Veicolo{
    private static double tariffaOraria = 1.5;

    public Macchina(String targa){
        super(targa);
    }

    public static double tariffaOraria(){
        return tariffaOraria;
    }
}