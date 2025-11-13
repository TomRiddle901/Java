/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.classe_singola_con_array_paralleli;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    private static Libreria libreria;
    
    public static void main(String[] args) {
        boolean aggiornato;
        
        libreria = new Libreria("Test", "via libreria", "1234567890", "mail@mail");
        
        libreria.aggiungiLibro("A878987AAA", "La Sacra bibbia", "Dio", 10000);
        libreria.aggiungiLibro("86ASAS8D5A", "Il Signore Degli Anelli", "J.R.R. Tolkien", 2345);
        libreria.aggiungiLibro("V3245KJG4K", "Topolino", "Walt Disney", 5);
        libreria.aggiungiLibro("897AFS6GAD", "Guerra e Pace", "Tolstoj", 542);
        
        System.out.println(libreria.stampaLibreria());
        
        libreria.ricercaLibro("86ASAS8D5A");
        libreria.ricercaLibro("897AFS6GAD");
        
        aggiornato = libreria.aggiornaCopie("A878987AAA", 300);
        
        if (aggiornato){
            System.out.println("Copie aggiornate");
        } else{
            System.out.println("Copie non aggiornate");
        }
        
        System.out.println(libreria.stampaLibreria());
    }
}