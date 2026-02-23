import java.util.ArrayList;

public class Garage {
    private Posto[] posti;
    private ArrayList<Giornata> listaGiornate;

    public Garage(){
        this.posti = new Posto[100];
        this.listaGiornate = new ArrayList<>();
    }
}
