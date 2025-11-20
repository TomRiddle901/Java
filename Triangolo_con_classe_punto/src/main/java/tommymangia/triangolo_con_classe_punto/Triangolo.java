/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.triangolo_con_classe_punto;

/**
 *
 * @author tommaso
 */
public class Triangolo {
    // Attributi
    private Punto a;
    private Punto b;
    private Punto c;
    
    // Costruttori

    public Triangolo(){
        
    }

    public Triangolo(Punto a, Punto b, Punto c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Triangolo(Triangolo t){
        this.a = t.a;
        this.b = t.b;
        this.c = t.c;
    }
    
    // Metodi
    
}
