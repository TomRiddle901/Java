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
    public double area(){
        double area = 0, distanzaAb, distanzaBc, distanzaCa, semiPerimetro;
        
        distanzaAb = this.a.distanzaPunti(b);
        distanzaBc = this.b.distanzaPunti(c);
        distanzaCa = this.c.distanzaPunti(a);
        
        semiPerimetro = (distanzaAb + distanzaBc + distanzaCa) / 2;
        
        area = Math.sqrt(semiPerimetro * (semiPerimetro - distanzaAb) * (semiPerimetro - distanzaBc) * (semiPerimetro - distanzaCa));
        
        return area;
    }

    public double perimetro(){
        double distanzaAb, distanzaBc, distanzaCa, perimetro;
        
        distanzaAb = this.a.distanzaPunti(b);
        distanzaBc = this.b.distanzaPunti(c);
        distanzaCa = this.c.distanzaPunti(a);
        
        perimetro = distanzaAb + distanzaBc + distanzaCa;
        return perimetro;
    }
    
    public void trasla(double x, double y){
        a.trasla(x, y);
        b.trasla(x, y);
        c.trasla(x, y);
    }
    
    /*
    public boolean equals(Triangolo t){
        if (t == null){
            return false;
        } else if (this.a.getX() != t.a.getX() || this.a.getY() != t.a.getY()){
            return false;
        } else if (this.b.getX() != t.b.getX() || this.b.getY() != t.b.getY()){
            return false;
        } else if (this.c.getX() != t.c.getX() || this.c.getY() != t.c.getY()){
            return false;
        } else{
            return true;
        }
    }
    */
    public String toString(){
        return "Punto A(" + this.a.getX() + "; " + this.a.getY() + ")\n" +
               "Punto B(" + this.b.getX() + "; " + this.b.getY() + ")\n" +
               "Punto C(" + this.c.getX() + "; " + this.c.getY() + ")\n";
    }
}