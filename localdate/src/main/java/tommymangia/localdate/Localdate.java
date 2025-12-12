/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.localdate;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author tommaso
 */
public class Localdate {

    public static void main(String[] args) {
        LocalDate natale = LocalDate.of(2025, 12, 25); // Data impostata a mano
        LocalDate oggi = LocalDate.now(); // Data di oggi
        
        System.out.println(oggi.toString()); // Giorno di oggi
        System.out.println(natale.toString()); // Natale
        
        Period periodo = Period.between(natale, oggi); // Periodo
        System.out.println(periodo.toString()); // Periodo
        
        System.out.println(periodo.getDays()); // Giorni rimanenti tra oggi e natale
        System.out.println("Mesi: " + periodo.getMonths() + " Giorni: " + periodo.getDays()); // Giorni e mesi rimanenti a natale
    }
}
