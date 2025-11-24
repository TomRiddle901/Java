/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tommymangia.triangolo_con_classe_punto;

/**
 *
 * @author tommaso
 */
public class MainProgram {

    public static void main(String[] args) {
        Triangolo triangolo1 = new Triangolo(new Punto(3, 4), new Punto(5, 6), new Punto(7, 8));
        Triangolo triangolo2 = new Triangolo(new Punto(3,5), new Punto(5,0), new Punto(3,2));
        Triangolo triangoloCopia = new Triangolo(triangolo1);
        
        System.out.println("Perimetro del Triangolo 1: " + triangolo1.perimetro());
        System.out.println("Area del Triangolo 1: " + triangolo1.area());
        System.out.println("Perimetro del Triangolo 2: " + triangolo2.perimetro());
        System.out.println("Area del Triangolo 2: " + triangolo2.area());
        System.out.println("Perimetro del Triangolo copia: " + triangoloCopia.perimetro());
        System.out.println("Area del Triangolo copia: " + triangoloCopia.area());
        
        if (triangolo1.equals(triangolo2)){
            System.out.println("Triangolo 1 è uguale al Triangolo 2");
        } else{
            System.out.println("Triangolo 1 è diverso dal Triangolo 2");
        }
        
        if (triangolo1.equals(triangoloCopia)){
            System.out.println("Triangolo 1 è uguale al Triangolo copia");
        } else{
            System.out.println("Triangolo 1 è diverso dal Triangolo copia");
        }
        
        triangolo1.trasla(7, 14);
        triangolo2.trasla(21, 28);
        
        System.out.println("Punti del Triangolo 1:" + triangolo1.toString());
        System.out.println("Punti del Triangolo 2: " + triangolo2.toString());
        System.out.println("Punti del Triangolo copia:" + triangoloCopia.toString());
    }
}
