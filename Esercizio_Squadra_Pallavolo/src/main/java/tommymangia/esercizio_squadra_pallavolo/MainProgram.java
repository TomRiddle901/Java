/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.esercizio_squadra_pallavolo;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    public static void main(String[] args) {
        Pallavolo squadra = new Pallavolo("Squadra1", "IVB5493SAD");
        
        System.out.println(squadra.getNomeSquadra());
        System.out.println(squadra.getPartitaIva());
        System.out.println(squadra.getPartiteGiocate());
        System.out.println(squadra.getPartitePerse());
        System.out.println(squadra.getPunteggioTotale());
        System.out.println(squadra.toString());
        
        squadra.inserisciRisultato(3, 6);
        System.out.println(squadra.toString());
        
        squadra.inserisciRisultato(5, 5);
        squadra.inserisciRisultato(11, 0);
        squadra.inserisciRisultato(5, 0);
        squadra.inserisciRisultato(1, 3);
        squadra.inserisciRisultato(5, 10);
        
        System.out.println(squadra.toString());
    }
}
