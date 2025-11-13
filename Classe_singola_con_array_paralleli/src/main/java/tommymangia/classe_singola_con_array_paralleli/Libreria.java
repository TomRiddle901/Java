/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tommymangia.classe_singola_con_array_paralleli;

/**
 *
 * @author tommaso
 */
public class Libreria {
    // Metodi
    String nome;
    String indirizzo;
    String numeroTelefono;
    String email;
    String[] isbn;
    String[] titolo;
    String[] autori;
    int[] copieDisponibili;
    
    // Costruttori
    public Libreria(){
        this.nome = "Libreria Default";
        this.indirizzo = "Via Classe Java 20/J";
        this.numeroTelefono = "1234567890";
        this.email = "libreriadefault@librerie.com";
    }
    
    public Libreria(String nome, String indirizzo, String numeroTelefono, String email){
        this.nome=nome;
        this.indirizzo=indirizzo;
        this.numeroTelefono=numeroTelefono;
        this.email=email;
        isbn = new String[100];
        titolo = new String[100];
        autori = new String[100];
        copieDisponibili = new int[100];
    }
    
    public Libreria(Libreria library){
        this.nome=library.nome;
        this.indirizzo=library.indirizzo;
        this.numeroTelefono=library.numeroTelefono;
        this.email=library.email;
        this.isbn=library.isbn.clone();
        this.titolo=library.titolo.clone();
        this.autori=library.autori.clone();
        this.copieDisponibili=library.copieDisponibili.clone();
    }

    // Getter
    public String getIndirizzo() {
        return indirizzo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /* ==================
       Gestione dei libri
       ==================
    */
    
    // Funzione che aggiunge un libro alla libreria
    public void aggiungiLibro(String isbn, String titolo, String autori, int copieDisponibili){
        int riga = rigaLibera();
        if (riga != -1){
            this.isbn[riga] = isbn;
            this.titolo[riga] = titolo;
            this.autori[riga] = autori;
            this.copieDisponibili[riga] = copieDisponibili;
        } else{
            System.out.println("Libreria piena!");
        }
    }
    
    // Funzione che stampa l'intera libreria
    public String stampaLibreria(){
        String stampa = "Libreria: " + nome + "\nIndirizzo Libreria: " + indirizzo + "\nEmail: " + email + "\n";
        
        for (int i = 0; i < isbn.length; i++){
            if (isbn[i] != null){
                stampa += "ISBN: " + isbn[i] + ", Titolo: " + titolo[i] + ", Autori: " + autori[i] + ", Copie Disponibili: " + copieDisponibili[i] + "\n";
            }
        }
        return stampa;
    }
    
    // Funzione per la ricerca del libro all'interno della libreria
    public String ricercaLibro(String isbn){
        for (int i = 0; i < this.isbn.length; i++){
            if (this.isbn[i] != null && this.isbn[i].equals(isbn)){
                return "Titolo: " + titolo[i] + ", Autori: " + autori[i] + ", Copie Disponibili: " + copieDisponibili[i];
            }
        }
        return "Libro non trovato!";
    }
    
    // Funzione per aggiornare le copie rimanenti di ogni libro
    public boolean aggiornaCopie(String[] isbn, int copie){
        for (int i = 0; i < isbn.length; i++){
            if (this.isbn[i] != null && this.isbn.equals(isbn)){
                copieDisponibili = copie;
                return true;
            }
        }
        return false;
    }
    
    /* ================================
       Contatori per scorrere i vettori
       ================================
    */ 
    
    // Scorri la libreria per vedere quale posto è libero
    private int rigaLibera(){
        for (int i = 0; i < isbn.length; i++){
            if (isbn[i] == null){
                return i;
            }
        }
        return -1;
    }
}