/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.es2_progettazione_classe_singola_con_attributo_vettore;

import java.time.LocalDate;

/**
 *
 * @author tommaso
 */
public class Studente {

    private int matricola;
    private LocalDate dataNascita;
    private String nome;
    private String cognome;
    private char sesso;
    private static float costoOffertaFormativa;
    private float[] valutazioni;

    public Studente(int matricola, String nome, String cognome, LocalDate dataNascita, char sesso) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        valutazioni = new float[20];
    }

    public boolean addVoto(float voto) {
        if (voto > 0 && voto <= 10){
            int posizioneLibera = 0;
            while (posizioneLibera < 20 && valutazioni[posizioneLibera] == 0){
                posizioneLibera++;
            }
            if (posizioneLibera < 20){
                valutazioni[posizioneLibera] =  voto;
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    public float media() {
	float somma = 0;
        int c = 0;
        while (c < 20 && valutazioni[c] != 0){
            somma += valutazioni[c];
            c++;
        }
        
        return somma / c;
    }

	public int numeroValutazioni() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean isMaggiorenne() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setMatricola(int matricola) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getMatricola() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setNome(String nome) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getNome() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setCognome(String cognome) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getCognome() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setDataNascita(LocalDate DataNascita) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public LocalDate getDataNascita() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setSesso(char sesso) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public char getSesso() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static void setCostoOffertaFormativa(float costoOffertaFormativa) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static float getCostoOffertaFormativa() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
}