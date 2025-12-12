/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.esercizio_classe_calciatore;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    public static void main(String[] args) {
        int golStagione = 0;
        
        Calciatore giocatore1 = new Calciatore();
        Calciatore giocatore2 = new Calciatore(giocatore1);
        Calciatore giocatore3 = new Calciatore("Mario", "Rossi", LocalDate.of(2025, 3, 24), 'A', "Italia");
        
        giocatore1.setNome("Francesco");
        giocatore1.setCognome("Totti");
        giocatore1.setDataNascita(LocalDate.of(1976, 9, 27));
        giocatore1.setNazionalita("Italia");
        giocatore1.setRuolo('A');
        giocatore1.inserisciStagione("2000/2001", 10);
        giocatore1.inserisciStagione("2001/2002", 5);
        giocatore1.inserisciStagione("2002/2003", 40);
        giocatore1.inserisciStagione("2003/2004", 0);
        giocatore1.inserisciStagione("2005/2006", 1);
        giocatore1.inserisciStagione("2007/2008", 4);
        giocatore1.inserisciStagione("2009/2010", 7);
        giocatore1.inserisciStagione("2010/2011", 20);
        giocatore1.inserisciStagione("2011/2012", 23);
        giocatore1.inserisciStagione("2012/2013", 5);
        
        golStagione = giocatore1.golStagione("2000/2001");
        
        if (golStagione != -1){
            System.out.println(golStagione);
        } else{
            System.out.println("Nessun Gol nella stagione!");
        }
        
        System.out.println("Gol totali di " + giocatore1.getNome() + " " + giocatore1.getCognome() + ":");
        System.out.println(giocatore1.golTotali());
        
        System.out.println(giocatore1.toString());
        System.out.println(giocatore2.toString());
        System.out.println(giocatore3.toString());
        
        giocatore3.setRuolo('P');
        System.out.println(giocatore3.toString());
        System.out.println(giocatore3.nome + " è un portiere? " + giocatore3.isMovimento());
    }
}
