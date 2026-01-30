/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.punto_cerchio_cilindro;

/**
 *
 * @author tommaso
 */
public class Punto {
    // Attributi
    protected double x;
    protected double y;
    
    // Costruttore
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // Metodi
    public double distanzaPunto(Punto puntoDue){
        double distanza;
        
        distanza = Math.sqrt(Math.pow(this.x - puntoDue.x, 2) + Math.pow(this.y - puntoDue.y, 2));
        
        return distanza;
    }
}
