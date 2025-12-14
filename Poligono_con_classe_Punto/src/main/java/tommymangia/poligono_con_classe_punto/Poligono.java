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
    public Poligono(int numeroPunti, Punto[] punti){
        
        if (puntiCoallineati(punti, numeroPunti)){
            throw new IllegalArgumentException(
                "Errore: tre o più punti sono allineati"
            );
        }
        this.numeroPunti = numeroPunti;
        this.punti = new Punto[numeroPunti];
        
        for (int i = 0; i < numeroPunti; i++){
            this.punti[i] = punti[i];
        }
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
        perimetro += punti[numeroPunti - 1].distanzaPunti(punti[0]);
        
        return perimetro;
    }
    
    private boolean puntiCoallineati(Punto[] p, int n){
        for (int i = 0; i < n; i++){;
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    double det = (p[j].getX() - p[i].getX()) * (p[k].getY() - p[i].getY()) - 
                                 (p[j].getY() - p[i].getY()) * (p[k].getX() - p[i].getX());
                    
                    if (det == 0){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}
