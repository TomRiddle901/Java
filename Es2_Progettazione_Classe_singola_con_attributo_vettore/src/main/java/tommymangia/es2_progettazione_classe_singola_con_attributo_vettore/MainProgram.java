/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.es2_progettazione_classe_singola_con_attributo_vettore;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    private static Studente[] classe;

    public static void main(String[] args) {
	classe = new Studente[20];
        classe[0] = new Studente(12345, "Beka", "Abdycadyrov", LocalDate.of(2008, 03, 31), 'M');
    }
}