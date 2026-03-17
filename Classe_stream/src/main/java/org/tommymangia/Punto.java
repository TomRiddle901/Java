package org.tommymangia;

public class Punto {
    private double x;
    private double y;
    private String nome;

    public Punto(double x, double y, String nome){
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome + "(" + x + ";" + y + ")";
    }

    public String toCSV(){
        return nome + ";" + x + ";" + y;
    }
}