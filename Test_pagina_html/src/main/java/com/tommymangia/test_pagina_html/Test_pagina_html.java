/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tommymangia.test_pagina_html;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tommaso
 */
public class Test_pagina_html {

    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("test.html"))){
            String html = "<DOCTYPE html>\n"
                    + "<html>\n"
                    + " <head>\n"
                    + "     <meta charset=\"UTF-8\">\n"
                    + "     <meta name=\"viewport\" content=\"width=devicde-width, initial-scale=1\">"
                    + "     <title>Test scrittura pagina HTML</title>\n"
                    + "     <link rel=\"stylesheet\" href=\"style.css\">"
                    + " </head>\n"
                    + " <body>\n"
                    + "     <h1>Wow funziona</h1>\n"
                    + "     <p>Se vedi questo vuol dire che funziona!</p>\n"
                    + "     <script src=\"script.js\"></script>\n"
                    + " </body>";     
            writer.write(html);
        } catch(IOException e){
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
