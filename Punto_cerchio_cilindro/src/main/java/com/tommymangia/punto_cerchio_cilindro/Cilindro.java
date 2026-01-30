/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tommymangia.punto_cerchio_cilindro;

/**
 *
 * @author tommaso
 */
public class Cilindro extends Cerchio{
    // Attributi
    private double altezza;
    
    // Cstruttore
    public Cilindro(double x, double y, double raggio, double altezza){
        super(x, y, raggio);;
        this.altezza = altezza;
    }
    
    // Metodi
    public double areaSuperficie(){
        double areaSuper;
        
        areaSuper = 2 * area() + circonferenza() * altezza;
        
        return areaSuper;
    }
}