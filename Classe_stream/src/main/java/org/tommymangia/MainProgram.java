package org.tommymangia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProgram {
    public static void main(){
        Punto p = new Punto(3.78, 8.67, "A");
        try{
            FileWriter f = new FileWriter("out.txt");
            BufferedWriter bf = new BufferedWriter(f);
            bf.write(p.toString());
            bf.close();
        }catch (IOException ex){
            System.err.println("Errore input/output: " + ex.getMessage());
        }

    }
}