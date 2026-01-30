/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.punto_cerchio_cilindro;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    public static void main(String[] args) {
        Punto p = new Punto(5, 6.2);
        Punto p2 = new Punto(11.2, 12.6665);
        Cerchio cerchio = new Cerchio(p, 5);
        Cilindro cilindro = new Cilindro(p, cerchio.getRaggio(), 15);
        
        System.out.println("Distanza da p1 a p2: " + p.distanzaPunto(p2));
        System.out.println("Distanza punto da cerchio: " + p.distanzaPuntoCerchio(cerchio));
        System.out.println(p.toString());
        
        System.out.println("Area del cerchio: " + cerchio.area());
        System.out.println("Circonferenza cerchio: " + cerchio.circonferenza());
        System.out.println(cerchio.toString());
        
        System.out.println("Area superficie cilindro: " + cilindro.areaSuperficie());
        System.out.println("Volume cilindro: " + cilindro.volume());
        System.out.println(cilindro.toString());
    }
}