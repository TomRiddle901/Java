/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.progettazione_classe_punto_triangolo;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    // Main del progetto
    public static void main(String[] args) {
        Punto origine = new Punto(); // Creo un oggetto origine di tipo punto con new Punto() si invoca il costrutture Punto()
        Punto punto1 = new Punto(3, 2, "Punto 1"); // Invoco e popolo il costruttore parametrico con punto1
        Punto punto2 = new Punto(7, 11, "Punto 2");
        Punto puntoCopia = new Punto(punto1); // Invoco il costgruttore copia quindi ora punto1 e puntoCopia hanno gli stessi valori
        
        System.out.println("Origine: " + origine.toString()); // Stampa rappresentazione punto origine
        System.out.println(punto1.toString()); // Stampa rappresentazione punto1
        System.out.println(punto2.toString()); // Stampa rappresentazione punto2
        System.out.println(puntoCopia.toString() + "Copia"); // Stampa rappresentazione puntoCopia
        
        // Stampa dei singoli dati
        System.out.println("X punto " + origine.getNome() + ": " + origine.getX());
        System.out.println("Y punto " + origine.getNome() + ": " + origine.getY());
        System.out.println("X punto " + punto1.getNome() + ": " + punto1.getX());
        System.out.println("Y punto " + punto2.getNome() + ": " + punto2.getY());
        System.out.println("X punto " + puntoCopia.getNome() + ": " + puntoCopia.getX());
        System.out.println("Y punto " + puntoCopia.getNome() + ": " + puntoCopia.getY());
        
        // Stampa distanza tra 2 punti (punto1 e punto2)
        System.out.println("Distanza tra putno 1 e punto 2: " + punto1.distanzaPunti(punto2));
        
        // Stampa delle distanza dal centro
        System.out.println("Distanza di " + punto1.toString() + " dal centro: " + punto1.distanzaCentro(punto1));
        System.out.println("Distanza di " + punto2.toString() + " dal centro: " + punto2.distanzaCentro(punto2));
        System.out.println("Distanza di " + origine.toString() + " dal centro: " + origine.distanzaCentro(origine));
    }
}