/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.triangolo_con_classe_punto;

/**
 *
 * @author tommaso
 */
public class Punto {
    // Abbributi
    private double x;
    private double y;
    
    // Costruttori
    public Punto(){
        
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }
    
}
