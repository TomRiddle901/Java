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
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }
    
    // Metodi
    
    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    // Traslazione
    public void trasla(double x, double y){
        
    }
    
    public double distanzaPunti(Punto punto2){
        double distanza = (double)Math.sqrt(Math.pow(punto2.x - this.x, 2) + Math.pow(punto2.y - this.y, 2));
        return distanza;
    }
}
