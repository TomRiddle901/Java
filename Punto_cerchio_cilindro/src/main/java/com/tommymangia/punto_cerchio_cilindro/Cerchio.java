/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.punto_cerchio_cilindro;

/**
 *
 * @author tommaso
 */
public class Cerchio extends Punto{
    // Attributi
    protected double raggio;
    
    // Costruttore
    public Cerchio(Punto punto, double raggio){
        super(punto.x, punto.y);
        this.raggio = raggio;
    }
    
    // Metodi
    public double getRaggio(){
        return raggio;
    }
    
    public double area(){
        double area;
        
        area = Math.PI * Math.pow(raggio, 2);
        
        return area;
    }
    
    public double circonferenza(){
        double circonferenza;
        
        circonferenza = 2 * Math.PI * raggio;
        
        return circonferenza;
    }
    
    public String toString(){
        return "Centro del cerchio: (" + x + "; " + y + "), raggio: " + raggio;
    }
}
