package org.tommymangia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProgram {
    public static void main(){
        Punto p1 = new Punto(3.78, 8.67, "A");
        Punto p2 = new Punto(3.21, 67, "B");
        Punto p3 = new Punto(312, 57, "C");
        Punto p4 = new Punto(809, 2319, "D");
        Punto p5 = new Punto(83092, 34780, "E");

//        try{
//            FileWriter f = new FileWriter("out.txt");
//            BufferedWriter bf = new BufferedWriter(f);
//            bf.write(p.toString());
//            bf.close();
//        }catch (IOException ex){
//            System.err.println("Errore input/output: " + ex.getMessage());
//        }
//
      }

    private static void export(Punto p){
        try{

        }catch (IOException ex){
            System.err.println("Errore input/output: " + ex.getMessage());
        }
    }
}