/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.company.prova1;

/**
 *
 * @author tommaso
 */
public class Persona {
    // attributi
    private static String nome;
    private String cognome;
    
    public Persona(){
        nome = "Pippo";
        cognome = "Pippi";
    }
    
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public Persona(Persona p){
        this.nome = p.nome;
        this.cognome = p.cognome;
    }
    
    public void setCognome(String cognome){
        
    }
    
    public void setNome(String nome){
        
    }
    
    public void getCognome(){
        
    }
    
    public void getNome(){
        
    }
}
