/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettazione_classe_punto;

/**
 *
 * @author tommaso
 */
public class Punto {
    // Attributi
    private float x;
    private float y;
    private String nome;
    
    // Costruttore di default
    public Punto() {
        x = 0;
        y = 0;
        nome = "Origine";
    }
    
    public Punto(float x, float y, String nome){
        this.x=x;
        this.y=y;
        this.nome=nome;
    }
    
    // Copia della classe Punto()
    public Punto(Punto p){
        this.x=p.x;
        this.y=p.y;
        this.nome=p.nome;
    }
    
    // Distanza di un punto dal centro
    public float distanzaCentro(Punto punto){
        float distanzaCentro = (float) Math.sqrt(Math.pow(punto.x - 0, 2) + Math.pow(punto.y - 0, 2));
        return distanzaCentro;
    }
    
    // Distanza tra 2 punti
    public float distanzaPunti(Punto secondoPunto){
        float distanza = (float)Math.sqrt(Math.pow(secondoPunto.x - this.x, 2) + Math.pow(secondoPunto.y - this.y, 2));
        return distanza;
    }
    
    // Stampa della rappresentazione
    @Override
    public String toString(){
        String stringaDaRitornare = nome + "(" + x + ";" + y + ")"; // Metto insieme i dati per vedere il nome la x e la y del punto
        
        return stringaDaRitornare;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public String getNome(){
        return nome;
    }
}