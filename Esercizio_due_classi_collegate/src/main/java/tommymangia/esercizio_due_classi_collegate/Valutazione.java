/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.esercizio_due_classi_collegate;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Valutazione {
    // Attributi
    private LocalDate data;
    private char tipo;
    private String materia;
    private double punteggio;
    
    // Costruttori
    public Valutazione(){
       data = LocalDate.now();
       tipo = 'S';
       materia = "Materia default";
       punteggio = 9.99;
    }
    
    public Valutazione(LocalDate data, char tipo, String materia, double punteggio){
        this.data = data;
        this.tipo = tipo;
        this.materia = materia;
        this.punteggio = punteggio;
    }
    
    public Valutazione(Valutazione v){
        this.data = v.data;
        this.materia = v.materia;
        this.tipo = v.tipo;
        this.punteggio = v.punteggio;
    }
}
