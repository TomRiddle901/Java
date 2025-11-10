/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.company.prova1;

/**
 *
 * @author tommaso
 */
public class Prova1 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Mario", "Rossi");
        Persona p3 = new Persona(p1);
        Persona p4 = p1;
        
        System.out.println("p1 " + p1.hashCode());
        System.out.println("p2 " + p2.hashCode());
        System.out.println("p3 " + p3.hashCode());
        System.out.println("p4 " + p4.hashCode());
        
        System.out.println(p1.toString() + " " + p1.hashCode());
        System.out.println(p2.toString() + " " + p2.hashCode());
        System.out.println(p3.toString() + " " + p3.hashCode());
        System.out.println(p4.toString() + " " + p4.hashCode());
    }
}