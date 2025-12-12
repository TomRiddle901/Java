/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.poligono_con_classe_punto;

/**
 *
 * @author tommaso
 */
public class Poligono {
    // Attributi
    private int numeroPunti;
    private Punto[] punti;
    
    // Costruttori
    public Poligono(){
        
    }
    
    public Poligono(int numeroPunti, Punto[] punti){
        this.numeroPunti = numeroPunti;
        this.punti = new Punto[numeroPunti];
    }
    
    // Metodi
    
    // Setter
    public void setNumeroPunti(int punti){
        numeroPunti = punti;
    }
    
    public void setPunto(Punto[] punti){
        this.punti = punti;
    }
    
    public double perimetro(){
        double perimetro = 0;
        
        for (int i = 0; i < numeroPunti - 1; i++){
            perimetro += punti[i].distanzaPunti(punti[i + 1]);
        }
        
        // Ultimo lato che chiude il poligono
        perimetro = punti[numeroPunti - 1].distanzaPunti(punti[0]);
        
        return perimetro;
    }
}
