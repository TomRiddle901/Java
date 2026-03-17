package org.tommymangia;

import java.io.BufferedWriter;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Punto p = new Punto(3.78, 8.67, "A");
        FileWriter f = new FileWriter("out.txt");
        BufferedWriter bf = new BufferedWriter(f);
        bf.write(p.toString());
        bf.close();
    }
}