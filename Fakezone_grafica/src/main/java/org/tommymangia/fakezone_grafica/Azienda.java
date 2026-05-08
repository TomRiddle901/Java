/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tommymangia.fakezone_grafica;

import java.util.ArrayList;

/**
 *
 * @author tommaso
 */
public class Azienda {
    private final String nome = "Fakezone";
    private final String sitoWeb = "www.fakezone.sola";
    private ArrayList<Utente> utenti;

    public Azienda() {
        utenti = new ArrayList<>();
    }
    
    public void addUtente(Utente user){
        utenti.add(user);
    }
}
