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
    public Cerchio(double x, double y, double raggio){
        super(x, y);
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
}
